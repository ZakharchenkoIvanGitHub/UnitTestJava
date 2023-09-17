package Shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        List<Product> tmp = this.products;
        tmp.sort(new Comparator<>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getCost() - p2.getCost();
            }
        });
        return tmp;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        Product maxProductPrice = this.products.get(0);

        for (int i = 1; i < this.products.size(); i++) {
            if (maxProductPrice.getCost() < this.products.get(i).getCost()) {
                maxProductPrice = this.products.get(i);
            }
        }
        return maxProductPrice;
    }

}