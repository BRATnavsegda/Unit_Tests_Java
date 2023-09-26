import org.Task_2.Product;
import org.Task_2.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Bread", 50));
        products.add(new Product("Salt", 10));
        products.add(new Product("Water", 30));
        Shop shop = new Shop(products);


        assertThat(shop.getProducts()).hasSize(3);


        assertThat(shop.getProducts()).isEqualTo(products);

        assertThat(shop.getMostExpensiveProduct().toString()).isEqualTo("Product{cost=50, title='Bread'}");

        assertThat(shop.sortProductsByPrice().toString())
                .isEqualTo("[Product{cost=10, title='Salt'}, Product{cost=30, title='Water'}, Product{cost=50, title='Bread'}]");



    }

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */


}
