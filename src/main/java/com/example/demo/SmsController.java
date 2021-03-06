package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class SmsController {

    public final Service service;
    @Autowired
    public SmsController(Service service){
        this.service = service;
    }

    @PostMapping
    public void SendSms(@Valid @RequestBody SmsRequest smsRequest){
        service.sendSms(smsRequest);
    }

}
