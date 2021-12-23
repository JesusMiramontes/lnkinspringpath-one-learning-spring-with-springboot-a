package com.miramontes.one.linkin.becomespringdev.data.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
@Data
public class Room {
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME ")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String number;

    @Column(name = "BED_INFO")
    private String bedInfo;
}
