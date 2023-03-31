package ahxnguyen.example.repositories;

import ahxnguyen.example.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findById(int id);
}
