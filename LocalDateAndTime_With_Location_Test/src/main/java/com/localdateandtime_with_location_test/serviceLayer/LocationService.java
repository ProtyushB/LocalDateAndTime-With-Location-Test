package com.localdateandtime_with_location_test.serviceLayer;

import com.localdateandtime_with_location_test.model.Location;

public interface LocationService {
    Location addLocation(Location location);
    Location updateLocation(Location location);
    Location viewLocation(Long locationId);
    String deleteLOcation(Long locationId);
}
