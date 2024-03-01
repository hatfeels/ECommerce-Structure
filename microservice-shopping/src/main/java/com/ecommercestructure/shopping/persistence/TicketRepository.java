package com.ecommercestructure.shopping.persistence;

import com.ecommercestructure.shopping.entities.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
