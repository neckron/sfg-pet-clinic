package dev.neckron.sfgpetclininc.services;

import dev.neckron.sfgpetclininc.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    @Override
    Set<Owner> findAll();

    @Override
    Owner findById(Long aLong);

    @Override
    Owner save(Owner object);

    @Override
    void delete(Owner object);
}
