package observer.observable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private BigDecimal price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static List<Product> createShopProducts() {
        List<Product> products = new ArrayList<>();
        for(int i=1; i<10; i++) {
            Product product = new Product();
            product.setName("product_" + i);
            product.setPrice(BigDecimal.valueOf(Double.valueOf(100 + i)));
            products.add(product);
        }
        return products;
    }
}
