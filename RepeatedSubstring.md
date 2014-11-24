Repeated Substrings
======================

<h3>
Statement :
</h3>

Given an input string S write a function which returns true if it satisfies S = nT. 
Basically you have to find if a given string can be represented from a substring by 
iterating it “n” times. n >= 2

Function should return true if <br>
1) S = “abab” <br>
2) S = “abcdabcd” <br>
3) S = “abcabcabc” <br>
4) S = “zzxzzxzzx” <br>
Function should return false if <br>
1) S = “abac” <br>
2) S = “abcdabbd” <br>
3) S = “abcabcefg” <br>
4) S = “zzxzzyzzx” <br>

<h4>
Algorithm :
</h4>
Start writing substring from start. If next coming substring is not matching then concatenate it with existing.

<h4>
Pseudo code :
</h4>

```
Initialize common substring with first character of original string.

Iterate over whole string character by character,
	if coming character matches with first character of common substring then continue matching
		and once whole common substring have matched then scan from beginning of substring again.
	else if character is not matching then concatenate previous matches to substring. 
	
```

<h4>
Complexity :
</h4>

Time : O(n)<br>
Space: O(n)
