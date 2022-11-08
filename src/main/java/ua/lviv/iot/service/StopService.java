package ua.lviv.iot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Stop;
import ua.lviv.iot.repository.StopRepository;

@Service
public class StopService extends AbstractService<Stop> {
    @Autowired
    public StopService(StopRepository repository) {
        super(repository);
    }
}