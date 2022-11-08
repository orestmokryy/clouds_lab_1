package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Stop {
    private int idStop;
    private String district;
    private String streetName;
    private String streetNumber;
    @OneToMany(mappedBy = "stopByStartingStopId")
    private Collection<Route> routesByIdStop;
    @OneToMany(mappedBy = "stopByStopIdStop1EndingStopId")
    private Collection<Route> routesByIdStop_0;

    @Id
    @Column(name = "id_stop", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getIdStop() {
        return idStop;
    }

    public void setIdStop(int idStop) {
        this.idStop = idStop;
    }

    @Basic
    @Column(name = "district", nullable = false, length = 45)
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "street_name", nullable = false, length = 45)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Basic
    @Column(name = "street_number", nullable = false, length = 45)
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stop stop = (Stop) o;

        if (idStop != stop.idStop) return false;
        if (district != null ? !district.equals(stop.district) : stop.district != null) return false;
        if (streetName != null ? !streetName.equals(stop.streetName) : stop.streetName != null) return false;
        if (streetNumber != null ? !streetNumber.equals(stop.streetNumber) : stop.streetNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStop;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        return result;
    }

}
