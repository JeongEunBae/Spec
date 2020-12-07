
package com.specproject.backend.domain.schedules;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface SchedulesRepository extends JpaRepository<Schedules, Long>{ // JpaRepository를 상속 시, 기본적으로 CRUD 기능 지원
  List<Schedules> findAll() ;

  @Query(nativeQuery = true, value = "SELECT s FROM Schedules s WHERE s.title LIKE %:title%")
  List<Schedules> findTitle(@Param("title") String title) ;

  @Query(nativeQuery = true, value = "SELECT s FROM Schedules s WHERE s.start_date = :date OR s.end_date = :date")
  List<Schedules> findDate(@Param("date") String date) ;

  @Query(nativeQuery = true, value = "SELECT s FROM Schedules s WHERE s.memo LIKE %:memo%")
  List<Schedules> findMemo(@Param("memo") String memo) ;

}
