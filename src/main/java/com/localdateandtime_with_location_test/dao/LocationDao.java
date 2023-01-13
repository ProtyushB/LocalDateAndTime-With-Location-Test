package com.localdateandtime_with_location_test.dao;

import com.localdateandtime_with_location_test.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDao extends JpaRepository<Location, Long> {
}
