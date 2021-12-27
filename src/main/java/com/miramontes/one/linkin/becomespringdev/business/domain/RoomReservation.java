package com.miramontes.one.linkin.becomespringdev.business.domain;

import lombok.Data;

import java.util.Date;

@Data
// This class is only a DTL.
public class RoomReservation {
    private Long id;
    private Long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;
}
