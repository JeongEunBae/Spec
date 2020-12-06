package com.specproject.backend.domain.activities;

import com.specproject.backend.web.dto.activities.ActApplyResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActApplyRepository extends JpaRepository<ActApply, Long> {

}