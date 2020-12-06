package com.specproject.backend.service.activities;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class ApiService {
    private String WEVITY_URL = "https://www.wevity.com/?c=find&s=1&gub=1&cidx=";

    @PostConstruct
    public void getActivitiesData() throws IOException {
        int categoryId=19, randomId=46879;
        String URL = WEVITY_URL + categoryId + "&gbn=viewok&gp=1&ix=" + randomId;

        //Document doc = Jsoup.connect(URL).get();
        //System.out.println(doc.html());
    }
}
