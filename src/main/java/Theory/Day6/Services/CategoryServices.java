package Theory.Day6.Services;

import Theory.Day6.Models.Category;
import Theory.Day6.Repositories.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CategoryServices {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> listAll() {
        return  categoryRepository.findAll();
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category get(long id) {
        return  categoryRepository.findById(id).orElse(null);
    }

    public void delete(long id) {
        categoryRepository.deleteById(id);
    }
}
