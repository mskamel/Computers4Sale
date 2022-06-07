package com.computer.store.repository.entites;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id;
	
	@Column
	String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	List<Review> customerReviews;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	List<Order> customerOrders;
	
	@Column
	String email;
	
	@Column
	String password;
	
	@Column
	String country;
	
	@Column
	String city;
	
	@Column
	LocalDate registerationDate;
	
	@Column
	String password_forgot_token;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Review> getCustomerReviews() {
		return customerReviews;
	}
	public void setCustomerReviews(List<Review> customerReviews) {
		this.customerReviews = customerReviews;
	}
	public List<Order> getCustomerOrders() {
		return customerOrders;
	}
	public void setCustomerOrders(List<Order> customerOrders) {
		this.customerOrders = customerOrders;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate(LocalDate registerationDate) {
		this.registerationDate = registerationDate;
	}
	public String getPassword_forgot_token() {
		return password_forgot_token;
	}
	public void setPassword_forgot_token(String password_forgot_token) {
		this.password_forgot_token = password_forgot_token;
	}
	public Customer(Long id, String name, List<Review> customerReviews, List<Order> customerOrders, String email,
			String password, String country, String city, LocalDate registerationDate, String password_forgot_token) {
		super();
		this.id = id;
		this.name = name;
		this.customerReviews = customerReviews;
		this.customerOrders = customerOrders;
		this.email = email;
		this.password = password;
		this.country = country;
		this.city = city;
		this.registerationDate = registerationDate;
		this.password_forgot_token = password_forgot_token;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", customerReviews=" + customerReviews + ", customerOrders="
				+ customerOrders + ", email=" + email + ", password=" + password + ", country=" + country + ", city="
				+ city + ", registerationDate=" + registerationDate + ", password_forgot_token=" + password_forgot_token
				+ "]";
	}
	
	
}
