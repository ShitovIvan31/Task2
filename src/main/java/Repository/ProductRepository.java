package Repository;

import Content.Product;

import java.util.List;

public abstract class ProductRepository {
    public abstract List<Product> getAllProducts();
    public abstract Product getProductId(int id);


}

