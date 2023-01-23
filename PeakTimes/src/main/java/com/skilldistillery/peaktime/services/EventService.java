package com.skilldistillery.peaktime.services;

import java.util.List;

import com.skilldistillery.peaktime.entities.Event;

public interface EventService {
	List<Event> allEvents();

	Event findById(int id);

	List<Event> findBySearch(String keyword);

	Event create(Event event);

	Event update(int id, Event event);
	boolean existById(int id);

	boolean deleteById(int id);

}
