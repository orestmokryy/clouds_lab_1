package ua.lviv.iot.service;


import ua.lviv.iot.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Bus;

@Service
public class BusService extends AbstractService<Bus> {
    @Autowired
    public BusService(BusRepository repository) {
        super(repository);
    }
}