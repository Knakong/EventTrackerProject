package com.skilldistillery.peaktime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.peaktime.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

List<Event> findByNameLike(String keyword);
}
