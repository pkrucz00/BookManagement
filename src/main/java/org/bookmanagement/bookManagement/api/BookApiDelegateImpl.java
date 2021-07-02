package org.bookmanagement.bookManagement.api;

import org.bookmanagement.bookManagement.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class BookApiDelegateImpl implements BookApiDelegate {
    private final NativeWebRequest request;
    private ArrayList<Book> books = new ArrayList<>();

    public BookApiDelegateImpl(NativeWebRequest request){
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest(){
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Book> addBook(Book book){
        books.add(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteBook(Long bookID){
        int sizeBefore = books.size();
        books.removeIf(e-> bookID.equals(e.getId()));
        int sizeAfter = books.size();
        if (sizeAfter == sizeBefore) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<Book> getBookById(Long bookId){
        Optional<Book> element = books.stream().filter(e -> bookId.equals(e.getId())).findAny();
        return element.map(book -> new ResponseEntity<>(book, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<List<Book>> getBooksList(){
        if (books.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> updateBook(Book book){
        Optional<Book> element = books.stream().filter(Predicate.isEqual(book)).findAny();
        return element.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
