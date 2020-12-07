package com.specproject.backend.domain.activities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Long> {

    @Query(nativeQuery = true, value = "SELECT a FROM Activities a ORDER BY a.click_count DESC")
    List<Activities> findAllDesc();

    @Query(nativeQuery = true, value = "SELECT a FROM Activities a WHERE a.act_name LIKE %:keyword% OR a.contents LIKE %:keyword%")
    List<Activities> findActNameORContents(@Param("keyword") String keyword);

    @Query(nativeQuery = true, value = "SELECT a FROM Activities a WHERE a.tag LIKE %:tag%")
    List<Activities> findTag(@Param("tag") String tag);
}
