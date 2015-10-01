package by.station.entity;

/**
 *
 * @author Евгений
 */
public class OrderAvto {
    private int idOrder;
    private int idAvtoOrder;
    private String dateOrder;
    private int Sum;
    private String status;

    public OrderAvto() {
    }

    public OrderAvto(int idAvtoOrder, String dateOrder, int Sum, String status,int idOrder) {
        this.idOrder = idOrder;
        this.idAvtoOrder = idAvtoOrder;
        this.dateOrder = dateOrder;
        this.Sum = Sum;
        this.status = status;
    }

    

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
    
    
    
    public int getIdAvtoOrder() {
        return idAvtoOrder;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public int getSum() {
        return Sum;
    }

    public String getStatus() {
        return status;
    }

    public void setIdAvtoOrder(int idAvtoOrder) {
        this.idAvtoOrder = idAvtoOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public void setSum(int Sum) {
        this.Sum = Sum;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderAvto{" + "idOrder=" + idOrder + ", idAvtoOrder=" + idAvtoOrder + ", dateOrder=" + dateOrder + ", Sum=" + Sum + ", status=" + status + '}';
    }

    

}
