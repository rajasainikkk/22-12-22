package com.spring.rest.test.exercise.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",length=11 , nullable=false)
	private long id;
	
	@Column(name="name",length=50,nullable=false)
	private String name;
	
	@Column(name="description",length=100)
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="category")
	private List<Product> products;

	//default constructor
	public Category() {
		super();
	}

	public Category(long id, String name, String description, List<Product> products) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.products = products;
	}
	
	public Category(String name, String description, List<Product> products) {
		this.name = name;
		this.description = description;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", products=" + products
				+ "]";
	}

	
}

