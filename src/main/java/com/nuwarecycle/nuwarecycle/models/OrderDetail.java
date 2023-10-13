package nuwarecycleBack.src.main.java.com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orderDetails")
@Data
public class OrderDetail {
    private int IdOrderDetails;

    private int OrderId;

    private int productId;

    private int amount;

    private float price;
}
