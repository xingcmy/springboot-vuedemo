package com.xingcmy.springbootvuedemo.controller;

import com.xingcmy.springbootvuedemo.entity.Information;
import com.xingcmy.springbootvuedemo.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/information")
public class InformationHandler {

    @Autowired
    private InformationRepository informationRepository;

    @GetMapping("/findAll")
    public List<Information> findAll(){
        return informationRepository.findAll();
    }
}
