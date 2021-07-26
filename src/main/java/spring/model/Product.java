package spring.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int id;

	private String name;

	private Category cat;

	private String description;

	private String detail;

	private User user;

	private String picture;

	private int views;

	private Timestamp createAt;

	// join table
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
