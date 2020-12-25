package com.ticoyk.sfgpetclinicdata.service;

import java.util.Set;

import com.ticoyk.sfgpetclinicdata.model.Owner;

public interface OwnerService {

    public Owner findByLastName(String lastName);

    public Owner findById(Long id);

    public Owner save(Owner owner);

    public Set<Owner> findAll();
    
}
