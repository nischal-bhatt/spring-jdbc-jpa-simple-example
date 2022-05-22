package com.javatechie.spring.mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket,Integer>{

}
