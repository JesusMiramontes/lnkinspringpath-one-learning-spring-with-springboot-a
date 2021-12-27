package com.miramontes.one.linkin.becomespringdev.business.service;

import com.miramontes.one.linkin.becomespringdev.business.domain.RoomReservation;
import com.miramontes.one.linkin.becomespringdev.data.repositories.GuestRepository;
import com.miramontes.one.linkin.becomespringdev.data.repositories.ReservationRepository;
import com.miramontes.one.linkin.becomespringdev.data.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationsForDate(Date date){
        return null;
    }
}
