1# Write your MySQL query statement below
2Select firstName,lastName,city,state from Person
3Left Outer join  Address
4On Person.personId = Address.personId;