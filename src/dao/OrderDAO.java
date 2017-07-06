package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Order;
import util.ConnectionUtil;

public class OrderDAO {
	public void register(Order user) throws Exception {
	    String sql = "insert into orders(user_id,book_id,quantity) values (?, ?, ? )";
	    Connection con= ConnectionUtil.getConnection();
	    PreparedStatement pst=con.prepareStatement(sql);
	    		pst.setInt(1, user.getUserid());
	        	pst.setInt (2, user.getBookid());
	    		pst.setInt(3,user.getQuantity());
                //pst.setString(4,user.getStatus());
	    		//pst.setDate(5, Date.valueOf(user.getOrderDate()));
	    		
	      int rows=pst.executeUpdate(); 
	      System.out.println(rows);

	    System.out.println("OrderDAO-> register: " + user);
	}

	   public List<Order> listorder()throws Exception{
		   Connection con= ConnectionUtil.getConnection();
		  // String sql="select id,user_id,book_id,quantity,status,order_date from orders";
		   String sql=" select  o.id,o.user_id,o.book_id,o.quantity,o.status,o.order_date , u.name as username,b.name as bookname,b.price from orders o,users u,books b where o.user_id=u.id and o.book_id=b.id";
		    PreparedStatement pst=con.prepareStatement(sql);
	        List<Order> orderList=new ArrayList<Order>();
	        ResultSet rs=pst.executeQuery();
			while(rs.next()){

				int id=rs.getInt("id");
				int userid=rs.getInt("user_id");
				int bookid=rs.getInt("book_id");
				int quantity=rs.getInt("quantity");
				String status=rs.getString("status");
				Date orderdate=rs.getDate("order_date");
				String username=rs.getString("username");
				String bookname=rs.getString("bookname");

				Order b=new Order();
				b.setId(id);
				b.setUserid(userid);
				b.setBookid(bookid);
				b.setQuantity(quantity);
				b.setOrderDate(orderdate.toLocalDate());
				b.setStatus(status);
				b.setBookname(bookname);
				b.setUsername(username);
				orderList.add(b);
			}
			System.out.println(orderList);
			for(Order b :orderList)
			{
				System.out.println(b);

	   }
			return orderList;
	}

}
