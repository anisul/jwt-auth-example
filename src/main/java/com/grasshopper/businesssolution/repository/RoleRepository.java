package com.grasshopper.businesssolution.repository;

import com.grasshopper.businesssolution.domain.Role;
import com.grasshopper.businesssolution.domain.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
