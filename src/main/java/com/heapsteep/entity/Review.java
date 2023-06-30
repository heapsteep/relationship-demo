package com.heapsteep.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "REVIEW")
public class Review{
	@Id
	@GeneratedValue
	private Long id;
	private String rating;
	private String description;

	@ManyToOne
	private Course course;
}