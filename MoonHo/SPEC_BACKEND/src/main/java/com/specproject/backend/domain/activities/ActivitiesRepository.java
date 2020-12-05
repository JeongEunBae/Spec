package com.specproject.backend.domain.activities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface ActivitiesRepository extends JpaRepository<Activities, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM Activities")
    List<Activities> findAllDesc();

}