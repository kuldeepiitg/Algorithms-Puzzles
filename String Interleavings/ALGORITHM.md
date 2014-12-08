String Interleavings
=====================

<h3> Statement : </h3>
Print all interleavings of two strings. <br>
e.g. string1 : "AB" string2 : "CD" <br>
ABCD, ACBD, CABD, CADB etc.

<h4>
Algorithm :
</h4>
Use simple recursion.

<h4>
Pseudo Code :
</h4>
```
Given string1 and string2 :

	if string1 is empty string :
		then print string2,
	else if string2 is empty string :
		then print string1
		
	print first character of string1
		append interleaving of string2 and remaining part of string1.
	print first character of string2
		append interleaving of string1 and remaining part of string2.
```
