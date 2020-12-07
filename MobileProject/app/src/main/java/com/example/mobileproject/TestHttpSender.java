package com.example.mobileproject;

import com.squareup.okhttp.FormEncodingBuilder;

public class TestHttpSender extends HttpSender {

    public TestHttpSender(){
        apiName = "test";
    }

    public void setBodyContents(Object ... Params){
        body = new FormEncodingBuilder().add("name", (String) Params[0]).build();
    }
}
