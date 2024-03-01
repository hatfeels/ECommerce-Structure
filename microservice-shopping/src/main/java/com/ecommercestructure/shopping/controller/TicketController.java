package com.ecommercestructure.shopping.controller;

import com.ecommercestructure.shopping.entities.Ticket;
import com.ecommercestructure.shopping.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    private ITicketService ticketService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTicket(@RequestBody Ticket ticket){
        ticketService.createTicket(ticket);
    }

    @PostMapping("/create/bulk")
    @ResponseStatus(HttpStatus.CREATED)
    public void bulkTickets(@RequestBody List<Ticket> tickets) {
        ticketService.bulkCreate(tickets);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Ticket> findAllTickets (){
        return ticketService.findAllTicket();
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Ticket> findById(@PathVariable Long id){
        return ResponseEntity.ok(ticketService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void deleteTicket (@PathVariable Long id){
        ticketService.deleteTicket(id);
    }
}
