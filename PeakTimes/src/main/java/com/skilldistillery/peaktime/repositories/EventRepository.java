package com.skilldistillery.peaktime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.peaktime.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
