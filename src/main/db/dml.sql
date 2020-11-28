delete from dept;
insert into dept (ID, NAME, DEAN) values ('1', '数学', '老夫 ');
insert into dept (ID, NAME, DEAN) values ('2', '能源', '中二 ');
insert into dept (ID, NAME, DEAN) values ('3', '计算机', '张三');
insert into dept (ID, NAME, DEAN) values ('4', '英文', '李四');
insert into dept (ID, NAME, DEAN) values ('5', '自动控制', '王五');
insert into dept (ID, NAME, DEAN) values ('6', '物理', '赵六');
insert into dept (ID, NAME, DEAN) values ('7', '哲学', '胜七');


delete from student;
insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('1001001', '学一号', '男', 20, '1', '1001');

insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('2001001', '学二号', '男', 19, '2', '2001');

insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('3001001', '学三号', '男', 20, '3', '3001');

insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('4001001', '学四号', '男', 21, '4', '4001');

insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('5001001', '学五号', '女', 19, '5', '5001');

insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('6001001', '学六号', '男', 23, '6', '6001');

insert into student (ID, NAME, SEX, AGE, DID, CLASS)
values ('7001001', '学七号', '男', 23, '7', '7001');

commit;