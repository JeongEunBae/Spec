
package com.specproject.backend.domain.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> { // JpaRepository를 상속 시, 기본적으로 CRUD 기능 지원
}
