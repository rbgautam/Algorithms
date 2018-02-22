#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Feb 22 10:41:22 2018

@author: deltamanpro
"""

"""
GRAPH
"""
def my_graph():
    
    graph = {}
    
    graph["you"] = ["alice","bob","claire"]
    graph["bob"] = ["anuj","peggy"]
    graph["anuj"] =[]
    graph["peggy"] =[]
    graph["alice"] =["peggy"]
    graph["claire"] =["thom","jonny"]
    graph["thom"] =[]
    graph["jonny"] =[]
    
    
    
    for k,v in graph.items():
        mname = k[:]
        print(mname,v) 
    
    
my_graph()
    
   