package bpos.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.Objects;
//@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalData extends Entity<Integer>{
    private Address address;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String cnp;
    private String sex;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDate birthDate;

    public PersonalData(Address address, String phoneNumber, String firstName, String lastName, String cnp, String sex, LocalDate birthDate) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public PersonalData() {

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalData that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getPhoneNumber(), that.getPhoneNumber()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getCnp(), that.getCnp()) && Objects.equals(getSex(), that.getSex()) && Objects.equals(getBirthDate(), that.getBirthDate());
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDate=" + birthDate +
                ", id=" + id +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAddress(), getPhoneNumber(), getFirstName(), getLastName(), getCnp(), getSex(), getBirthDate());
    }
}
