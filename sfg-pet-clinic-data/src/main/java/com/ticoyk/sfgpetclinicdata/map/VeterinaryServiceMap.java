package com.ticoyk.sfgpetclinicdata.map;

import java.util.Set;

import com.ticoyk.sfgpetclinicdata.model.Veterinary;
import com.ticoyk.sfgpetclinicdata.service.CrudService;

public class VeterinaryServiceMap extends AbstractMapService<Veterinary, Long> implements CrudService<Veterinary, Long> {
    
    @Override
    public Set<Veterinary> findAll(){
        return super.findAll();
    }

    @Override
    public Veterinary findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Veterinary save(Veterinary object){
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id){
        super.deleteById(id);
    }

    @Override
    public void delete(Veterinary object){
        super.delete(object);
    }
    
}
