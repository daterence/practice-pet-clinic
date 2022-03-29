package com.example.practicepetclinic.services;

import com.example.practicepetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
