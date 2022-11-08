package ua.lviv.iot.service;


import ua.lviv.iot.domain.DriverHasBus;
import ua.lviv.iot.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Bus;
import ua.lviv.iot.repository.DriverHasBusRepository;

@Service
public class DriverHasBusService extends AbstractService<DriverHasBus> {
    @Autowired
    public DriverHasBusService(DriverHasBusRepository repository) {
        super(repository);
    }
}