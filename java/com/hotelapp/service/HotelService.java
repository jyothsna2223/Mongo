package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelService {
	List<Hotel> getAllHotels();
	List<Hotel> getByName(String name);
	List<Hotel> getByCity(String city);
	List<Hotel> getByCuisine(String cuisine);

}
