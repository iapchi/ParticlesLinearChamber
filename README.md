A collection of particles is contained in a linear chamber. They all have the same speed, butsome are headed toward the right and others are headed toward the left. These particles canpass through each other without disturbing the motion of the particles, so all the particles willleave the chamber relatively quickly.

You will be given the initial conditions by a String init containing at each position an 'L' for aleftward moving particle, an 'R' for a rightward moving particle, or a '.' for an empty location. initshows all the positions in the chamber. Initially, no location in the chamber contains twoparticles passing through each other.

We would like an animation of the process. At each unit of time, we want a string showingoccupied locations with an 'X' and unoccupied locations with a '.'. Create a class ​Chamber​ thathas a constructor or init method with a String that gives the initial conditions. The ​Chamberclass will also have an ​animate​ method with an int speed, where the speed is the number ofpositions each particle moves in one time unit.

The ​animate ​method will return an array of strings in which each successive element shows theoccupied locations at the next time unit. The first element of the return should show theoccupied locations at the initial instant (at time = 0) in the 'X', '.' format. The last element in thereturn should show the empty chamber at the first time that it becomes empty.

##Conditions
Class: Chamber(init) where init is a string
Method: animate(speed), where speed is an integer, returns an array
Ensure that the class only accepts the following:
- speed will be between 1 and 10 inclusive- init will contain between 1 and 50 characters inclusive 
- each character in init will be '.' or 'L' or'R'

##Examples
0) Chamber("..R....").animate(2)
   
Returns:["..X....","....X..","......X","......."]

The single particle starts at the 3rd position, moves to the 5th, then 7th, and then out of thechamber.

1) Chamber("RR..LRL").animate(3) 
   
Returns:["XX..XXX",".X.XX..","X.....X","......."]

At time 1, there are actually 4 particles in the chamber, but two are passing through each otherat the 4th position

2) Chamber("LRLR.LRLR").animate(2) 
   
Returns:["XXXX.XXXX","X..X.X..X",".X.X.X.X.",".X.....X.","........."]

At time 0 there are 8 particles. At time 1, there are still 6 particles, but only 4 positions areoccupied since particles are passing through each other.

3) Chamber("RLRLRLRLRL").animate(10) 
   
Returns:["XXXXXXXXXX",".........."]

These particles are moving so fast that they all exit the chamber by time 1.

4) Chamber("...").animate(1) 
   
Returns:["..."]

5) Chamber("LRRL.LR.LRR.R.LRRL.").animate(1) 
   
Returns:["XXXX.XX.XXX.X.XXXX.","..XXX..X..XX.X..XX.",".X.XX.X.X..XX.XX.XX","X.X.XX...X.XXXXX..X",".X..XXX...X..XX.X..","X..X..XX.X.XX.XX.X.","..X....XX..XX..XX.X",".X.....XXXX..X..XX.","X.....X..XX...X..XX",".....X..X.XX...X..X","....X..X...XX...X..","...X..X.....XX...X.","..X..X.......XX...X",".X..X.........XX...","X..X...........XX..","..X.............XX.",".X...............XX""X.................X""..................."]
