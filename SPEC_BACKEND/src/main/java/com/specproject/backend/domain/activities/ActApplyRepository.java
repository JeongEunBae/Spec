
package com.specproject.backend.domain.activities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActApplyRepository extends JpaRepository<ActApply, Long>{ // JpaRepository를 상속 시, 기본적으로 CRUD 기능 지원
}
