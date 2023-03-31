package ahxnguyen.example.repositories;

import ahxnguyen.example.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findById(String id);
}
