name�� kim�� �÷��� ��ȸ
select * from test where name ='kim'

name�� kim�� �ƴ� �÷��� ��ȸ
select * from test where name != 'kim'

name�� null�� ���ڵ� ������ ��ȸ. ��, �÷��� name�� ����
select name �̸� from test where name is null

name�� null�� �ƴ� ���ڵ� ������ ��ȸ
��, ���ڵ忡 ���� ������ age�� �����ǰ� �����ϰ�,
���� age�� ������ name�� ������������ ����
select * from test where name is not null order by age asc, name desc

age�� 55�� ���ڵ� ��ȸ
select * from test where age=55

age�� 55�� �ƴ� ���ڵ� ��ȸ
select * from test where age!=55
age�� null�� ���ڵ� ��ȸ
select * from test where age is null

age�� null�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�
select * from test where age is not null

age�� 33���� ū ���ڵ� ��ȸ
select * from test where age>33

age�� 33���� ũ�ų� ���� ���ڵ� ��ȸ
select * from test where age>=33

age�� 20�̰ų� 23�̰ų� 40�� ���ڵ带 ��ȸ(or)
select * from test where age=20 or age=23 or age=40

age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ带 ��ȸ


age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ尡 �ƴ� ���ڵ带 ��ȸ

name�� kim�̰� age�� 33�� ���ڵ� ��ȸ

age�� 25���� ũ�� 47���� ���� ���ڵ带 ��ȸ

age�� 25���� ũ�ų� ���� age�� 47���� �۰ų� ���� ���ڵ带 ��ȸ(and)

age�� 25���� ũ�ų� ���� age�� 47���� �۰ų� ���� ���ڵ带 ��ȸ(��Ʈ��)

name��  k�� �����ϴ� 3������ �÷� ��ȸ

name�� �ι�° ���ڰ� e�� 5���ڸ� �÷� ��ȸ

name�� �ι�° ���ڰ� e�� �����ڸ� �÷� ��ȸ

name�� �߰��� c�� ���� �÷� ��ȸ

age�� 20 �̻��� �÷� ��ȸ

age�� 20�̻��� ���̺��� �̸��� k�� ���� �÷� ��ȸ(���̺�ӿ� select��)

rownum�� 2~4�� name, age, rownum ��ȸ


rownum�� 2~4�� name, age, rownum ��ȸ
��, age�� ������������ ����