package com.example.firstlinux.controller;

import com.example.firstlinux.entity.PersonDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@ResponseBody
public class FirstController {
    @PostMapping("/test")
    public String test(@RequestBody PersonDO personDO) {
        return "hello world!";
    }
}
