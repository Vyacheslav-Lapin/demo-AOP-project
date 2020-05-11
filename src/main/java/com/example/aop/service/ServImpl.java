package com.example.aop.service;

import com.example.aop.aspect.MyAnno;
import org.springframework.stereotype.Service;

@Service
public class ServImpl{

    @MyAnno
    public String math(int x) {
        return Integer.toString(x);
    }

}
