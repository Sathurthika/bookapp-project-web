create database app_db;
use app_db;
create table user
(
id int primary key auto_increment,
name varchar(10)not null,
password varchar(15)not null,
emailid varchar(20)not null);
 insert into user(name,password,emailid) value('sathur','pass123','sathurthi0216@gmail.com')
 insert into user(name,password,emailid) value('radha','123','nagul16@gmail.com')
 insert into user(name,password,emailid) value('nagul','nagul123','nagul@gmail.com')
select* from user;

create table books
(
 id INT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(200)  NOT NULL,
 price INT  NOT NULL,
 author_id INT NOT NULL,
 foreign key(author_id) references users(id),
 published_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
 
);
insert into books(name,price,published_date,author_id) values('sathur',1200,'2017-06-08',1);

select * from books ;
select* from users;
select* from orders;

select * from orders o, users u where o.user_id;
select o.*,u.name from orders o,users u where o.user_id=u.id;
 select * from orders o, books b where o. book_id;
 select o.*,b.name from orders o,books b where o.book_id=b.id;
 select  o.* , u.name,b.name,b.price from orders o,users u,books b where o.user_id=u.id and o.book_id=b.id;
  select  o.id,o.user_id,o.book_id,o.quantity,o.status,o.order_date , u.name as username,b.name as bookname,b.price from orders o,users u,books b where o.user_id=u.id and o.book_id=b.id and user_id=10;
  
  
  
  create table orders
(


id int primary key auto_increment, 
user_id int not null,
book_id int not null,
quantity int not null,
status varchar(30) not null default 'ordered',
order_date timestamp not null default CURRENT_TIMESTAMP,
foreign key(user_id) references users(id),
foreign key(book_id) references books(id)
);
insert into orders(user_id,book_id,quantity,status,order_date) values(1,1,2,'ordered','2017-06-08');
select*from orders;
update orders
set
status  ='delivered'
where id=1;
select  * from orders;
