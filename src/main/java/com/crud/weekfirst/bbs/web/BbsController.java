package com.crud.weekfirst.bbs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbsController {

    @GetMapping("/bbs")
    public String bbsGetMapping(){

        return "ㅎㅇㅎㅇ";
    }


}
