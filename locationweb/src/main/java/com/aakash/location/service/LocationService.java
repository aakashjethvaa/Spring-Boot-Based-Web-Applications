package com.aakash.location.service;

import java.util.List;

import com.aakash.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);
	
	Location updateLocation(Location location);
	
	void deleteLocation(Location location);
	
	Location getLocationById(int id);
	
	List<Location> getAllLocations();
	
}
