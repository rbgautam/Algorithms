# -*- coding: utf-8 -*-
"""
Created on Fri Feb 16 11:17:31 2018

@author: RGautam
"""

def find_element(arr,searchelem,lowindex,highindex):
    mid = round((highindex + lowindex)/2)
    if(highindex < lowindex):
        return None
    if(arr[mid] == searchelem ):
        return mid
    if(arr[mid] >= searchelem):
        return find_element(arr,searchelem,lowindex,mid-1)
    if(arr[mid] < searchelem):
        return find_element(arr,searchelem,mid+1,highindex)
    
my_list =[1,2,3,4,5,6,7,8,9,10]

print(find_element(my_list,9,0,len(my_list)-1))   
    