package com.examination.app.entity;

import com.examination.app.util.UserRoleEnum;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;


@Entity
@Validated
public class User_App {

    // Unique identifier for the user.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    
    @NotBlank(message = "name is mandatory")
    private String name;

    @Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$", message= "Invalid email format")
    private String email;

    
    @NotNull(message="password should not be blank")
    @Size(min = 6, message="Password must be atleast 6 characters")
    private String password;

    @NotNull(message = "role is mandatory")
    private UserRoleEnum role;

    

    public User_App() {
		super();
	}

	
    public User_App(Integer id, String name, String email, String password, UserRoleEnum role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRoleEnum getRole() {
		return role;
	}

	public void setRole(UserRoleEnum role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User_App [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
				+ role + "]";
	}
	
	
	

    

  

}
