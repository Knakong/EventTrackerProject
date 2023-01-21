package com.skilldistillery.peaktime.services;

import java.util.List;

import com.skilldistillery.peaktime.entities.Event;

public interface EventService {
	List<Event> allEvents();

	Event findById(int id);

	Event findBySearch(String keyword);

	Event create(Event event);

	Event update(int id, Event even);


	boolean deleteById(int id);

}
