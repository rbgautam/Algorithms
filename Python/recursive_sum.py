# -*- coding: utf-8 -*-
"""
Created on Fri Feb 16 10:05:29 2018

@author: RGautam
"""

"""
Method returns the sum of all elements in an array arr
"""
finalSum = 0
def recursive_sum(arr,currsum):
    if len(arr) == 0:
        #print(currsum)
        return currsum
    else:
        currsum += arr.pop()
#        print(currsum)
        recursive_sum(arr,currsum)

array = [1,2,3,4,5,6,7]

finalSum = recursive_sum(array,0)

print(finalSum)
