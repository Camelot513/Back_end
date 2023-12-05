package com.lw.practice.controllers;
import org.springframework.web.bind.annotation.*;
import com.lw.practice.models.postpractice1;
import com.lw.practice.models.responepractice1;


@RestController
public class practice1Controller {

    @PostMapping("/calculate")
    public responepractice1 calculate(@RequestBody postpractice1 requestdata) {

        int result = requestdata.getA() + requestdata.getB();
        return new responepractice1(result);
    }
}
