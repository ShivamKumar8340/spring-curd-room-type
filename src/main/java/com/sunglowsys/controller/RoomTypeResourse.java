package com.sunglowsys.controller;

import com.sunglowsys.domain.RoomType;
import com.sunglowsys.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomTypeResourse {

    @Autowired
    private RoomTypeService roomTypeService;

    @PostMapping("/roomtypes")
    public RoomType create(@RequestBody RoomType roomType) {
        return roomTypeService.save(roomType);
    }
    @PutMapping("roomTypes/{id}")
    public RoomType update(@RequestBody RoomType roomType,@PathVariable("id") Long id){
        return roomTypeService.update(roomType,id);
    }
    @GetMapping("/roomtypes")
    public List<RoomType> getAll() {
        List<RoomType> roomTypes = roomTypeService.findAll();
        return roomTypes;

    }
    @GetMapping("/roomTypes/{id}")
    public RoomType getById(@PathVariable("id") Long id) {
        return roomTypeService.findById(id);
    }
    @DeleteMapping("/roomtypes/{id}")
  public   void delete(@PathVariable ("id") Long id) {
        roomTypeService.delete(id);
    }
}
