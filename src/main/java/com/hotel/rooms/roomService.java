package com.hotel.rooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class roomService {

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    public int getTotalRooms() {
        return 50;
    }

    public RoomType addRoomType(String room_name, Double price, Long room_id) {
        RoomType roomType = new RoomType();
        roomType.setId(room_id); // ID will be auto-generated
        roomType.setRoomName(room_name);
        roomType.setPrice(price);
        return roomTypeRepository.save(roomType);
    }

    public Iterable<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }
}
