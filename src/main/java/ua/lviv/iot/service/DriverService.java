package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.repository.DriverRepository;

@Service
public class DriverService extends AbstractService<Driver> {
    @Autowired
    public DriverService(DriverRepository repository) {
        super(repository);
    }
}