package Repository;

import Content.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;


@Configuration
@ComponentScan
public class ForProductRepository extends ProductRepository {
    private List<Product> products;

    @Bean
    public ForProductRepository forProductRepository () {
        return new ForProductRepository();
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductId(int id) {
        return products.stream().filter((p) ->
                p.getId() == id
        ).findFirst().orElse(null);
    }

   @PostConstruct
    private void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1, "Apple", 25),
                new Product(2, "Pineapple", 250),
                new Product(3, "Popcorn", 35),
                new Product(4, "Eggs", 55),
                new Product(5, "Honey", 100)
        ));
    }
}
