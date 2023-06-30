package com.heapsteep.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "PASSPORT")
public class Passport {
	@Id
	@GeneratedValue
	private Long id;
	private String number;
}