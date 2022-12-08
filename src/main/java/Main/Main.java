package Main;

import Content.Cart;
import Repository.ForProductRepository;
import Repository.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("appContext");

        ProductRepository productRepository = context.getBean("forProductRepository", ForProductRepository.class);
        System.out.println("Products: " + productRepository.getAllProducts());

        Cart ClientCart = context.getBean("cart", Cart.class);

        ClientCart.addProduct(1);
        ClientCart.addProduct(5);
        ClientCart.addProduct(2);
        ClientCart.addProduct(4);
        ClientCart.addProduct(3);
        ClientCart.deleteProduct(4);
        System.out.println("Client Cart: " + ClientCart.getProductInCart());

        context.close();
    }

}


