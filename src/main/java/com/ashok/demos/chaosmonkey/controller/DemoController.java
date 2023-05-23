package com.ashok.demos.chaosmonkey.controller;

import com.ashok.demos.chaosmonkey.model.Chimp;
import com.ashok.demos.chaosmonkey.model.Gorilla;
import com.ashok.demos.chaosmonkey.model.Monkey;
import com.ashok.demos.chaosmonkey.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private DemoService demoService;
    public DemoController(DemoService demoService){
        this.demoService = demoService;
    }

    @GetMapping("/chimps")
    public List<Chimp> getAllChimps(){
        return this. demoService.getAllChimps();
    }

    @GetMapping("/monkeys")
    public List<Monkey> getAllMonkeys(){
        return this. demoService.getAllMonkeys();
    }

    @GetMapping("/gorillas")
    public List<Gorilla> getAllGorillas(){
        return this. demoService.getAllGorillas();
    }

}
