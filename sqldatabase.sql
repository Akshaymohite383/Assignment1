create database sqldb;
use sqldb;
create table Category(Catid int NOT NULL AUTO_INCREMENT,catname varchar(200),pcatid int, FOREIGN KEY (pcatid) REFERENCES Category(Catid),PRIMARY KEY (Catid));
create table CustomerDetails(Custid int NOT NULL AUTO_INCREMENT,Custname varchar(40),CustAddress varchar(50),CustCity varchar(20),PhoneNo varchar(10),Email varchar(20),Gender varchar(10),DOB date,DOR date,PRIMARY KEY (Custid));
create table Company(comid int NOT NULL PRIMARY key AUTO_INCREMENT,compname varchar(50),address varchar(60),email varchar(40),phone bigint(10));
create table Product(pid int, pname varchar(50),Catid int ,FOREIGN KEY (Catid) REFERENCES Category (Catid),mes_unit varchar(30),price int,mfdate date,expirydate date,comid int,FOREIGN KEY (comid) REFERENCES Company(comid),PRIMARY KEY(pid));
create table Bill(billno int NOT NULL AUTO_INCREMENT,billdate date,Custid int,FOREIGN KEY (Custid) REFERENCES CustomerDetails(Custid),PRIMARY KEY(billno));
create table Billitem(billitemid int NOT NULL AUTO_INCREMENT,billno int,FOREIGN KEY(billno) REFERENCES Bill(billno),pid int,FOREIGN KEY(pid) REFERENCES Product(pid),quantity int,price DECIMAL,PRIMARY KEY(billitemid));

insert into Company values(1,'Apple','pune','apple@gmail.com',9503438484);
insert into Company values(2,'Limeking','bangluru','limeking@limeking.com',8879765564);
insert into Company values(3,'Spark','mumbai','spark99@spark.com',9976563428);

insert into Category values(1,'fruit',1);
insert into Category values(2,'Clothes',2);

 insert into Product values(1,'redapple',1,'150gm',35,'2022-09-11','2024-09-11',1);
insert into Product values(2,'bata',3,'5',6500,'2021-05-10','2024-04-10',2);
insert into Product values(3,'Adidas',3,'6',5000,'2021-05-04','2024-04-10',2);
insert into Product values(4,'western',2,'S size',5699,'2020-05-10','2026-04-08',3);

insert into Customerdetails values(1,'Ajay','balaji nagar','Pune',9503438484,'ajay@yash.com','MALE','1996-09-03','2021-02-06');
insert into Customerdetails values(2,'akash','shivajinagar','Pune',9986745636,'akash@yash.com','MALE','1996-07-09','2021-08-07');
insert into Customerdetails values(3,'Abhi','pune nagar','Pune',8886742314,'abhi@yash.com','MALE','1993-04-11','2022-01-11');
insert into Customerdetails values(4,'Sachin','sadashiv nagar','Pune',7786710321,'sachin@yash.com','MALE','1996-04-09','2022-08-07');
insert into Customerdetails values(5,'Swapnil','Khed','Pune',8764083678,'swapnil@yash.com','MALE','1995-04-11','2022-01-11');
insert into Customerdetails values(6,'Bhushan','Hadpsar ','Pune',5473908744,'bhushan@yash.com','MALE','1996-09-11','2022-01-11');

insert into Bill values(101,'2022-06-05',1);
insert into Bill values(102,'2022-06-04',2);
insert into Bill values(103,'2022-06-11',3);

insert into Billitem values(201,101,1,2,4470);
insert into Billitem values(202,102,3,2,7130);

select * from CustomerDetails where Custid not in (select Custid from bill) ;
select cat.catname,bi.price from category cat inner join product prod on cat.catid = prod.catid inner join billItem bi on 
  prod.pid=bi.pid where bi.price =(select max(price) from billitem);
  select cat.catname,bi.price from category cat inner join product prod on cat.catid = prod.catid inner join billItem bi
 on prod.pid=bi.pid where bi.price =(select min(price) from billitem);
 select p.catid,count(bi.billitemid),c.compname from product as p inner join billitem as bi 
  on p.pid=bi.pid inner join Company as c on c.comid=p.comid group by p.catid; 
select c.Custname,b.billno,b.billdate from customerDetails as c inner join bill as b on c.Custid=b.Custid order by b.billdate;
select c.Custname,sum(price) from billitem as bi inner join bill as b on bi.billno=b.billno
   inner join customerDetails as c on c.Custid=b.Custid group by b.Custid; 
   select c.compname,count(bi.billitemid) from product as p inner join billitem as bi on p.pid=bi.pid 
  inner join Company as c on c.comid=p.comid group by p.comid;
   select com.compname,c.catname,count(p.pid) from product as p inner join category as c on p.catid=c.catid 
   inner join Company as com on com.comid=p.comid group by p.catid; 
   select count(bi.billno),b.billdate from billitem as bi inner join bill as b on b.billno=bi.billno group by b.billdate; 
   select * from Product where expirydate between now() and adddate(now(), INTERVAL 15 DAY); 
   select c.Custname,count(bi.pid) from customerDetails as c inner join bill as b on c.Custid=b.Custid inner join billitem as bi
 on b.billno= bi.billno inner join product as p on p.pid=bi.pid group by b.Custid; 
 select b.billdate,sum(bi.price) from bill as b inner join billitem as bi on b.billno= bi.billno group by b.billdate;


