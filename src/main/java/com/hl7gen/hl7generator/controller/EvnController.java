package com.hl7gen.hl7generator.controller;

import com.hl7gen.hl7generator.model.Evn;
import com.hl7gen.hl7generator.model.Patient;
import com.hl7gen.hl7generator.service.EvnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evn")
public class EvnController {

    private final EvnService evnService;
    @Autowired
    public EvnController(EvnService evnService) {
        this.evnService = evnService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Evn>> getAllEvn() {
        List<Evn> evnList = evnService.getEvn();
        return new ResponseEntity<>(evnList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Evn> addEvn(@RequestBody Evn evn) {
        evnService.addEvn(evn);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Evn> updateEvn(@RequestBody Evn evn, @PathVariable Long id){
        evnService.updateEvn(evn);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
