package com.CRUD.Spring.Boot.Rest.API.with.React.JS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Course {
    @Id
    private long id;
    private String title;
    private String description;



}
