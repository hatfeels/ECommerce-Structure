package com.ecommercestructure.shopping.services;

import com.ecommercestructure.shopping.entities.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITicketService {
    List<Ticket> findAllTicket();

    Ticket findById(Long id);

    void createTicket(Ticket ticket);

    void bulkCreate(List<Ticket> tickets);

    void deleteTicket(Long id);
}
