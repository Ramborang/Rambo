#!/usr/bin/env python
import sys
#TODO Create a function to add an array of integers together

#SPECIFICATION
	# /*
	#  * Sum returns the sum of the integers in the input array.             
	#  * The method must call the thrower.check(value) method for each integer in the input array.   
	#  * Returns Integer.MAX_VALUE if the sum is greater or equal to Integer.MAX_VALUE. 
	#  * Returns Integer.MIN_VALUE if the sum is lesser or equal to Integer.MIN_VALUE.  
	#  * This method should not exit with an error being thrown.  For all error conditions, (i.e. 
	#  * null pointer exception), Integer.MIN_VALUE should be returned.  
	#  * Note:  For a zero length array, 0 should be returned.   
	#  * Returns Integer. 
	#  */
def sumArray(intArray):
    #remove return statement and add code here!
	#set result variable (result = 0)
	result = 0.0
	maximum = sys.maxsize
	minimum = -sys.maxsize -1

	for e in intArray: 
		result = result + e
		print(result)
	if result > maximum:
		result = maximum
	if result < minimum:
		result = minimum	
	#return final result by (return result)
	return int(result)



# To test your solution try running the following command
# $ python test-add.py 