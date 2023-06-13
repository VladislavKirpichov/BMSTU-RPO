package ru.iu3.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "paintings")
@Access(AccessType.FIELD)
public class Painting {

    public Painting() { }
    public Painting(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public long id;

    @Column(name = "name", nullable = false, unique = true)
    public String name;

    @Column(name = "year")
    public int year;

    @ManyToOne()
    @JoinColumn(name = "museumid")
    public Museum museum;

    @ManyToOne()
    @JoinColumn(name = "artistid")
    public Artist artist;
}