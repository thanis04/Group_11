package entity;

public class customer {
    private String customer_id;

    public customer(String customer_id) {
        this.customer_id = customer_id;
    }

    public customer() {
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
