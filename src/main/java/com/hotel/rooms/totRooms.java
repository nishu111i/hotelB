package com.hotel.rooms;

public class totRooms {

    private static int roominuse = 10; // Make static to persist across calls

    public int getAvailableRooms() {
        int totRooms = 100;
        return totRooms - roominuse;
    }

    public void incrementRoomInUse() {
        roominuse++;
    }
}