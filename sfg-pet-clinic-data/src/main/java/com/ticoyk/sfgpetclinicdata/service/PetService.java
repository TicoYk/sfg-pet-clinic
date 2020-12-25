package com.ticoyk.sfgpetclinicdata.service;

import java.util.Set;

import com.ticoyk.sfgpetclinicdata.model.Pet;

public interface PetService {

    public Pet findById(Long id);

    public Pet save(Pet owner);

    public Set<Pet> findAll();
    
}
