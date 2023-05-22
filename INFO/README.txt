��� ��������� ���������� H2, � �������� �������:
localhost:8080/h2-console
user_name = root
password = 1234

1) REST-����� �� ��������� �����

GET http://localhost:8080/api/clients

2) REST-����� �� ��������� �����

������������ � Postman: Body, raw, JSON.
��������� ��� ������� ����� ������.


{
	"first_name": "Alice",
	"last_name": "Green",
	"phone": "555 123-4587"
}


{
	"first_name": "Lucy",
	"last_name": "Bangs",
	"phone": "555 111-9944"
}

{
	"first_name": "Jessica",
	"last_name": "Robert",
	"phone": "555 777-1234"
}

3) REST-����� �� ��������� ����� �� id

GET http://localhost:8080/api/clients/2

4) REST-����� �� ��������� ����� �� id.
������������ � Postman: Body, raw, JSON.

PUT http://localhost:8080/api/clients

{
	"id": 1,
	"first_name": "John",
    "last_name": "Green",
    "phone": "888 123-4587"
}

5) REST-����� �� ��������� ����� �� id

DELETE http://localhost:8080/api/clients/2