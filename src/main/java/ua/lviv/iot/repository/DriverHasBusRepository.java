package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.DriverHasBus;

@Repository
public interface DriverHasBusRepository extends JpaRepository<DriverHasBus, Integer> {
}