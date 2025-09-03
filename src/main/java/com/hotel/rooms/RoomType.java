package com.hotel.rooms;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_type")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long room_id;

    @JsonProperty("roomName")
    private String room_name;
    private Double price;

    // Getters and setters
    public Long getId() { return room_id; }
    public void setId(Long room_id) { this.room_id = room_id; }

    public String getRoomName() { return room_name; }
    public void setRoomName(String room_name) { this.room_name = room_name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; 
    }
}