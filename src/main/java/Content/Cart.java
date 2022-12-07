package Content;

import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Cart {
    private ProductRepository productRepository;
    private List<Product> productInCart;

    @Autowired
    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(int id){
        Product prod = productRepository.getProductId(id);
        if (prod != null)
            this.productInCart.add(prod);
    }

    public void deleteProduct (int id){
        this.productInCart.remove(productRepository.getProductId(id));
    }

    public List<Product> getProductInCart(){
        return productInCart;
    }

    @PostConstruct
    private void Initialize(){
        this.productInCart = new ArrayList<>();
    }

}