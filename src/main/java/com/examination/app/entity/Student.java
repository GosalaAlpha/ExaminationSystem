package com.examination.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;


@Entity
@Validated
public class Student {

    // Unique identifier for the student.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   
    @NotBlank(message = "name is mandatory")
    private String name;

    
    @NotBlank(message = "address is mandatory")
    private String address;

    @Pattern(regexp= "(^$|[0-9]{10})" , message="Contact must be 10 digits")
    @NotBlank(message = "contact is mandatory")
    private String contact;

   
    public Student() {
		super();
	}

	public Student(Integer id, String name, String address, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
	 // Getter and Setter methods for each property.

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
	
    

   

    

}
