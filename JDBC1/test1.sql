create table test(
name varchar2(3),
age number(3)
)

test 테이블에 다음 값들을 입력하세요.
kim 20,lee 40, park 50,cho 23

insert into test values ('kim', 20)
insert into test values ('lee', 40)
insert into test values ('park', 50)
insert into test values ('cho', 23)
commit

test 테이블의 모든 레코드(where 생략)의 모든 컬럼(*)값을 조회
select * from test

test 테이블의 모든 레코드의 name 컬럼값을 조회
select name from test

test 테이블의 모든 레코드의 age 컬럼값을 조회
select age from test
select age 나이 from test

alias 컬럼에 별명넣기 
select name 이름, age 나이 from test


insert into test values ('kim', 33)
commit

test 테이블에 등록된 성 씨를 모두 출력(중복 제거, distinct)
select distinct name 성씨 from test

내림차순 asc
select * from test order by age asc

오름차순 desc
select * from test order by age desc

test 테이블의 모든 레코드를 모든 컬럼이 포함되게 조회하되 
이름을 기준으로 내림차순으로 정렬하시오 

select * from test order by name desc

test 테이블의 모든 레코드를 모든 컬럼이 포함되게 조회하되 
이름을 기준으로 내림차순으로 정렬하시오 
만약 이름이 같으면 나이가 많은 사람이 우선이 되도록 정렬하싱오
select * from test order by name desc, age desc
--
select * from test  where name ='kim'

select * from test where name !='kim'

insert into test (age) values (55)
insert into test (name) values ('pyo')
commit

select * from test

delete from test where age ='55'

name이 null인 레코드 정보를 조회
단, 컬럼은 name만 있음
select name 이름, age 나이 from test where name is null

name이 null이 아닌 레코드 정보를 조회
단, 레코드에 대한 정렬은 age가 증가되게 정렬하고,
만약 age가 같으면 name을 내림차순으로 정렬
select * from test where name is not null order by age asc, name desc

age가 55인 레코드 조회
select * from test where age = 55

age가 55가 아닌 레코드 조회
select * from test where age != 55

age가 null인 레코드 조회
select * from test where age is null

null이 아닌 레코드를 조회하시오
select * from test where age is not null

age가 33보다 큰 레코드 조회
select * from test where age >33

age가 33보다 크거나 같은 레코드 조회
select * from test where age >=33

age가 20이거나 23이거나 40인 레코드를 조회
select * from test where age=20 or age=23 or age=40

age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드를 조회
select * from test where age in(20, 23, 40, 43, 61, 77)

age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드가 아닌 레코드를 조회
select * from test where age not in(20, 23, 40, 43, 61, 77)

name이 kim이고 age가 33인 레코드 조회
select * from test where name='kim' and age=33

age가 25보다 크고 47보다 작은 레코드를 조회
select * from test where age>25 and age<47

age가 25보다 크거나 같고 age가 47보다 작거나 같은 레코드를 조회
select * from test where age>=25 and age <=47
==
select * from test where age between 25 and 47

select * from test where name like 'k__'
select * from test where name like '_e___'
select * from test where name like '_e_'

select * from test where name like '%o'
select * from test where name like '%c%'

테이블명 대신에 SELECT문 넣기
서브쿼리문

select * from test where age>20

select * from (select * from test where age>20) where name like '%k%'

rownum
오라클의 row번호
select *from
(select rownum rrum, name, age from test)
where rrum between 2 and 4

원 select order by(정렬) 조건이 들어가면,
변도의 select문을 이용하여 rownum 컬럼을 넣어줘야 함

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

 DB에 데이터를 저장한 상태에서
컬럼 하나만을 이용해서
특정 레코드 하나만을 조회
--> 기본키 = 주키 = primary key = pk

create table member2(
id varchar2(6),
name varchar2(6),
age number(3)
)

alter table member2 add constraint pk_member2_id primary key(id)
기본키를 설정하면, 
1)기본키에 대한 중복을 불허
unique constraint(유니크 제약조건)
2)기본키에 대해 NULL 입력 불가
NOT NULL 제약조건이 추가


7명이 모두 같은 id, name, age 다
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

외래키 = foreign key = fk
특정 조건(부모테이블의 pk)의 목록만 들어갈 수 있다.
integrity constraint (참조 무결성 제약조건)


외래키(랙댜후 foreign, fk)가 되려면, 반드시 부모 테이블의 기본키(pk)

부모테이블 먼저 생성
create table depart(
edep varchar2(9)
)

alter table depart add constraint pk_depart_edep primary key(edep)
// 부모테이블의 기본키 설정, 자식테이블의 외래키가 될수 있는 자격을 갖춤

insert into depart values ('인사부')
insert into depart values ('홍보부')
insert into depart values ('연구실')
insert into depart values ('영업부')

// 자식 테이블에서는 부모테이블의 primary key 만 입력할 수 있다

자식 테이블
부모테이블 생성후 생성
create table employee(
eid varchar2(6),
ename varchar2(6), 
edep varchar2(9)
)

alter table employee add constraint fk_employee_edep foreign key(edep) references depart(edep)
// 자식테이블의 제약조건(외래키)설정, 레퍼런시즈(참조)

edep에는 인사부/홍보부/연구실/영업부만 들어갈 수 있음.
비서실은 부모테이블에 없어서(참조 무결성 제약조건) 입력 할 수 없음
 
insert into employee values ('e001', 'kim','인사부')
insert into employee values ('e002', 'lee','홍보부')
insert into employee values ('e003', 'park','연구실')
insert into employee values ('e004', 'choi','영업부')
insert into employee values ('e005', 'jung','비서실')

select * from employee
delete from employee where eid='e005'
commit

eid를 pk로 설정
alter table employee add constraint pk_employee_eid primary key(eid)

insert into employee (eid, ename) values ('e006','kim')

select * from employee

// 외래키 설정 연습 테이블 만들기

create table manu(
name varchar2(15) primary key,
price number
)

insert into manu values ('불고기', 15000)
insert into manu values ('제육볶음', 20000)
insert into manu values ('닭도리탕', 25000)
insert into manu values ('삼계탕', 15000)

자식테이블
create table orderm(
tablenum number(2),
name varchar2(15),
constraint pk_orderm_tablenum primary key(tablenum)
)

alter table orderm add constraint fk_orderm_name foreign key(name) references manu(name)

insert into orderm values (01, '불고기')
insert into orderm values (02, '제육볶음')
insert into orderm values (04, '삼계탕')
insert into orderm (tablenum) values (05)
왜래키 null 가능
insert into orderm values (06, '삼계탕')
왜래키 중복가능 

insert into orderm values (06, '닭도리탕')
기본키 걸려서 안들어감
insert into orderm values (07, '피자')
외래키 걸려서 안들어감

select * from orderm

기본키의 설정 3가지

select * from member

 




























 
 
 
 
