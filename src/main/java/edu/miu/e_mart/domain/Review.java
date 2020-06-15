package edu.miu.e_mart.domain;

import javax.persistence.Entity;
import java.time.LocalDate;
import javax.persistence.*;


@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewId = 000;
	// @NotEmpty(message = "Review needs content")
	private String comment;

	private LocalDate dateOfReview = LocalDate.now();

	public Review() {
	}

	public Review(String comment) {
		this.comment = comment;
	}

	public Integer getReviewId() {

		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getDateOfReview() {
		return dateOfReview;
	}

	public void setDateOfReview(LocalDate dateOfReview) {
		this.dateOfReview = dateOfReview;
	}
}
