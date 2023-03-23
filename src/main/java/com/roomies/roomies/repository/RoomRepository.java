package com.roomies.roomies.repository;

import com.roomies.roomies.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
