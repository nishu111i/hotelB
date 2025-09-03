package com.hotel.rooms;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class totRoomsController {

    private final roomService roomService;

    public totRoomsController(roomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/total")
    public ResponseEntity<String> getTotalRooms() {
       // return new totRooms();
      //  Response response = new Response();
       // response.setStatus(200);
        totRooms rooms = new totRooms();
        Object avlroom = rooms.getAvailableRooms();
        return ResponseEntity.ok(avlroom.toString());
    }   

    @PostMapping("/addRoomType")
    public ResponseEntity<RoomType> addRoomType(@RequestBody RoomType roomType) {
        try {
            String roomName = roomType.getRoomName();
            Double price = roomType.getPrice();
            Long id = roomType.getId();
/* 
            System.out.println("roomType.getId(): " + id);
            System.out.println("roomType.getRoomName(): " + roomName);
            System.out.println("roomType.getPrice(): " + price);
*/
            // Optionally save to DB
             RoomType savedRoomType = roomService.addRoomType(roomName, price, id);

            return ResponseEntity.ok(savedRoomType);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/getRoomTypes")
    public ResponseEntity<Iterable<RoomType>> getRoomTypes() {
        try {
            Iterable<RoomType> roomTypes = roomService.getAllRoomTypes();
            return ResponseEntity.ok(roomTypes);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build(); 
        }
    }
}
