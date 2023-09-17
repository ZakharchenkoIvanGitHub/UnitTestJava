package Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {

        Product pr1 = new Product();
        pr1.setTitle("Хлеб");
        pr1.setCost(30);

        Product pr2 = new Product();
        pr2.setTitle("Сахар");
        pr2.setCost(50);

        Product pr3 = new Product();
        pr3.setTitle("Пиво");
        pr3.setCost(40);

        List<Product> lstProd = new ArrayList<>();
        lstProd.add(pr1);
        lstProd.add(pr2);
        lstProd.add(pr3);

        Shop shopLst = new Shop();
        shopLst.setProducts(lstProd);

        assertThat(shopLst.getProducts()).hasSize(3);
        assertThat(shopLst.getProducts().get(0)).isEqualTo(pr1);
        assertThat(shopLst.getProducts().get(1)).isEqualTo(pr2);
        assertThat(shopLst.getProducts().get(2)).isEqualTo(pr3);

        List<Product> sortProd = shopLst.sortProductsByPrice();

        assertThat(sortProd).hasSize(3);
        assertThat(sortProd.get(0)).isEqualTo(pr1);
        assertThat(sortProd.get(1)).isEqualTo(pr3);
        assertThat(sortProd.get(2)).isEqualTo(pr2);

//        for (Product pr: sortProd){
//           System.out.println(pr.getTitle() +" - "+ pr.getCost());
//        }

        assertThat(shopLst.getMostExpensiveProduct()).isEqualTo(pr2);





    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    }
}