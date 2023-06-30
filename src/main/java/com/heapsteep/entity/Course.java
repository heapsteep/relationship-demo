package com.heapsteep.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "COURSE")
public class Course{
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy="course")
	private List<Review> reviews=new ArrayList<>();

	@ManyToMany(mappedBy="courses") //Course entity have the relationship ownership
	List<Student> students=new ArrayList<>();

	public void addReview(Review review){
		reviews.add(review);
	}
	public void removeReview(Review review){
		reviews.remove(review);
	}
}