package model;

import java.time.LocalDate;

public class Order {


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	private int id;
	@Override
	public String toString() {
		return "Order [id=" + id + ", userid=" + userid + ", bookid=" + bookid + ", quantity=" + quantity + ", status="
				+ status + ", orderDate=" + orderDate + "]";
	}
	private int userid;
	private int bookid;
	private int quantity;
	private String status;
	private  LocalDate orderDate;
	
}