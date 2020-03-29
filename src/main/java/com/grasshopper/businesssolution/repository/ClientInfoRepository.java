package com.grasshopper.businesssolution.repository;

import com.grasshopper.businesssolution.domain.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientInfoRepository extends JpaRepository<ClientInfo, Long> {
}
