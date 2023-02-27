package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review extends BaseEntity {

	@Column(name="Review",length = 30,unique = true)
	private String review;
	private int rating;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(String review, int rating) {
		super();
		this.review = review;
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
	
	
}
