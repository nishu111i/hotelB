package com.hotel.rooms;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class roomService {

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Autowired
    private RoomBookingRepository roomBookingRepository;

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

    public RoomBooking addBooking(Long roomId, LocalDate fromDate, LocalDate toDate) {
        totRooms rooms = new totRooms();

            RoomBooking booking = new RoomBooking();
            booking.setBooking_id(UUID.randomUUID()); // Generate UUID here
            booking.setRoom_id(roomId);
            booking.setFrom_date(fromDate);
            booking.setTo_date(toDate);

            // Calculate total booking days
            long totalBookingDays = java.time.temporal.ChronoUnit.DAYS.between(fromDate, toDate);
            System.out.println("Total booking days: " + totalBookingDays);
        int totRoom = rooms.getAvailableRooms(); // Get available rooms
        if (totRoom > 1) {
            RoomBooking savedBooking = roomBookingRepository.save(booking);

            // After successful save, increment roominuse
            rooms.incrementRoomInUse();

            return savedBooking;
        } else {
            // Not enough rooms available
            return null;
        }
    }
}
