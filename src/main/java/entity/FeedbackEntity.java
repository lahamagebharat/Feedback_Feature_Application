package entity;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@ApplicationScoped
@Table(name="feedbackdetails")
    public class FeedbackEntity {

        @Id
        public Integer id;

//    @Schema(required=true,example="3")

//    @Id
//    @Column(name="id")
//    public Integer id;


    @Column(name="rating")
    public Integer rating;


    @Column(name="comments")
    public String comments;


    @Column(name="submittedate")
    public LocalDate submittedate;

    @Column(name="customerId")
    public Integer customerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDate getSubmittedate() {
        return submittedate;
    }

    public void setSubmittedate(LocalDate submittedate) {
        this.submittedate = submittedate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }




}
