package com.skilldistillery.peaktime.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.peaktime.entities.Event;
import com.skilldistillery.peaktime.services.EventService;

@RestController
@RequestMapping("api")
public class EventController {

	@Autowired
	private EventService eventService;

	@GetMapping("events")
	public List<Event> listAllEvents() {

		return eventService.allEvents();
	}

	@GetMapping("events/{id}")
	public Event findById(@PathVariable int id, HttpServletResponse resp, HttpServletRequest req)

	{
		Event event;

		try {
			event = eventService.findById(id);

			// resp.addHeader(null, null);
			resp.setStatus(200);

		} catch (Exception e) {
			resp.setStatus(404);
			e.printStackTrace();
			event = null;
		}

		return event;
	}


	@GetMapping("events/search/{keyword}")
	public List<Event> findByKeyword(@PathVariable String keyword, HttpServletRequest req, HttpServletResponse resp){

		return eventService.findBySearch(keyword);


	}

	@PostMapping("events")
	public Event create(@RequestBody Event event, HttpServletResponse resp, HttpServletRequest req) {

		Event newEvent;

		try {
			newEvent = eventService.create(event);
			resp.setStatus(201);
		} catch (Exception e) {
			newEvent = null;
			resp.setStatus(400);
			e.printStackTrace();
		}

		return newEvent;

	}

	@PutMapping("events/{id}")
	public Event update(@PathVariable int id, @RequestBody Event event, HttpServletRequest req,
			HttpServletResponse resp) {

		Event updated;

		if (eventService.existById(id)) {

			try {
				updated = eventService.update(id, event);
				resp.setStatus(201);
			} catch (Exception e) {

				updated = null;
				resp.setStatus(400);

				e.printStackTrace();
			}

		}

		else {
			updated = null;
			resp.setStatus(404);

		}
		return updated;
	}

	@DeleteMapping("events/{id}")
	public void delete(@PathVariable int id, HttpServletRequest req, HttpServletResponse resp) {
		try {
			boolean deleted = eventService.deleteById(id);
			if (deleted) {
				resp.setStatus(201);
			} else {
				resp.setStatus(404);
			}
		}

		catch (Exception e) {
			resp.setStatus(400);
			e.printStackTrace();
		}
	}

}
