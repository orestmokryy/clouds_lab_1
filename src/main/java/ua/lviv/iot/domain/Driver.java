package ua.lviv.iot.domain;

import javax.persistence.*;

@Entity
public class Driver {
    private int idDriver;
    private String name;
    private String surname;

    @Id
    @Column(name = "id_driver", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = false, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (idDriver != driver.idDriver) return false;
        if (name != null ? !name.equals(driver.name) : driver.name != null) return false;
        if (surname != null ? !surname.equals(driver.surname) : driver.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDriver;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}
