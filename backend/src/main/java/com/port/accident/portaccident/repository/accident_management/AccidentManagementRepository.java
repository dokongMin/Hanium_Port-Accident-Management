package com.port.accident.portaccident.repository.accident_management;

import com.port.accident.portaccident.domain.accident_management.AccidentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccidentManagementRepository extends JpaRepository<AccidentInfo, Integer> {

}
