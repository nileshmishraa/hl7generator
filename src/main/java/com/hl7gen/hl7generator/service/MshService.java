package com.hl7gen.hl7generator.service;

import com.hl7gen.hl7generator.model.Msh;
import com.hl7gen.hl7generator.repo.MshRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MshService {

    private final MshRepo mshRepo;

    @Autowired
    public MshService(MshRepo mshRepo) {
        this.mshRepo = mshRepo;
    }

    public List<Msh> getMsh(){
        return mshRepo.findAll();
    }

    public Msh addField(Msh msh){
        return mshRepo.save(msh);
    }
}
