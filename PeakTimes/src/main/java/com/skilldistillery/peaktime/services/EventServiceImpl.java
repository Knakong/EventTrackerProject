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

		return eventRepo.findById(id).get();
	}

	@Override
	public List<Event> findBySearch(String keyword) {

		return eventRepo.findByTitleLike("%" + keyword + "%");

	}

	@Override
	public Event create(Event event) {
		
	
		Event newEvent = eventRepo.saveAndFlush(event);
	return newEvent;
	}

	@Override
	public Event update(int id, Event event) {
		Event updated = eventRepo.findById(id).get();

		updated.setTitle(event.getTitle());

		return eventRepo.saveAndFlush(updated);
	}

	@Override
	public boolean deleteById(int id) {
		boolean deleted = false;

		eventRepo.deleteById(id);
		if (!eventRepo.existsById(id)) {
			deleted = true;
		}

		return deleted;
	}

	@Override
	public boolean existById(int id) {
		return eventRepo.existsById(id);
	}

}
