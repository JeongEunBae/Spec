package com.specproject.backend.service.activities;

import lombok.NoArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.annotation.PostConstruct;

@NoArgsConstructor
public class APIService {

    @PostConstruct
    public String crawling() throws Exception {
        String url = "https://www.wevity.com/?c=find&s=1&gbn=viewok&gp=1&ix=46995";
        System.out.println("url : " + url);

        Document doc = Jsoup.connect(url).get();

        Elements element = doc.select("div.contest-detail");
        String title = element.select("h6").text();

        System.out.println(title);

        for(Element el : element.select("li")) {
            System.out.println(el.text());
        }

        return "{\"l\":\"l\"}";
    }

}
