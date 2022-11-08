package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.DriverHasRoute;
import ua.lviv.iot.service.DriverHasRouteService;

@RestController
@RequestMapping(value = "api/driver-has-route", produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverHasRouteController extends AbstractController<DriverHasRoute> {

    @Autowired
    public DriverHasRouteController(DriverHasRouteService driverHasRouteService) {
        super(driverHasRouteService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<DriverHasRoute> updateObject(@PathVariable final Integer id,
                                                       @RequestBody final DriverHasRoute manufacturer) {
        manufacturer.setId(id);
        DriverHasRoute oldRegion = service.updateObject(id, manufacturer, new DriverHasRoute());
        return oldRegion == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldRegion, HttpStatus.OK);
    }
}