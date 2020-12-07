package com.specproject.backend.domain.account;

import com.specproject.backend.domain.activities.ActApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
