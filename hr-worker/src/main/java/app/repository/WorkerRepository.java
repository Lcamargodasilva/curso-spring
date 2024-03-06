package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
