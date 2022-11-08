package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.DriverHasRoute;

@Repository
public interface DriverHasRouteRepository extends JpaRepository<DriverHasRoute, Integer> {
}