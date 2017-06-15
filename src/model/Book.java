package model;

import java.time.LocalDate;

public class Book {
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getPublished_date() {
		return published_date;
	}

	public void setPublished_date(LocalDate published_date) {
		this.published_date = published_date;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	private Integer id;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", published_date=" + published_date
				+ ", author_id=" + author_id + "]";
	}

	private String name;
	private Float price;
	private LocalDate published_date;
	private int author_id;

}
