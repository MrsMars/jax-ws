package com.aoher.service.impl;

import com.aoher.model.TopNews;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloWorldServiceImpl {

    @WebMethod
    public String hello(@WebParam(name = "name") String name) {
        return "Hello " + name + "!";
    }

    @WebMethod
    public TopNews getTopNews() {
        TopNews tn = new TopNews();
        tn.setHighlights("Mary Zheng published an example for Jax-ws tutorial.");
        tn.setTitle("Jax-WS Tutorial is Available");
        return tn;
    }
}
