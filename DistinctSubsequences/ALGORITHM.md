Distinct Subsequences
=======

#### Statement

Given two sequences S, T, count number of unique ways in sequence S, to form a subsequence that is identical to the sequence T.

 Subsequence : A subsequence of a string is a new string which is formed from the original string by deleting some (can be none ) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not). 
Example :

S = "rabbbit" 
T = "rabbit"
Return 3. And the formations as follows:

S1= "ra_bbit" 
S2= "rab_bit" 
S3="rabb_it"
"_" marks the removed character.


##### Algorithm
Solve it using Dynamic Programming.
Keep a 2D array to keep the count of subsequences.
At index [m][n] store count of matches of subsequence(which is substring of original subsequence starting from index n) into
sequence(which is substring of origional sequence starting from index m).

```pseudo
input: sequenceStartIndex, subsequenceStartIndex

run:  if subsequenceStartIndex has exceeded the length of subsequence
            return 1;   // positive because no character is left to match
      else if sequenceStartIndex has exceeded the length of sequence
            return 0;   // because sequence has exchausted but subsequence is remaining
            
      if count for sequence and subsequence is available in 2D array
            return the count;
      else if startIndex character of sequence and subsequence matches
            get the sum of matches with next sequence start index, next subsequence start index 
            and matches with next sequence start index, this subsequence start index;
            save the count in 2D array and return the value.
      else 
            compute matches starting from this subsequence start index and next sequence start index.
            save the count in 2D array and return the value.
```


##### Complexity
Time : O(m*n) if sequence is m long and subsequence is n in length. <br>
Space: O(m*n)