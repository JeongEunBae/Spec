package com.specproject.backend.domain;

import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class callDetail {
    public void callDetail(HttpServletRequest request, HttpServletResponse response, @RequestParam String contentId,
                           @RequestParam String contentTypeId) throws Exception {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset = utf-8");

        String addr = 
    }
}
