drop table dept;
create table DEPT(
  id   VARCHAR2(5),
  name VARCHAR2(12),
  dean VARCHAR2(10)
);


drop table student;
create table STUDENT(
  id    VARCHAR2(8),
  name  VARCHAR2(10),
  sex   VARCHAR2(3),
  age   INTEGER,
  did   VARCHAR2(2),
  class VARCHAR2(6)
);