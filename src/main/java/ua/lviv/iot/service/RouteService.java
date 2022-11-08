package ua.lviv.iot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Route;
import ua.lviv.iot.repository.RouteRepository;

@Service
public class RouteService extends AbstractService<Route> {
    @Autowired
    public RouteService(RouteRepository repository) {
        super(repository);
    }
}