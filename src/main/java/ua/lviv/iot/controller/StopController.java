package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.Stop;
import ua.lviv.iot.service.StopService;

@RestController
@RequestMapping(value = "api/stop", produces = MediaType.APPLICATION_JSON_VALUE)
public class StopController extends AbstractController<Stop> {

    @Autowired
    public StopController(StopService stopService) {
        super(stopService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Stop> updateObject(@PathVariable final Integer id,
                                              @RequestBody final Stop stop) {
        stop.setIdStop(id);
        Stop oldRegion = service.updateObject(id, stop, new Stop());
        return oldRegion == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldRegion, HttpStatus.OK);
    }
}