#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb 14 12:08:11 2018

@author: deltamanpro

Insertion Sort
"""

"""
Method returns the smallest element
"""

def find_smallest(arr):
    smallest = arr[0]
    smallest_index = 0
    for i in range(1,len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

"""
Selction sort of an array
pops smallest elements from the input array
and puts it in a new array
"""
def selection_sort(arr):
    newArr =[]
    for i in range(len(arr)):
        smallest = find_smallest(arr)
        newArr.append(arr.pop(smallest))
    return newArr

print(selection_sort([5,3,6,2,10,-1])) 

           