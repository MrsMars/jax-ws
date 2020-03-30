package com.aoher.app;

import com.aoher.service.impl.HelloWorldServiceImpl;


import javax.xml.ws.Endpoint;

public class ServerApp {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9980/helloworld", new HelloWorldServiceImpl());

    }
}
