package com.ticoyk.sfgpetclinicdata.map;

import java.util.Map;
import java.util.Set;

import com.ticoyk.sfgpetclinicdata.model.Owner;
import com.ticoyk.sfgpetclinicdata.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

    @Override
    public Set<Owner> findAll(){
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object){
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id){
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object){
        super.delete(object);
    }
    
}
