# -*- coding: utf-8 -*-
"""
Created on Fri Feb 16 11:00:47 2018

@author: RGautam
"""

def count_elements(arr,count):
    if len(arr) == 0:
        return count
    else:
        count = count +1
        arr.pop()
        return count_elements(arr,count)
    
print(count_elements([1,2,3,4,5,6,7,8,9],0))    