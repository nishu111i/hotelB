package com.hotel.rooms;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class totRoomsController {
    @PostMapping("/total")
    public ResponseEntity<String> getTotalRooms() {
       // return new totRooms();
      //  Response response = new Response();
       // response.setStatus(200);
totRooms rooms = new totRooms();
Object avlroom = rooms.getAvailableRooms();
return ResponseEntity.ok(avlroom.toString());
    }   
}
