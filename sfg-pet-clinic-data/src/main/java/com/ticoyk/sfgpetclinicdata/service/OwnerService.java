package com.ticoyk.sfgpetclinicdata.service;

import java.util.Set;

import com.ticoyk.sfgpetclinicdata.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    public Owner findByLastName(String lastName);
    
}
