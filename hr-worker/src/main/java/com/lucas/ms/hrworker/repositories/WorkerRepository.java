package com.lucas.ms.hrworker.repositories;

import com.lucas.ms.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
