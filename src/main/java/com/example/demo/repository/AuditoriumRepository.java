package com.example.demo.repository;

import com.example.demo.models.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AuditoriumRepository extends JpaRepository<Auditorium,Long> {

    @Modifying
    @Query("Delete from Auditorium a where a.auditoriumNo = :auditoriumNo" )
    void deleteAuditoriumByAuditoriumNo(String auditoriumNo);
}
