kim: 0
lee: 10000
------------------> transter(kim,lee,10000)
- kim�� lee���� 1������ ����. 
 kim balance +10000
 lee balance -10000
 ------------------> transter(lee,kim,10000)
- kim�� lee���� 1������ ����.
 lee balance +10000
   ------------------- ���� ���� or ����
 kim balance -10000
  -------------------- kim�� ���� ���������� ����
  ------->Ʈ������ ó�� �ؾ���.
  -- �����̸� commit ���и� rollback
  -- 1. conn�� AutoCommit�� �������� ����
  -- 2. Ʈ������ ������ boolean ������ false�� ����
  -- 3. Ʈ�������� ������ boolean ������ true�� ����
  -- 4. conn�� ������ �� try������ if��(true ��� commit�� false��� rollback�� ����)

create table account(
id varchar2(3) primary key,
balance number
)
 
 insert into ACCOUNT (id, balance) values ('kim', 0)
 insert into ACCOUNT (id, balance) values ('lee', 10000)
 commit
  
 select * from ACCOUNT
 
 ------------------
 
 [����2]
����� ���̺�
���̵�, �̸�, ����Ʈ �÷�
���� ���̺�
���̵�, ��ǰ1, ���� ,  bey
�ֹ��� ������ ����� ���̺��� ����Ʈ �÷�+10 ����
-- �ֹ� ���̺� ���ڵ尡 �߰��Ǹ�
-- ȸ�� ���̺��� Ư�� ���ڵ��� point �÷� ���� ���Ѵ�.
 
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
 insert into oder values ('�ð�', 'm001',0)
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
 
 
 
 
 
 
 
 