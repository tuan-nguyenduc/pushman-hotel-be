package com.tuannd.pushmanhotelbackend.repository;

import com.tuannd.pushmanhotelbackend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
