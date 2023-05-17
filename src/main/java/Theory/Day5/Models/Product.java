package Theory.Day5.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(unique = true,nullable = false,length = 255)
    private String Name;
    @Column(nullable = false,length = 255)
    private String Brand;
    private Long Price;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        Price = price;
    }

    public Product() {

    }

    public Product(Integer id, String name, String brand, Long price) {
        Id = id;
        Name = name;
        Brand = brand;
        Price = price;
    }
}
