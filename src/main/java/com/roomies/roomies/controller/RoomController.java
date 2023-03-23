package com.roomies.roomies.controller;

import com.roomies.roomies.entity.Room;
import com.roomies.roomies.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/rooms")
    public String showRooms(Model model){
        List<Room> rooms = roomService.findAllRooms();
        model.addAttribute("rooms", rooms);
        return "Rooms";
    }

    @GetMapping("/roomForm")
    public String showRoomForm(Model model){
        model.addAttribute("room", new Room());
        return "roomform";
    }

    @PostMapping("/saveRoom")
    public String saveRoom(@ModelAttribute("room")Room room){
        roomService.createRoom(room);

        return "redirect:rooms";
    }
}
