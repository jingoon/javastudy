name이 kim인 컬렘을 조회
select * from test where name ='kim'

name이 kim이 아닌 컬럼을 조회
select * from test where name != 'kim'

name이 null인 레코드 정보를 조회. 단, 컬럼은 name만 있음
select name 이름 from test where name is null

name이 null이 아닌 레코드 정보를 조회
단, 레코드에 대한 정렬은 age가 증가되게 정렬하고,
만약 age가 같으면 name을 내림차순으로 정렬
select * from test where name is not null order by age asc, name desc

age가 55인 레코드 조회
select * from test where age=55

age가 55가 아닌 레코드 조회
select * from test where age!=55
age가 null인 레코드 조회
select * from test where age is null

age가 null이 아닌 레코드를 조회하시오
select * from test where age is not null

age가 33보다 큰 레코드 조회
select * from test where age>33

age가 33보다 크거나 같은 레코드 조회
select * from test where age>=33

age가 20이거나 23이거나 40인 레코드를 조회(or)
select * from test where age=20 or age=23 or age=40

age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드를 조회


age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드가 아닌 레코드를 조회

name이 kim이고 age가 33인 레코드 조회

age가 25보다 크고 47보다 작은 레코드를 조회

age가 25보다 크거나 같고 age가 47보다 작거나 같은 레코드를 조회(and)

age가 25보다 크거나 같고 age가 47보다 작거나 같은 레코드를 조회(비트윈)

name이  k로 시작하는 3글자인 컬럼 조회

name의 두번째 글자가 e인 5글자를 컬럼 조회

name의 두번째 글자가 e인 세글자를 컬럼 조회

name의 중간에 c가 들어가는 컬럼 조회

age가 20 이상인 컬럼 조회

age가 20이상인 테이블에서 이름에 k가 들어가는 컬럼 조회(테이블속에 select문)

rownum이 2~4인 name, age, rownum 조회


rownum이 2~4인 name, age, rownum 조회
단, age는 오름차순으로 정렬