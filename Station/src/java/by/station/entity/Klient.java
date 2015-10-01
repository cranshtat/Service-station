package by.station.entity;

/**
 *
 * @author Евгений
 */
public class Klient {
    private int idKlient;
    private String name;
    private String surname;
    private String birthday;
    private String address;
    private String phone;
    private String email;

    public Klient() {
    }

    public Klient(int idKlient, String name, String surname, String birthday, String address, String phone, String email) {
        this.idKlient = idKlient;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public int getIdKlient() {
        return idKlient;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setIdKlient(int idKlient) {
        this.idKlient = idKlient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Klient{" + "idKlient=" + idKlient + ", name=" + name + ", surname=" + surname + ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
    
}
