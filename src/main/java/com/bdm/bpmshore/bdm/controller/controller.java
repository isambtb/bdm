package com.bdm.bpmshore.bdm.controller;


import com.bdm.bpmshore.bdm.domain.Document;
import com.bdm.bpmshore.bdm.service.SplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bpmshore/spl")
public class controller {

    @Autowired
    private SplService splService;

    @GetMapping("/all")
    public  Iterable<Document> getAll(){
        return  splService.listAllDocuments();
    }

    @PostMapping("/add")
    public  String addSPl(@RequestBody Document document){
        splService.saveDocument(document);
        System.out.print(document);
        return document.toString();
    }
}
