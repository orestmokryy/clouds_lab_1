package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.DriverHasRoute;
import ua.lviv.iot.repository.DriverHasRouteRepository;

@Service
public class DriverHasRouteService extends AbstractService<DriverHasRoute> {
    @Autowired
    public DriverHasRouteService(DriverHasRouteRepository repository) {
        super(repository);
    }
}