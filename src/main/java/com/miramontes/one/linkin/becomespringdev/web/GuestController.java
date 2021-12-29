package com.miramontes.one.linkin.becomespringdev.web;

import com.miramontes.one.linkin.becomespringdev.business.service.GuestService;
import com.miramontes.one.linkin.becomespringdev.data.entities.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public String getGuestsByLastName(@RequestParam(value = "lastName", required = false) String lastName, Model model){
        List<Guest> guests = null;

        if(null == lastName || lastName.isEmpty()){
            guests = guestService.getAllGuests();
        } else{
            guests = guestService.getGuestByLastNameSortedByLastName(lastName);
        }

        model.addAttribute("guests", guests);
        return "guests";
    }
}
