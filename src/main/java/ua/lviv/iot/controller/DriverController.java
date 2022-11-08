package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.service.DriverService;
import ua.lviv.iot.service.ManufacturerService;

@RestController
@RequestMapping(value = "api/driver", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverController extends AbstractController<Driver> {

    @Autowired
    public DriverController(DriverService driverService) {
        super(driverService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Driver> updateObject(@PathVariable final Integer id,
                                                     @RequestBody final Driver driver) {
        driver.setIdDriver(id);
        Driver oldRegion = service.updateObject(id, driver, new Driver());
        return oldRegion == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldRegion, HttpStatus.OK);
    }
}