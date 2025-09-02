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

    public RoomType addRoomType(String typeName, Double price) {
        RoomType roomType = new RoomType();
        roomType.setId(1L); // ID will be auto-generated
        roomType.setTypeName(typeName);
        roomType.setPrice(price);
        return roomTypeRepository.save(roomType);
    }
}
