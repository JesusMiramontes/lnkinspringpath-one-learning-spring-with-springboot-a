package com.miramontes.one.linkin.becomespringdev.data.repositories;

import com.miramontes.one.linkin.becomespringdev.data.entities.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
