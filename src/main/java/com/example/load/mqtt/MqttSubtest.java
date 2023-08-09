package com.example.load.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


public class MqttSubtest implements MqttCallback {
    String serverUrl    = "tcp://localhost:1883";   // your IP
    String clientId     = "my-spring-boot-app";
    String userId       = "kienrang";
    char[] password     = "123456".toCharArray();
    String topic        = "example-topic";
    int qos             = 1;


    MqttClient client;

    public  MqttSubtest()
    {
        try
        {
            MqttConnectOptions conOpts = new MqttConnectOptions();
            conOpts.setCleanSession(true);
            conOpts.setUserName(userId);
            conOpts.setPassword(password);

            client = new MqttClient(serverUrl, clientId, new MemoryPersistence());
            client.setCallback(this);

            // connect
            client.connect(conOpts);

            // subscribe
            client.subscribe(topic, qos);

            System.out.println("connected..");
        }
        catch(MqttException me)
        {
            me.printStackTrace();
        }
    }


    @Override
    public void connectionLost(Throwable arg0) {
        // TODO Auto-generated method stub
        System.out.println(arg0);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("topic   : " + topic);
        System.out.println("message : " + message.getPayload());
    }

}
