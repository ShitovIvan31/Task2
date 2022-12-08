package Repository;

import Content.Product;

import java.util.List;

public  interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductId(int id);


}

