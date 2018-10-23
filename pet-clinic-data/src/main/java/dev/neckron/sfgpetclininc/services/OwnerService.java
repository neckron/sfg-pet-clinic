package dev.neckron.sfgpetclininc.services;

import dev.neckron.sfgpetclininc.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
