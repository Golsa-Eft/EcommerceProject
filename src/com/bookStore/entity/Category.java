package com.bookStore.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Category")
@Table(name = "Category")
public class Category implements Serializable {
    private int categoryId;
    private String name;

    @Id
    @Column(name = "CATEGORYID", columnDefinition = "NUMBER", unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEQ",
            initialValue = 1, allocationSize = 1)
    public int getCategoryId() {
        return categoryId;
    }
    @Column(name = "title", columnDefinition = "VARCHAR2(20)")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    /*=======Relation========*/
    private List<Book> bookName=new ArrayList<>();
    @OneToMany
    @Fetch(value = FetchMode.SELECT)
    @LazyCollection(LazyCollectionOption.EXTRA)
    @JoinColumn(name = "FK_CATEGORY_ID")
    public List<Book> getBookName() {
        return bookName;
    }

    public void setBookName(List<Book> bookName) {
        this.bookName = bookName;
    }
}
