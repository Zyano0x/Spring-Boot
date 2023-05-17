package Theory.Day5.Services;

import Theory.Day5.Models.Product;
import Theory.Day5.Models.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product get(Integer Id) {
        return productRepository.findById(Id).get();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void delete(Integer Id) {
        productRepository.deleteById(Id);
    }
}
