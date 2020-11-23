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

