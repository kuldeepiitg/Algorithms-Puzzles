Statement
=====

**n(100)** persons standing on a circle. First man shoots seconds and passes the gun to the next i.e 3rd. Now 3rd shoots 
4th and passes to the 5th and so on. Eventually 99th person kill 100th and passes gun to next alive man i.e. 1st. Now 
kills next man alive which is 3rd and passes to 5th. The process go on continuously, till only one man is alive.

Find the last man alive.

example: Consider 10 man on the circle.

Initially:  1, 2, 3, 4, 5, 6, 7, 8, 9, 10 <br>
1, ~~2~~, 3, 4, 5, 6, 7, 8, 9, 10 <br>
1, ~~2~~, 3, ~~4~~, 5, 6, 7, 8, 9, 10 <br>
1, ~~2~~, 3, ~~4~~, 5, ~~6~~, 7, 8, 9, 10 <br>
1, ~~2~~, 3, ~~4~~, 5, ~~6~~, 7, ~~8~~, 9, 10 <br>
1, ~~2~~, 3, ~~4~~, 5, ~~6~~, 7, ~~8~~, 9, ~~10~~ <br>
1, ~~2~~, ~~3~~, ~~4~~, 5, ~~6~~, 7, ~~8~~, 9, ~~10~~ <br>
1, ~~2~~, ~~3~~, ~~4~~, 5, ~~6~~, ~~7~~, ~~8~~, 9, ~~10~~ <br>
~~1~~, ~~2~~, ~~3~~, ~~4~~, 5, ~~6~~, ~~7~~, ~~8~~, 9, ~~10~~ <br>
~~1~~, ~~2~~, ~~3~~, ~~4~~, 5, ~~6~~, ~~7~~, ~~8~~, ~~9~~, ~~10~~ <br>

5 is the last man remaining.


