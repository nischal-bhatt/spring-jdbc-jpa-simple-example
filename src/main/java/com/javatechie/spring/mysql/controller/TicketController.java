package com.javatechie.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mysql.dao.TicketDao;
import com.javatechie.spring.mysql.model.Ticket;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketDao dao;

	@PostMapping("/bookticket")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		this.dao.saveAll(tickets);
		return "all done  " + tickets.size();

	}

	@GetMapping("/getTicks")
	public List<Ticket> getTickets()

	{
         return (List<Ticket>) dao.findAll();
	}
}
