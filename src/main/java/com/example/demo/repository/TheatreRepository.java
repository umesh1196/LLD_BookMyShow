package com.example.demo.repository;

import com.example.demo.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheatreRepository extends JpaRepository<Theatre,Long> {

    Theatre save(Theatre theatre);

    List<Theatre> findAll();

    Theatre findByTheatreName(String theatreName);
}
