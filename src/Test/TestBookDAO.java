package book_app;

import java.time.LocalDate;

public class TestBookDAO {	
	
	
	public static void main(String[] args) throws Exception {
	Book user = new Book();
    user.setName("radha");
    user.setPrice(134);
    user.setAuthor_id(1);
    user.setPublished_date(LocalDate.now());

    BookDAO userDAO = new BookDAO();
    userDAO.register(user);


}
}
