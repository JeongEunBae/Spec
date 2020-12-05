package com.specproject.backend.domain.account;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Account {
    @Id // Primary KEY 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", columnDefinition = "VARCHAR")
    private String user_ID;

    @Column(name = "USER_NAME")
    private String user_name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USER_MOBILE")
    private String user_mobile;

    @Column(name = "CATEGORY")
    private String category;


    @Builder
    private Account(String user_ID, String user_name, String password, String user_mobile, String category) {
        this.user_ID = user_ID;
        this.user_name = user_name;
        this.password = password;
        this.user_mobile = user_mobile;
        this.category = category;
    }
}
