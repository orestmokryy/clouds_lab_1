package ua.lviv.iot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.domain.Route;
import ua.lviv.iot.service.RouteService;

@RestController
@RequestMapping(value = "api/route", produces = MediaType.APPLICATION_JSON_VALUE)
public class RouteController extends AbstractController<Route> {

    @Autowired
    public RouteController(RouteService routeService) {
        super(routeService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Route> updateObject(@PathVariable final Integer id,
                                                     @RequestBody final Route route) {
        route.setIdRoute(id);
        Route oldRegion = service.updateObject(id, route, new Route());
        return oldRegion == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldRegion, HttpStatus.OK);
    }
}