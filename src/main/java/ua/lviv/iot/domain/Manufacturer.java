package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Manufacturer {

    private int idManufacturer;
    private String name;
    private String phoneNumber;
    private String officeAdress;

    @OneToMany(mappedBy = "manufacturerByManufacturerId")
    private Collection<Bus> busesByIdManufacturer;


    public Manufacturer(int idManufacturer, String name, String phoneNumber, String officeAdress) {
        this.idManufacturer = idManufacturer;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.officeAdress = officeAdress;
    }

    public Manufacturer() {
    }

    @Id
    @Column(name = "id_manufacturer", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
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
    @Column(name = "phone_number", nullable = false, length = 13)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "office_adress", nullable = false, length = 45)
    public String getOfficeAdress() {
        return officeAdress;
    }

    public void setOfficeAdress(String officeAdress) {
        this.officeAdress = officeAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manufacturer that = (Manufacturer) o;

        if (idManufacturer != that.idManufacturer) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (officeAdress != null ? !officeAdress.equals(that.officeAdress) : that.officeAdress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idManufacturer;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (officeAdress != null ? officeAdress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "idManufacturer=" + idManufacturer +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", officeAdress='" + officeAdress + '\'' +
                '}';
    }
}
