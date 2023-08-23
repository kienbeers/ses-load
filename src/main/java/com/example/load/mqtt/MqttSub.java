package com.example.load.mqtt;

import com.example.load.entity.PKS3DataLoadFrame1;
import com.example.load.request.S3MDataLoadFrame1Request;
import com.example.load.request.S3MDataLoadFrame2Request;
import com.example.load.service.S3MDataLoadFrame1Service;
import com.example.load.service.S3MDataLoadFrame2Service;
import org.eclipse.paho.client.mqttv3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MqttSub {
    @Autowired
    S3MDataLoadFrame1Service service;

    @Autowired
    S3MDataLoadFrame2Service service2;
    private String brokerUrl;

    private String clientId;

    private String username;

    private String password;

    private String defaultTopic;

    private MqttClient mqttClient;

    public MqttSub(String brokerUrl, String clientId, String username, String password, String defaultTopic) {
        this.brokerUrl = brokerUrl;
        this.clientId = clientId;
        this.username = username;
        this.password = password;
        this.defaultTopic = defaultTopic;
    }

    public void connect() throws MqttException {
        mqttClient = new MqttClient(brokerUrl, clientId);
        MqttConnectOptions options = new MqttConnectOptions();
        if (!username.isEmpty()) {
            options.setUserName(username);
            options.setPassword(password.toCharArray());
        }
        mqttClient.connect(options);
        mqttClient.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {

            }

            @Override
            public void messageArrived(String topic, MqttMessage message1) throws Exception {
                // Xử lý message gửi về;
                String mes = new String(message1.getPayload());
                System.out.println("Recive" + mes);
                String regex1 = "\\@\\d+\\*\\d+\\*\\d+\\*\\d+/\\d+/\\d+\\s\\d+\\:\\d+\\:\\d+\\*\\d+\\*\\d+\\*\\S+";
                String regex2 = "\\@\\[\\d+\\*\\d+\\*\\d+\\*\\d+\\*\\d+\\*\\d+\\*\\d+\\.\\d+\\.\\d+\\.\\d+\\*\\d+\\]\\*\\d" +
                        "+\\/\\d+\\/\\d+\\s\\d+\\:\\d+\\:\\d+\\*\\d+\\*\\d+\\*\\S+";
                if (mes.matches(regex1) == true) {
                    List<List<String>> result = extractCharacters(new String(message1.getPayload()));
                    List<String> elements = extractElements(mes);
                    service.insert(setRequestS3MDataLoadFrame1(result, elements));
                }
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });
        subscribe(defaultTopic);
    }
    public String getDefaultTopic() {
        return defaultTopic;
    }
    public void setDefaultTopic(String defaultTopic) {
        this.defaultTopic = defaultTopic;
    }
    public void subscribe(String topic) throws MqttException {
        mqttClient.subscribe(topic, (topic1, message) -> {
            System.out.println("mesage" + new String(message.getPayload()));
            String mes = new String(message.getPayload());
            String regex1 = "\\@\\d+\\*\\d+\\*\\d+\\*\\d+/\\d+/\\d+\\s\\d+\\:\\d+\\:\\d+\\*\\d+\\*\\d+\\*\\S+";
            String regex2 = "\\@\\[\\d+\\*\\d+\\*\\d+\\*\\d+\\*\\d+\\*\\d+\\*\\d+\\.\\d+\\.\\d+\\.\\d+\\*\\d+\\]\\*\\d" +
                    "+\\/\\d+\\/\\d+\\s\\d+\\:\\d+\\:\\d+\\*\\d+\\*\\d+\\*\\S+";
            if (mes.matches(regex1) == true) {
                List<List<String>> result = extractCharacters(new String(message.getPayload()));
                List<String> elements = extractElements(mes);
                service.insert(setRequestS3MDataLoadFrame1(result, elements));
            }
        });
    }

    public S3MDataLoadFrame1Request setRequestS3MDataLoadFrame1(List<List<String>> str, List<String> str2) throws ParseException {
        if(str.size() <=0) {
            System.out.println("Mảng rỗng");
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date date = sdf.parse(str2.get(3));
        S3MDataLoadFrame1Request request = new S3MDataLoadFrame1Request();
        request.setUab(Double.valueOf(str.get(0).get(0)));
        request.setUbc(Double.valueOf(str.get(0).get(1)));
        request.setUca(Double.valueOf(str.get(0).get(2)));

        request.setUll(Double.valueOf(str.get(1).get(0)));
        request.setUan(Double.valueOf(str.get(1).get(1)));
        request.setUbn(Double.valueOf(str.get(1).get(2)));
        request.setUcn(Double.valueOf(str.get(1).get(3)));
        request.setUln(Double.valueOf(str.get(1).get(4)));

        request.setIa(Double.valueOf(str.get(2).get(0)));
        request.setIb(Double.valueOf(str.get(2).get(1)));
        request.setIc(Double.valueOf(str.get(2).get(2)));
        request.setIn(Double.valueOf(str.get(2).get(3)));
        request.setIg(Double.valueOf(str.get(2).get(4)));
        request.setIavg(Double.valueOf(str.get(2).get(5)));

        request.setPa(Double.valueOf(str.get(3).get(0)));
        request.setPb(Double.valueOf(str.get(3).get(1)));
        request.setPc(Double.valueOf(str.get(3).get(2)));
//        request.setpTotal(Double.valueOf(str.get(3).get(3)));

        request.setQa(Double.valueOf(str.get(4).get(0)));
        request.setQb(Double.valueOf(str.get(4).get(1)));
        request.setQc(Double.valueOf(str.get(4).get(2)));
//        request.setqTotal(Double.valueOf(str.get(4).get(3)));

        request.setSa(Double.valueOf(str.get(5).get(0)));
        request.setSb(Double.valueOf(str.get(5).get(1)));
        request.setSc(Double.valueOf(str.get(5).get(2)));
//        request.setsTotal(Double.valueOf(str.get(5).get(3)));

        request.setPfa(Double.valueOf(str.get(6).get(0)));
        request.setPfb(Double.valueOf(str.get(6).get(1)));
        request.setPfc(Double.valueOf(str.get(6).get(2)));
        request.setPfavg(Double.valueOf(str.get(6).get(3)));

        request.setEp(Integer.valueOf(str.get(7).get(0)));
        request.setEpR(Integer.valueOf(str.get(7).get(1)));
        request.setEpDr(Integer.valueOf(str.get(7).get(2)));
        request.setEpDrr(Integer.valueOf(str.get(7).get(3)));

        request.setEq(Integer.valueOf(str.get(8).get(0)));
        request.setEqR(Integer.valueOf(str.get(8).get(1)));
        request.setEqDr(Integer.valueOf(str.get(8).get(2)));
        request.setEqDrr(Integer.valueOf(str.get(8).get(3)));

//        request.setEs(Integer.valueOf(str.get(9).get(0)));
//        request.setEsR(Integer.valueOf(str.get(9).get(1)));
//        request.setEsDr(Integer.valueOf(str.get(9).get(2)));
//        request.setEsDrr(Integer.valueOf(str.get(9).get(3)));

        request.setT1(Double.valueOf(str.get(10).get(0)));
        request.setT2(Double.valueOf(str.get(10).get(1)));
        request.setT3(Double.valueOf(str.get(10).get(2)));

//        request.setCommandData1(Integer.valueOf(str.get(11).get(0)));
//        request.setCommandData2(Integer.valueOf(str.get(11).get(1)));
//        request.setCommandData3(Integer.valueOf(str.get(11).get(2)));
//        request.setCommandData4(Integer.valueOf(str.get(11).get(3)));
//        request.setCommandData5(Integer.valueOf(str.get(11).get(4)));
//        request.setCommandData6(Integer.valueOf(str.get(11).get(5)));

        request.setThdIa(Double.valueOf(str.get(12).get(0)));
        request.setThdIb(Double.valueOf(str.get(12).get(1)));
        request.setThdIc(Double.valueOf(str.get(12).get(2)));
        request.setThdIg(Double.valueOf(str.get(12).get(3)));
        request.setThdIn(Double.valueOf(str.get(12).get(4)));

//        request.setThdVab(Double.valueOf(str.get(13).get(0)));
//        request.setThdVbc(Double.valueOf(str.get(13).get(1)));
//        request.setThdVca(Double.valueOf(str.get(13).get(2)));
//        request.setThdVll(Double.valueOf(str.get(13).get(3)));
//        request.setThdVan(Double.valueOf(str.get(13).get(4)));
//        request.setThdVbn(Double.valueOf(str.get(13).get(5)));
//        request.setThdVcn(Double.valueOf(str.get(13).get(6)));
//        request.setThdVln(Double.valueOf(str.get(13).get(7)));
//        request.setF(Double.valueOf(str2.get(6)));
        request.setId(new PKS3DataLoadFrame1(new Random().nextLong(), new Long(date.getTime() / 1000)));
        request.setDeviceId(123l);
        request.setSentDate(new Timestamp(date.getTime()));
        return request;
    }

    //
    public void publish(String topic, String payload) throws MqttException {
        MqttMessage message = new MqttMessage(payload.getBytes());
        mqttClient.publish(topic, message);
    }


    public void disconnect() throws MqttException {
        mqttClient.disconnect();
    }

    public static List<List<String>> extractCharacters(String input) {
        List<List<String>> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String group = matcher.group(1);
            String[] items = group.split(",");
            List<String> itemList = new ArrayList<>();
            for (String item : items) {
                if (item.equals("-")) {
                    itemList.add("0");
                } else {
                    itemList.add(item);
                }

            }

            result.add(itemList);
        }

        return result;
    }

    public static List<String> extractElements(String input) {
        String[] tokens = input.split("\\*");
        List<String> elements = new ArrayList<>();

        for (String token : tokens) {
            String trimmedToken = token.trim();
            if (!trimmedToken.isEmpty() && !trimmedToken.startsWith("(")) {
                elements.add(trimmedToken);
            }
        }

        return elements;
    }

}
