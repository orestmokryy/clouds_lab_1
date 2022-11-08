package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Bus {

    private int idBus;
    private String numberSign;
    private int age;
    private int capacity;
    private int mileadge;
    private int manufacturerId;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id", referencedColumnName = "id_manufacturer", nullable = false)
    private Manufacturer manufacturerByManufacturerId;

//    @OneToMany(mappedBy = "busByBusIdBus")
//    private Collection<DriverHasBus> driverHasBusesByIdBus;


    public Bus(int idBus, String numberSign, int age, int capacity, int mileadge, int manufacturerId) {
        this.idBus = idBus;
        this.numberSign = numberSign;
        this.age = age;
        this.capacity = capacity;
        this.mileadge = mileadge;
        this.manufacturerId = manufacturerId;
    }

    public Bus() {
    }

    @Id
    @Column(name = "id_bus", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    @Basic
    @Column(name = "number_sign", nullable = false, length = 8)
    public String getNumberSign() {
        return numberSign;
    }

    public void setNumberSign(String numberSign) {
        this.numberSign = numberSign;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "capacity", nullable = false)
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "mileadge", nullable = false)
    public int getMileadge() {
        return mileadge;
    }

    public void setMileadge(int mileadge) {
        this.mileadge = mileadge;
    }


    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus bus = (Bus) o;

        if (idBus != bus.idBus) return false;
        if (age != bus.age) return false;
        if (capacity != bus.capacity) return false;
        if (mileadge != bus.mileadge) return false;
        if (manufacturerId != bus.manufacturerId) return false;
        if (numberSign != null ? !numberSign.equals(bus.numberSign) : bus.numberSign != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBus;
        result = 31 * result + (numberSign != null ? numberSign.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + capacity;
        result = 31 * result + mileadge;
        result = 31 * result + manufacturerId;
        return result;
    }


//    public Manufacturer getManufacturerByManufacturerId() {
//        return manufacturerByManufacturerId;
//    }
//
//    public void setManufacturerByManufacturerId(Manufacturer manufacturerByManufacturerId) {
//        this.manufacturerByManufacturerId = manufacturerByManufacturerId;
//    }
//
//
//    public Collection<DriverHasBus> getDriverHasBusesByIdBus() {
//        return driverHasBusesByIdBus;
//    }
//
//    public void setDriverHasBusesByIdBus(Collection<DriverHasBus> driverHasBusesByIdBus) {
//        this.driverHasBusesByIdBus = driverHasBusesByIdBus;
//    }


    @Override
    public String toString() {
        return "Bus{" +
                "idBus=" + idBus +
                ", numberSign='" + numberSign + '\'' +
                ", age=" + age +
                ", capacity=" + capacity +
                ", mileadge=" + mileadge +
                ", manufacturerId=" + manufacturerId +
                '}';
    }
}
