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

----------------------

 DB�� �����͸� ������ ���¿���
�÷� �ϳ����� �̿��ؼ�
Ư�� ���ڵ� �ϳ����� ��ȸ
--> �⺻Ű = ��Ű = primary key = pk

create table member2(
id varchar2(6),
name varchar2(6),
age number(3)
)

alter table member2 add constraint pk_member2_id primary key(id)
�⺻Ű�� �����ϸ�, 
1)�⺻Ű�� ���� �ߺ��� ����
unique constraint(����ũ ��������)
2)�⺻Ű�� ���� NULL �Է� �Ұ�
NOT NULL ���������� �߰�


7���� ��� ���� id, name, age ��
insert into member2 values ('m001', 'kim', 30)
insert into member2 values ('m002', 'kim', 30)
insert into member2 values ('m003', 'kim', 30)
insert into member2 values ('m004', 'kim', 30)
insert into member2 values ('m005', 'kim', 30)
insert into member2 values ('m006', 'kim', 30)
insert into member2 values ('m007', 'kim', 30)

insert into member2 (id, name, age) values ('m008','lee', 44)
commit

select * from member2 where id='m004'

select * from member

alter table member add constraint pk_member_mid primary key(mid)

create table test2(
id varchar2(6) primary key,
age number(3)
)

create table test3(
id varchar2(6),
age number(3),
constraint pk_test3_id primary key(id)
)


---

�ܷ�Ű = foreign key = fk
Ư�� ����(�θ����̺��� pk)�� ��ϸ� �� �� �ִ�.
integrity constraint (���� ���Ἲ ��������)


�ܷ�Ű(������ foreign, fk)�� �Ƿ���, �ݵ�� �θ� ���̺��� �⺻Ű(pk)

�θ����̺� ���� ����
create table depart(
edep varchar2(9)
)

alter table depart add constraint pk_depart_edep primary key(edep)
// �θ����̺��� �⺻Ű ����, �ڽ����̺��� �ܷ�Ű�� �ɼ� �ִ� �ڰ��� ����

insert into depart values ('�λ��')
insert into depart values ('ȫ����')
insert into depart values ('������')
insert into depart values ('������')

// �ڽ� ���̺����� �θ����̺��� primary key �� �Է��� �� �ִ�

�ڽ� ���̺�
�θ����̺� ������ ����
create table employee(
eid varchar2(6),
ename varchar2(6), 
edep varchar2(9)
)

alter table employee add constraint fk_employee_edep foreign key(edep) references depart(edep)
// �ڽ����̺��� ��������(�ܷ�Ű)����, ���۷�����(����)

edep���� �λ��/ȫ����/������/�����θ� �� �� ����.
�񼭽��� �θ����̺� ���(���� ���Ἲ ��������) �Է� �� �� ����
 
insert into employee values ('e001', 'kim','�λ��')
insert into employee values ('e002', 'lee','ȫ����')
insert into employee values ('e003', 'park','������')
insert into employee values ('e004', 'choi','������')
insert into employee values ('e005', 'jung','�񼭽�')

select * from employee
delete from employee where eid='e005'
commit

eid�� pk�� ����
alter table employee add constraint pk_employee_eid primary key(eid)

insert into employee (eid, ename) values ('e006','kim')

select * from employee

// �ܷ�Ű ���� ���� ���̺� �����

create table manu(
name varchar2(15) primary key,
price number
)

insert into manu values ('�Ұ��', 15000)
insert into manu values ('��������', 20000)
insert into manu values ('�ߵ�����', 25000)
insert into manu values ('�����', 15000)

�ڽ����̺�
create table orderm(
tablenum number(2),
name varchar2(15),
constraint pk_orderm_tablenum primary key(tablenum)
)

alter table orderm add constraint fk_orderm_name foreign key(name) references manu(name)

insert into orderm values (01, '�Ұ��')
insert into orderm values (02, '��������')
insert into orderm values (04, '�����')
insert into orderm (tablenum) values (05)
�ַ�Ű null ����
insert into orderm values (06, '�����')
�ַ�Ű �ߺ����� 

insert into orderm values (06, '�ߵ�����')
�⺻Ű �ɷ��� �ȵ�
insert into orderm values (07, '����')
�ܷ�Ű �ɷ��� �ȵ�

select * from orderm

�⺻Ű�� ���� 3����

select * from member

 




























 
 
 
 
