package com.ashok.demos.chaosmonkey.service;

import com.ashok.demos.chaosmonkey.model.Chimp;
import com.ashok.demos.chaosmonkey.model.Gorilla;
import com.ashok.demos.chaosmonkey.model.Monkey;
import com.ashok.demos.chaosmonkey.repository.ChimpRepository;
import com.ashok.demos.chaosmonkey.repository.GorillaRepository;
import com.ashok.demos.chaosmonkey.repository.MonkeyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    private ChimpRepository chimpRepo;
    private GorillaRepository gorillaRepository;
    private MonkeyRepository monkeyRepository;

    public  DemoService(ChimpRepository chimpRepo, GorillaRepository gorillaRepository
                , MonkeyRepository monkeyRepository){
        this.chimpRepo = chimpRepo;
        this.gorillaRepository = gorillaRepository;
        this.monkeyRepository = monkeyRepository;
    }

    public List<Chimp> getAllChimps(){
        return this.chimpRepo.findAll();
    }

    public List<Gorilla> getAllGorillas(){
        return this.gorillaRepository.findAll();
    }

    public List<Monkey> getAllMonkeys(){
        return this.monkeyRepository.findAll();
    }

}
