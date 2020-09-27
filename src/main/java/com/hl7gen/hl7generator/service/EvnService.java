package com.hl7gen.hl7generator.service;

import com.hl7gen.hl7generator.model.Evn;
import com.hl7gen.hl7generator.repo.EvnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EvnService {

    private final EvnRepo evnRepo;
    @Autowired
    public EvnService(EvnRepo evnRepo) {
        this.evnRepo = evnRepo;
    }

    public List<Evn> getEvn(){
        return evnRepo.findAll();
    }

    public Evn addEvn(Evn evn){
        return evnRepo.save(evn);
    }

    public Evn updateEvn(Evn evn){
        return evnRepo.save(evn);
    }
}
