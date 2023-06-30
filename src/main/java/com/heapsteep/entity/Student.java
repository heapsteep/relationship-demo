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
//@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable=false)
	private String name;

	@OneToOne
	private Passport passport;

	@ManyToMany
	List<Course> courses=new ArrayList<>();
}