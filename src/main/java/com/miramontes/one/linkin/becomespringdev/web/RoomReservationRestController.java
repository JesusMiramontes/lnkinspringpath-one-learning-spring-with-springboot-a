package com.miramontes.one.linkin.becomespringdev.web;

import com.miramontes.one.linkin.becomespringdev.business.domain.RoomReservation;
import com.miramontes.one.linkin.becomespringdev.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/reservations")
public class RoomReservationRestController {

    private final ReservationService reservationService;

    @Autowired
    public RoomReservationRestController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<RoomReservation> getRoomReservations(@RequestParam(name = "date", required = false) String stringDate){
        return this.reservationService.getRoomReservationsForDate(DateUtils.createDateFromDateString(stringDate));
    }
}
