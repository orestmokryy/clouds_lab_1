package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Route {
    private int idRoute;
    private int totalFare;
    private int startingStopId;
    private int endingStopId;


    @ManyToOne
    @JoinColumn(name = "starting_stop_id", referencedColumnName = "id_stop", nullable = false)
    private Stop stopByStartingStopId;
    @ManyToOne
    @JoinColumn(name = "ending_stop_id", referencedColumnName = "id_stop", nullable = false)
    private Stop stopByStopIdStop1EndingStopId;

    @Id
    @Column(name = "id_route", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(int idRoute) {
        this.idRoute = idRoute;
    }

    @Basic
    @Column(name = "total_fare", nullable = false)
    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    @Basic
    @Column(name = "starting_stop_id", nullable = false)
    public int getStartingStopId() {
        return startingStopId;
    }

    public void setStartingStopId(int startingStopId) {
        this.startingStopId = startingStopId;
    }

    @Basic
    @Column(name = "ending_stop_id", nullable = false)
    public int getEndingStopId() {
        return endingStopId;
    }

    public void setEndingStopId(int endingStopId) {
        this.endingStopId = endingStopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (idRoute != route.idRoute) return false;
        if (totalFare != route.totalFare) return false;
        if (startingStopId != route.startingStopId) return false;
        if (endingStopId != route.endingStopId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRoute;
        result = 31 * result + totalFare;
        result = 31 * result + startingStopId;
        result = 31 * result + endingStopId;
        return result;
    }

}
