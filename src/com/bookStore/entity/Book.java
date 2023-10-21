package com.bookStore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;

@Entity(name = "Book")
@Table(name = "Book")
public class Book implements Serializable {
    @Id
    @Column(name = "BOOKID", columnDefinition = "NUMBER", unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEQ",
            initialValue = 1, allocationSize = 1)
    private int bookId;
    @Column(name = "title", columnDefinition = "VARCHAR2(20)")
    private String title;
    @Column(name = "author", columnDefinition = "VARCHAR2(20)")
    private String author;
    @Column(name = "description", columnDefinition = "VARCHAR2(20)")
    private String description;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "price")
    private Float price;
    @Column(name = "publish_date")
    private Date publish_date;
    @Column(name = "last_update_time")
    private Date last_update_time;
    @Column(name = "fk_category_id")
    private int fk_category_id;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public Date getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(Date last_update_time) {
        this.last_update_time = last_update_time;
    }

    public int getFk_category_id() {
        return fk_category_id;
    }

    public void setFk_category_id(int fk_category_id) {
        this.fk_category_id = fk_category_id;
    }
}
