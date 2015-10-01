package by.station.entity;

/**
 *
 * @author Евгений
 */
public class Avto {
    private int idAvto;
    private String make;
    private String model;
    private int year;
    private String VIN;
    private int idKlient;
    public Avto() {
    }

    public Avto(int idAvto, String make, String model, int year, String VIN) {
        this.idAvto = idAvto;
        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
    }

    public Avto(int idAvto, String make, String model, int year, String VIN, int idKlient) {
        this.idAvto = idAvto;
        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
        this.idKlient = idKlient;
    }

    
    
    public int getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(int idKlient) {
        this.idKlient = idKlient;
    }
    
    
    
    public int getIdAvto() {
        return idAvto;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setIdAvto(int idAvto) {
        this.idAvto = idAvto;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Avto{" + "idAvto=" + idAvto + ", make=" + make + ", model=" + model + ", year=" + year + ", VIN=" + VIN + ", idKlient=" + idKlient + '}';
    }

    
    
}
