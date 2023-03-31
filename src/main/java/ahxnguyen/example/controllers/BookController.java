package ahxnguyen.example.controllers;

import ahxnguyen.example.entities.Author;
import ahxnguyen.example.entities.Book;
import ahxnguyen.example.repositories.AuthorRepository;
import ahxnguyen.example.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    public Book bookById(@Argument int id) {
        System.out.printf("id[" + id + "]");
        return bookRepository.findById(id);
    }

    @SchemaMapping
    public Author author(Book bookPostgres) {
        System.out.printf(bookPostgres.getAuthorId());
        return authorRepository.findById(bookPostgres.getAuthorId());
    }
}
