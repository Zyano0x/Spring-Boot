package Theory.Day5.Controller;

import Theory.Day5.Models.Product;
import Theory.Day5.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductServices services;

    @RequestMapping("/products")
    public String Home(Model model) {
        List<Product> ListProducts = services.findAll();
        model.addAttribute("Products", ListProducts);
        return "products/index";
    }

    @RequestMapping("/products/create")
    public String Create(Model model) {
        Product pr = new Product();
        model.addAttribute("product", pr);
        return "products/create";
    }

    @RequestMapping(value = "/products/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        services.save(product);
        return "redirect:/products";
    }
}
