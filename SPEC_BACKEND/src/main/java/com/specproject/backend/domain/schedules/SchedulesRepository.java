package com.specproject.backend.domain.schedules;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface SchedulesRepository extends JpaRepository<Schedules, Long> {
    List<Schedules>findAll();

    @Query(value = "SELECT s FROM Schedules s WHERE s.title LIKE %:title%")
    List<Schedules> findTitle(@Param("title") String title);

    @Query(value = "SELECT s FROM Schedules s WHERE s.start_date = :date OR s.end_date = :date")
    List<Schedules> findDate(@Param("date") String date);

    @Query(value = "SELECT s FROM Schedules s WHERE s.memo LIKE %:memo%")
    List<Schedules> findMemo(@Param("memo") String memo);
}
