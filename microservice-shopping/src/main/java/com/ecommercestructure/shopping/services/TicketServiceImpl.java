package com.ecommercestructure.shopping.services;

import com.ecommercestructure.shopping.entities.Ticket;
import com.ecommercestructure.shopping.persistence.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements ITicketService{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAllTicket() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id).orElseThrow();
    }

    @Override
    public void createTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void bulkCreate(List<Ticket> tickets) {
        ticketRepository.saveAll(tickets);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
