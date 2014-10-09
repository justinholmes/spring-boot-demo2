package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() throws UnknownHostException {
        return "Hello World from spring boot demo 2: " + Inet4Address.getLocalHost().getHostAddress() + ":" +Inet4Address.getLocalHost().getHostName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
