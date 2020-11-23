create table test(
name varchar2(3),
age number(3)
)

test ���̺� ���� ������ �Է��ϼ���.
kim 20,lee 40, park 50,cho 23

insert into test values ('kim', 20)
insert into test values ('lee', 40)
insert into test values ('park', 50)
insert into test values ('cho', 23)
commit

test ���̺��� ��� ���ڵ�(where ����)�� ��� �÷�(*)���� ��ȸ
select * from test

test ���̺��� ��� ���ڵ��� name �÷����� ��ȸ
select name from test

test ���̺��� ��� ���ڵ��� age �÷����� ��ȸ
select age from test
select age ���� from test

alias �÷��� ����ֱ� 
select name �̸�, age ���� from test


insert into test values ('kim', 33)
commit

test ���̺� ��ϵ� �� ���� ��� ���(�ߺ� ����, distinct)
select distinct name ���� from test

�������� asc
select * from test order by age asc

�������� desc
select * from test order by age desc

test ���̺��� ��� ���ڵ带 ��� �÷��� ���Եǰ� ��ȸ�ϵ� 
�̸��� �������� ������������ �����Ͻÿ� 

select * from test order by name desc

test ���̺��� ��� ���ڵ带 ��� �÷��� ���Եǰ� ��ȸ�ϵ� 
�̸��� �������� ������������ �����Ͻÿ� 
���� �̸��� ������ ���̰� ���� ����� �켱�� �ǵ��� �����Ͻ̿�
select * from test order by name desc, age desc
--
select * from test  where name ='kim'

select * from test where name !='kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')
commit

select * from test

delete from test where age ='55'

name�� null�� ���ڵ� ������ ��ȸ
��, �÷��� name�� ����
select name �̸�, age ���� from test where name is null

name�� null�� �ƴ� ���ڵ� ������ ��ȸ
��, ���ڵ忡 ���� ������ age�� �����ǰ� �����ϰ�,
���� age�� ������ name�� ������������ ����
select * from test where name is not null order by age asc, name desc

age�� 55�� ���ڵ� ��ȸ
select * from test where age = 55

age�� 55�� �ƴ� ���ڵ� ��ȸ
select * from test where age != 55

age�� null�� ���ڵ� ��ȸ
select * from test where age is null

null�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�
select * from test where age is not null

age�� 33���� ū ���ڵ� ��ȸ
select * from test where age >33

age�� 33���� ũ�ų� ���� ���ڵ� ��ȸ
select * from test where age >=33

age�� 20�̰ų� 23�̰ų� 40�� ���ڵ带 ��ȸ
select * from test where age=20 or age=23 or age=40

age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ带 ��ȸ
select * from test where age in(20, 23, 40, 43, 61, 77)

age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ尡 �ƴ� ���ڵ带 ��ȸ
select * from test where age not in(20, 23, 40, 43, 61, 77)

name�� kim�̰� age�� 33�� ���ڵ� ��ȸ
select * from test where name='kim' and age=33

age�� 25���� ũ�� 47���� ���� ���ڵ带 ��ȸ
select * from test where age>25 and age<47

age�� 25���� ũ�ų� ���� age�� 47���� �۰ų� ���� ���ڵ带 ��ȸ
select * from test where age>=25 and age <=47
==
select * from test where age between 25 and 47

select * from test where name like 'k__'
select * from test where name like '_e___'
select * from test where name like '_e_'

select * from test where name like '%o'
select * from test where name like '%c%'

���̺�� ��ſ� SELECT�� �ֱ�
����������

select * from test where age>20

select * from (select * from test where age>20) where name like '%k%'

rownum
����Ŭ�� row��ȣ
select *from
(select rownum rrum, name, age from test)
where rrum between 2 and 4

�� select order by(����) ������ ����,
������ select���� �̿��Ͽ� rownum �÷��� �־���� ��

select * from(
select rownum rrum, name, age from
(select name, age from test order by age asc)
)
where rrum between 2 and 4

select *from
(select rownum rrum, name, age from
 (select name, age from test order by age asc))
 where rrum between 2 and 4

