# Exercise 5.2
A common programming task is computing statistics of a set of numbers. (A 
statistic is a number that summarizes some property of a set of data.) Common 
statistics include the mean (also known as the average) and the standard 
deviation (which tells how spread out the data are from the mean). I have 
written a little class called StatCalc that can be used to compute these statistics, as well as the sum of the items in the dataset and the number of items 
in the dataset. You can read the source code for this class in the file
 <a href="https://math.hws.edu/javanotes/source/chapter5/StatCalc.java">StatCalc.java</a>, If calc is a variable of type StatCalc, then the following instance methods are available:
- calc.enter(item) where item is a number, adds the item to the dataset.
- calc.getCount() is a function that returns the number of items that have
 been added to the dataset.
- calc.getSum() is a function that returns the sum of all the items that have
 been added to the dataset.
- calc.getMean() is a function that returns the average of all the items.
- calc.getStandardDeviation() is a function that returns the standard deviation
 of the items.

Typically, all the data are added one after the other by calling the enter()
 method over and over, as the data become available. After all the data have
 been entered, any of the other methods can be called to get statistical
 information about the data. The methods getMean() and getStandardDeviation()
 should only be called if the number of items is greater than zero.

Modify the current source code, <a href="https://math.hws.edu/javanotes/source/chapter5/StatCalc.java">StatCalc.java</a>, to add instance methods getMax()
and getMin(). The getMax() method should return the largest of all the items
that have been added to the dataset, and getMin() should return the smallest. 
You will need to add two new instance variables to keep track of the largest 
and the smallest items that have been seen so far.

Test your new class by using it in a program to compute statistics for a set 
of non-zero numbers entered by the user. Start by creating an object of type 
StatCalc:

	```
	StatCalc calc;	// Object to be used to process data
	calc = new StatCalc();
	```

Read numbers from the user and add them to the dataset. Use 0 as sentinel value
(that is stop reading numbers when the user enters 0). After all the user's
non-zero numbers have been entered, print out each of the six statistics that 
are available from calc.

<a href="https://github.com/ken-wakura-pro/Java-Revision-Exercises/tree/master/chap05/chap05_exercises/exercise_5_2">Solution to Exercise 5.2</a>
