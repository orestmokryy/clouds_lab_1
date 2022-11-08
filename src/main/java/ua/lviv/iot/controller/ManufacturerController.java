package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.Manufacturer;
import ua.lviv.iot.service.ManufacturerService;

@RestController
@RequestMapping(value = "api/manufacturer", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManufacturerController extends AbstractController<Manufacturer> {

    @Autowired
    public ManufacturerController(ManufacturerService manufacturerService) {
        super(manufacturerService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Manufacturer> updateObject(@PathVariable final Integer id,
                                                     @RequestBody final Manufacturer manufacturer) {
        manufacturer.setIdManufacturer(id);
        Manufacturer oldRegion = service.updateObject(id, manufacturer, new Manufacturer());
        return oldRegion == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldRegion, HttpStatus.OK);
    }
}