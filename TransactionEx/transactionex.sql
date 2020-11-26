kim: 0
lee: 10000
------------------> transter(kim,lee,10000)
- kim이 lee에게 1만원을 빌림. 
 kim balance +10000
 lee balance -10000
 ------------------> transter(lee,kim,10000)
- kim이 lee에게 1만원을 갚음.
 lee balance +10000
   ------------------- 전산 오류 or 고장
 kim balance -10000
  -------------------- kim의 돈이 빠져나가지 못함
  ------->트랜젝션 처리 해야함.
  -- 정상이면 commit 실패면 rollback
  -- 1. conn의 AutoCommit을 수동으로 변경
  -- 2. 트랜젝션 시작전 boolean 변수를 false로 선언
  -- 3. 트랜젝션이 끝나면 boolean 변수에 true를 대입
  -- 4. conn이 닫히기 전 try구문에 if문(true 라면 commit을 false라면 rollback를 실행)

create table account(
id varchar2(3) primary key,
balance number
)
 
 insert into ACCOUNT (id, balance) values ('kim', 0)
 insert into ACCOUNT (id, balance) values ('lee', 10000)
 commit
  
 select * from ACCOUNT
 
 ------------------
 
 [문제2]
멤버쉽 테이블
아이디, 이름, 포인트 컬럼
오더 테이블
아이디, 상품1, 가격 ,  bey
주문을 넣으면 멤버쉽 테이블의 포인트 컬럼+10 증가
-- 주문 테이블에 레코드가 추가되면
-- 회원 테이블의 특정 레코드의 point 컬럼 값이 변한다.
 
 create table memberShip(
 mid varchar2(5), 
 point number
 )
 insert into membership values ('m001', 0)
 alter table membership add constraint pk_membership_mid primary key(mid)
 select * from membership
 
 create table oder(
 menu varchar2(15),
 mid varchar2(5),
 buycount number
 )
 alter table oder add constraint fk_oder_mid foreign key(mid) references membersip(mid)
 insert into oder values ('시계', 'm001',0)
 select * from oder
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 ---------
 
 create table member10(
 mid varchar2(10),
 point number
 )
 insert into member10 values ('m001',0)
 
 create table order1(
 oid varchar2(6) primary key,
 menu varchar2(3),
 mid varchar2(6)
 )
 
 
 
 
 
 
 
 