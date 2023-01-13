package com.localdateandtime_with_location_test.serviceLayer;

import com.localdateandtime_with_location_test.dao.LocationDao;
import com.localdateandtime_with_location_test.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationDao locationDao;


    @Override
    public Location addLocation(Location location) {
        return locationDao.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationDao.save(location);
    }

    @Override
    public Location viewLocation(Long locationId) {
        Location location = null;

        Optional<Location> optionalLocation = locationDao.findById(locationId);

        if (optionalLocation.isPresent()) location = optionalLocation.get();
        else{
            //Location Not Found
        }
        return location;
    }

    @Override
    public String deleteLOcation(Long locationId) {
        Optional<Location> optionalLocation  = locationDao.findById(locationId);

        if (optionalLocation.isPresent()) locationDao.deleteById(locationId);
        else{
            //Location Not Found
        }
        return "Location Deleted Successfully";
    }
}
