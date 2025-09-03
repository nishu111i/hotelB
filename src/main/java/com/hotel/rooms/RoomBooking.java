package com.hotel.rooms;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_booking")
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long booking_id;

    private Long room_id;
    private LocalDate from_date;
    private LocalDate to_date;

    // Getters and setters
    public Long getBooking_id() { return booking_id; }
    public void setBooking_id(Long booking_id) { this.booking_id = booking_id; }

    public Long getRoom_id() { return room_id; }
    public void setRoom_id(Long room_id) { this.room_id = room_id; }

    public LocalDate getFrom_date() { return from_date; }
    public void setFrom_date(LocalDate from_date) { this.from_date = from_date; }

    public LocalDate getTo_date() { return to_date; }
    public void setTo_date(LocalDate to_date) { this.to_date = to_date; }
}