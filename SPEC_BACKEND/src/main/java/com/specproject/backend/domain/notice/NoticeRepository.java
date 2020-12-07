
package com.specproject.backend.domain.notice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long>{ // JpaRepository를 상속 시, 기본적으로 CRUD 기능 지원
}
