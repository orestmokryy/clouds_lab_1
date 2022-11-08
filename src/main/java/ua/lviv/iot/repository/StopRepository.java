package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Stop;

@Repository
public interface StopRepository extends JpaRepository<Stop, Integer> {
}