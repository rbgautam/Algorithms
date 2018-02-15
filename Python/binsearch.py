# -*- coding: utf-8 -*-
"""
Binary Search

This expects a sorted list of elements
"""

def binary_search(list, item):
    low =0
    high = len(list) -1
    
    while (low <= high):
        mid = round((low + high)/2)
        guess = list[mid]
        
        if(guess == item):
            return mid
        if guess >= item:
            high = mid -1
        else:
            low = mid +1
        return None       
        
    
my_list = [1,2,5,8,9,13]

print (my_list)

print (binary_search(my_list,5))

print (binary_search(my_list, -1))   