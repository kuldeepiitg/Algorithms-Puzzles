Question: minimum number of jumps.
answer: take an array of size equal to given array wherev we will store minimum steps required to reach at that index. 
pseudo code: 
1. Initialize jump array with zeros.
2. Process each entry:
     2.1 Index of this entry in input is 'i'. Minimum jumps required to reach at 'i' be 'v'. Maximum jump that I can take from this position is equal to 'j'. Then go on overwriting entry from 'i+1' to 'i+j' with value  'v+1' if value at these entry are zero or larger than 'v+1'. Start from back will save time.
     
    Time: O(n)
    Space: O(n)
