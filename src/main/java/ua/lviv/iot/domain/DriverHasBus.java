package ua.lviv.iot.domain;

import javax.persistence.*;

@Entity
@Table(name = "driver_has_bus", schema = "fixbus_db_hibernate", catalog = "")
public class DriverHasBus {
    private int id;
    private int driverId;
    private int busId;
    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id_driver", nullable = false)
    private Driver driverByDriverId;
    @ManyToOne
    @JoinColumn(name = "bus_id", referencedColumnName = "id_bus", nullable = false)
    private Bus busByBusId;

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

    public void setDriverId(int routeId) {
        this.driverId = routeId;
    }

    @Basic
    @Column(name = "bus_id", nullable = false)
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverHasBus that = (DriverHasBus) o;

        if (id != that.id) return false;
        if (driverId != that.driverId) return false;
        if (busId != that.busId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + driverId;
        result = 31 * result + busId;
        return result;
    }

}
