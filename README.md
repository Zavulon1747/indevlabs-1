##Technical Assessment Java

####General
Write a function as described below and test scenarios to test its validity.

####Details
Write a function that finds missing number in array:\
Given array of sequent numbers 0,1,2,3...N with missing member.\
Function finds a first missing number occurrence in the sequence.\
Implement the function + tests and explain your thinking and assumptions as comments.

####Example:
Input: [5,0,1,3,2]\
Output: 4\
Input:[7, 9,10, 11, 12]\
Output: 8

##Solution
The main idea is to use Arithmetic Sequence Formula, that gives us the sum of all the terms. 
By subtracting the sum of the actual terms from it, we will get the missing member.\
For arrays without a missing element it is to be noted, that the next term after 
the biggest one in the sequence is considered as the first missing number occurrence.\
Tests cover 4 cases: 
a common case with one missing number as expected, 
one case for an empty array, 
and two similar cases for nothing missed.\
####Run tests command: mvn -Dtest=TaskTest test 

