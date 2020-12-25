package com.ticoyk.sfgpetclinicdata.service;

import java.util.Set;

import com.ticoyk.sfgpetclinicdata.model.Veterinary;

public interface VeterinaryService {

    public Veterinary findById(Long id);

    public Veterinary save(Veterinary veterinary);

    public Set<Veterinary> findAll();
    
}
