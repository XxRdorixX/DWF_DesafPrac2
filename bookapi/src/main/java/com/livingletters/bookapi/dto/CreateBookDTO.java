package com.livingletters.bookapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/*
  DTO for creating/updating a book. Validations applied.
*/
public class CreateBookDTO {

    @NotBlank(message = "El campo 'title' es obligatorio / Field 'title' is required")
    @Size(min = 1, max = 200, message = "El título debe tener entre 1 y 200 caracteres / Title must be 1-200 chars")
    private String title;

    @NotBlank(message = "El campo 'author' es obligatorio / Field 'author' is required")
    @Size(min = 1, max = 100, message = "El autor debe tener entre 1 y 100 caracteres / Author must be 1-100 chars")
    private String author;

    @NotNull(message = "El campo 'publicationYear' es obligatorio / Field 'publicationYear' is required")
    @Min(value = 1, message = "El año de publicación debe ser un entero positivo / publicationYear must be a positive integer")
    private Integer publicationYear;

    // Getters & setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public Integer getPublicationYear() { return publicationYear; }
    public void setPublicationYear(Integer publicationYear) { this.publicationYear = publicationYear; }
}
