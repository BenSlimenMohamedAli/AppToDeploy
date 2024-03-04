package com.weatherstation.datamanagement.repositories;

import com.weatherstation.datamanagement.model.WeatherstationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherstationRepository extends JpaRepository<WeatherstationModel, Long> {
}
