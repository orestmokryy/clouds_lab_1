package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.DriverHasBus;
import ua.lviv.iot.service.DriverHasBusService;

@RestController
@RequestMapping(value = "api/driver-has-bus", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverHasBusController extends AbstractController<DriverHasBus> {

    @Autowired
    public DriverHasBusController(DriverHasBusService driverHasBusService) {
        super(driverHasBusService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<DriverHasBus> updateObject(@PathVariable final Integer id,
                                               @RequestBody final DriverHasBus driver) {
        driver.setId(id);
        DriverHasBus oldRegion = service.updateObject(id, driver, new DriverHasBus());
        return oldRegion == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldRegion, HttpStatus.OK);
    }
}