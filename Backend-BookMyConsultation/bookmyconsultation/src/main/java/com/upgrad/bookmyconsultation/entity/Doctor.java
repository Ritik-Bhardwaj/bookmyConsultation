package com.upgrad.bookmyconsultation.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.upgrad.bookmyconsultation.enums.Speciality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Doctor {
	@Id
	private String id = UUID.randomUUID().toString();
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private Speciality speciality;
	private String dob;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Address address;
	private String mobile;
	private String emailId;
	private String pan;
	private String highestQualification;
	private String college;
	private Integer totalYearsOfExp;
	private Double rating;


}
