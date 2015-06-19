Death Probability of a Bot on a Grid
====================================

<h3>
Statement :
</h3>
Given a grid of size <b>l</b>x<b>b</b>. A bot is sitting on coordinates (<b>x</b>, <b>y</b>) which have capability of moving to any of the four neighboring squares with equal probability. Initially, Bot have a battery strength equal to <b>n</b> which decreases by one if bot moves by 1 step. If bot moves out of grid then it is dead, for example if bot is on leftmost column of grid and it tries to move further left then if will be dead.

Find the probability of Bot getting dead.

<h4>
Algorithm :
</h4>
Use dynamic programming. Find probability of death on near by neighbor cells with k-1 battery. Probability for middle cell with k steps will be sum of (1/4 * neighboring cells probability). If a cell is outside, then probability of death is 1.

<h4>
Data Structures :
</h4>
3-D array with dimensions <b>l</b>x<b>b</b>x<b>n</b>. It is a cube where depth <b>k</b> will have probabilities of getting killed with battery <b>k</b>.

