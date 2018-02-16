# -*- coding: utf-8 -*-
"""
Created on Fri Feb 16 11:07:49 2018

@author: RGautam
"""

"""
Return the max element in list
"""
def find_max(arr,maxnum):
    
    if len(arr)== 0:
        return maxnum
    else:
        currelem = arr.pop()
        if currelem >maxnum:
            maxnum = currelem
        return find_max(arr , maxnum)


mylist =[33,1,2,3,4,12,-1,22,34]

print (find_max(mylist[1:],mylist[0]))    
