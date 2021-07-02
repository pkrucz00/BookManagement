package org.bookmanagement.bookManagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Objects;

/**
 * All info about a book
 */
@ApiModel(description = "All info about a book")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T16:07:06.265978700+02:00[Europe/Belgrade]")
public class Book   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("author")
  private String author;

  @JsonProperty("isbn")
  private String isbn;

  @JsonProperty("isAvailable")
  private Boolean isAvailable;

  @JsonProperty("releaseDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate releaseDate;

  public Book id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Book author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="\\d\\d\\d-\\d-\\d\\d-\\d\\d\\d\\d\\d\\d-\\d") 
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Book isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Get isAvailable
   * @return isAvailable
  */
  @ApiModelProperty(value = "")


  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public Book releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.title, book.title) &&
        Objects.equals(this.author, book.author) &&
        Objects.equals(this.isbn, book.isbn) &&
        Objects.equals(this.isAvailable, book.isAvailable) &&
        Objects.equals(this.releaseDate, book.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, author, isbn, isAvailable, releaseDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

