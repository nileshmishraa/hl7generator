package com.hl7gen.hl7generator.controller;

import com.hl7gen.hl7generator.model.Msh;
import com.hl7gen.hl7generator.service.MshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MshController {

    private final MshService mshService;
    @Autowired
    public MshController(MshService mshService) {
        this.mshService = mshService;
    }

    @GetMapping("/msh/all")
    public ResponseEntity<List<Msh>> getMsh(){
        List<Msh> list = mshService.getMsh();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/msh/add")
    public ResponseEntity<Msh> addMsh(@RequestBody Msh msh){
        Msh msh1=mshService.addField(msh);
        return new ResponseEntity<>(msh1, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Msh> updateMsh(@RequestBody Msh msh, @PathVariable("id") String messageControlId){
        Msh msh1 = mshService.updateField(msh);
        return new ResponseEntity<>(msh1, HttpStatus.CREATED);
    }


}
