package com.example.load.controller;

import com.example.load.entity.S3MDataLoadFrame1;
import com.example.load.mapper.S3MDataLoadFrame1Mapper;
import com.example.load.mapper.S3MDataLoadFrame2Mapper;
import com.example.load.message.ConvertMessage;
import com.example.load.mqtt.MqttConfig;
import com.example.load.request.RequestMessageFrame1AndFrame2;
import com.example.load.request.S3MDataLoadFrame1Request;
import com.example.load.request.S3MDataLoadFrame2Request;
import com.example.load.responses.S3MDataLoadFrame1Response;
import com.example.load.responses.S3MDataLoadFrame2Response;
import com.example.load.service.S3MDataLoadFrame1Service;
import com.example.load.service.S3MDataLoadFrame2Service;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin("*")
public class MainController {
    @Autowired
    private S3MDataLoadFrame1Service s3MDataLoadFrame1Service;
    @Autowired
    S3MDataLoadFrame2Service s3MDataLoadFrame2Service;

    @PostMapping("/insert")
    public S3MDataLoadFrame1Response insert1(@Valid @RequestBody S3MDataLoadFrame1Request request) throws MqttException {
        return new S3MDataLoadFrame1Response(S3MDataLoadFrame1Mapper.toDTO(this.s3MDataLoadFrame1Service.insert(request)));
    }
    @PostMapping("/insert1")
    public S3MDataLoadFrame2Response insert2(@RequestBody S3MDataLoadFrame2Request request) throws MqttException {
        return new S3MDataLoadFrame2Response(S3MDataLoadFrame2Mapper.toDTO(this.s3MDataLoadFrame2Service.insert(request)));
    }
    @GetMapping("view-data")
    public S3MDataLoadFrame1Response getAllData() {
        return new S3MDataLoadFrame1Response(S3MDataLoadFrame1Mapper.toListDTO(this.s3MDataLoadFrame1Service.getData()));
    }

    @Autowired
    private MqttConfig mqttService;

    @PostMapping("/send-message")
    public String publish(@RequestBody RequestMessageFrame1AndFrame2 request) throws MqttException {
        if(request.getFrame1Request() != null && request.getFrame2Request() == null) {
            String message = ConvertMessage.messageFrame1(S3MDataLoadFrame1Mapper.toEntity(request.getFrame1Request()));
            mqttService.publish(mqttService.getDefaultTopic(), message);
            return "Message sent: " + message;
        }
        if(request.getFrame1Request() == null && request.getFrame2Request() != null) {
            String message = ConvertMessage.messageFrame2(S3MDataLoadFrame2Mapper.toEntity(request.getFrame2Request()));
            mqttService.publish(mqttService.getDefaultTopic(), message);
            return "Message sent: " + message;
        }
        return "No mes";
    }


}
