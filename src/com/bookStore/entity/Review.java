package com.bookStore.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity(name = "Review")
@Table(name = "Review")
public class Review implements Serializable {

    private int reviewId;
    private String comment;
    private int fk_book_id;

    @Id
    @Column(name = "REVIEWID", columnDefinition = "NUMBER", unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEQ",
            initialValue = 1, allocationSize = 1)
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    @Column(name = "fk_book_id")
    public int getFk_book_id() {
        return fk_book_id;
    }

    public void setFk_book_id(int fk_book_id) {
        this.fk_book_id = fk_book_id;
    }
    /*==========Relation========*/

}
