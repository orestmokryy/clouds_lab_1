package ua.lviv.iot.domain;

import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.domain.Route;

import javax.persistence.*;

@Entity
@Table(name = "driver_has_route", schema = "fixbus_db_hibernate", catalog = "")
public class DriverHasRoute {
    private int id;
    private int driverId;
    private int routeId;
    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id_driver", nullable = false)
    private Driver driverByDriverId;
    @ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "id_route", nullable = false)
    private Route routeByRouteId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "driver_id", nullable = false)
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "route_id", nullable = false)
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverHasRoute that = (DriverHasRoute) o;

        if (id != that.id) return false;
        if (driverId != that.driverId) return false;
        if (routeId != that.routeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + driverId;
        result = 31 * result + routeId;
        return result;
    }

}
