package app.project.gamestart.domain.models.service;

import app.project.gamestart.domain.entities.Author;
import app.project.gamestart.domain.entities.Review;
import app.project.gamestart.domain.entities.User;
import app.project.gamestart.domain.enums.Genre;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class BookAddServiceModel {

    private String title;
    private Author author;
    private Set<Review> reviews;
    private Boolean approved;
    private Set<Genre> genres;
    private String description;
    private BigDecimal price;
    private File coverImageUrl;
    private File textFile;
    private LocalDate releaseDate;
    private Set<User> users;

    public BookAddServiceModel() {
        this.genres = new HashSet<>();
        this.reviews = new HashSet<>();
        this.users = new HashSet<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public File getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(File coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public File getTextFile() {
        return textFile;
    }

    public void setTextFile(File textFile) {
        this.textFile = textFile;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
