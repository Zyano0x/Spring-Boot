package Theory.Day6.Services;

import Theory.Day6.Models.Book;
import Theory.Day6.Repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookServices {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> listAll() {
        return bookRepository.findAll();
    }

    public void save(Book product) {
        bookRepository.save(product);
    }

    public Book get(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void delete(long id) {
        bookRepository.deleteById(id);
    }
}
