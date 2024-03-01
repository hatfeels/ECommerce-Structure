package com.ecommercestructure.users.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean admin = false;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "tickets_id")
    private List<Long> ticketsId;

}
