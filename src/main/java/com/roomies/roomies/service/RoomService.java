package com.roomies.roomies.service;

import com.roomies.roomies.entity.Room;
import com.roomies.roomies.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomService {

    @Autowired
    RoomRepository roomRepository;


    public void createRoom(Room room){
        roomRepository.save(room);
    }

    public List<Room> findAllRooms (){
        return roomRepository.findAll();
    }
}
