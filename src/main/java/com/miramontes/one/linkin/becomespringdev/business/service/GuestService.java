package com.miramontes.one.linkin.becomespringdev.business.service;

import com.miramontes.one.linkin.becomespringdev.data.entities.Guest;
import com.miramontes.one.linkin.becomespringdev.data.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    @Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getGuestByLastNameSortedByLastName(String lastName){
        List<Guest> guests = guestRepository.findGuestsByLastName(lastName);
        return sortedByLastName(guests);
    }

    public List<Guest> getAllGuests(){
        List<Guest> guests = (List<Guest>) guestRepository.findAll();
        return sortedByLastName(guests);
    }

    public List<Guest> sortedByLastName(List<Guest> list){
        list.sort(Comparator.comparing(Guest::getLastName));
        return list;
    }
}
