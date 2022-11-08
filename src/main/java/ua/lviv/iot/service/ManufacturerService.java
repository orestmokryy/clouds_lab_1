package ua.lviv.iot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Manufacturer;
import ua.lviv.iot.repository.ManufacturerRepository;

@Service
public class ManufacturerService extends AbstractService<Manufacturer> {
    @Autowired
    public ManufacturerService(ManufacturerRepository repository) {
        super(repository);
    }
}