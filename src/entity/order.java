package entity;

import java.util.Date;

public class order {
    private String order_id;
    private Date order_date;

    public order(String order_id, Date order_date) {
        this.order_id = order_id;
        this.order_date = order_date;
    }

    public order() {
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
}
