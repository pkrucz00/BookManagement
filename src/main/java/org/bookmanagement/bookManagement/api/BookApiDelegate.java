package org.bookmanagement.bookManagement.api;

import org.bookmanagement.bookManagement.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link BookApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T16:07:06.265978700+02:00[Europe/Belgrade]")
public interface BookApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /book : Add a new book to the library
     *
     * @param book Book that needs to be added to the library (required)
     * @return object successfully created (status code 201)
     *         or Invalid input (status code 405)
     * @see BookApi#addBook
     */
    default ResponseEntity<Book> addBook(Book book) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"releaseDate\" : \"2000-01-23\", \"author\" : \"author\", \"isbn\" : \"isbn\", \"id\" : 0, \"title\" : \"title\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /book/{bookId} : Deletes a given book
     *
     * @param bookId ID of the book to be deleted (required)
     * @return Book successfully deleted (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Book not found (status code 404)
     * @see BookApi#deleteBook
     */
    default ResponseEntity<Void> deleteBook(Long bookId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /book/{bookId} : Gets info about the given book
     *
     * @param bookId ID of the book to return (required)
     * @return succesful operation (status code 200)
     *         or Invelid ID supplied (status code 400)
     *         or Book not found (status code 404)
     * @see BookApi#getBookById
     */
    default ResponseEntity<Book> getBookById(Long bookId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"releaseDate\" : \"2000-01-23\", \"author\" : \"author\", \"isbn\" : \"isbn\", \"id\" : 0, \"title\" : \"title\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /book : Get list of all books in library
     *
     * @return successful operation (status code 200)
     *         or List not found (status code 404)
     * @see BookApi#getBooksList
     */
    default ResponseEntity<List<Book>> getBooksList() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /book : Update an existing book
     *
     * @param book Book that needs to be added to the library (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Book not found (status code 404)
     * @see BookApi#updateBook
     */
    default ResponseEntity<Book> updateBook(Book book) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"releaseDate\" : \"2000-01-23\", \"author\" : \"author\", \"isbn\" : \"isbn\", \"id\" : 0, \"title\" : \"title\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
