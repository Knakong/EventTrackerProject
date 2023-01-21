package com.skilldistillery.peaktime.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.peaktime.entities.Event;
import com.skilldistillery.peaktime.repositories.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepo;

	@Override
	public List<Event> allEvents() {
		
		return eventRepo.findAll();
	}

	@Override
	public Event findById(int id) {
		
		return null;
	}

	@Override
	public Event findBySearch(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event create(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event update(int id, Event even) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
