package com.miramontes.one.linkin.becomespringdev.data.repositories;

import com.miramontes.one.linkin.becomespringdev.data.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
