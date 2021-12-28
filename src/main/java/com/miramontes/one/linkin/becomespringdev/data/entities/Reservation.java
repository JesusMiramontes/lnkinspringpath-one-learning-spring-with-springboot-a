package com.miramontes.one.linkin.becomespringdev.data.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
@Data
public class Reservation {
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;

    @Column(name = "ROOM_ID")
    private Long roomId;

    @Column(name = "GUEST_ID")
    private Long guestId;

    @Column(name = "RES_DATE")
    private Date reservationDate;
}
