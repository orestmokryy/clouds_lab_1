package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.Bus;
import ua.lviv.iot.service.BusService;

@RestController
@RequestMapping(value = "api/bus", produces = MediaType.APPLICATION_JSON_VALUE)
public class BusController extends AbstractController<Bus> {

    @Autowired
    public BusController(BusService countryService) {
        super(countryService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Bus> updateObject(@PathVariable final Integer id,
                                                @RequestBody final Bus bus) {
        bus.setIdBus(id);
        Bus oldCountry = service.updateObject(id, bus, new Bus());
        return oldCountry == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldCountry, HttpStatus.OK);
    }
}