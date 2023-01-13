package com.localdateandtime_with_location_test.controller;

import com.localdateandtime_with_location_test.model.Location;
import com.localdateandtime_with_location_test.serviceLayer.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/")
    public ResponseEntity<Location> addLocation(@RequestBody Location location){
        return new ResponseEntity<>(locationService.addLocation(location), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Location> updateLocation(@RequestBody Location location){
        return new ResponseEntity<>(locationService.updateLocation(location), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Location> viewLocation(@PathVariable("id") Long locationId){
        return new ResponseEntity<>(locationService.viewLocation(locationId), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLocation(@PathVariable("id") Long locationId){
        return new ResponseEntity<>(locationService.deleteLOcation(locationId), HttpStatus.OK);
    }

}
