package com.miramontes.one.linkin.becomespringdev.data.repositories;

import com.miramontes.one.linkin.becomespringdev.data.entities.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
