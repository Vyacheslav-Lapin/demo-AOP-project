package com.example.aop.service;

import com.example.aop.aspect.MyAnno;
import org.springframework.stereotype.Component;

@Component
public class Serv2 implements Serv {

    @MyAnno
    @Override
    public String math(int x) {
        return null;
    }
}
