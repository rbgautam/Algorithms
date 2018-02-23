# -*- coding: utf-8 -*-
"""
Created on Fri Feb 23 09:21:28 2018

@author: RGautam
"""

"""
BFS - Breadth First Search 
"""

from collections import deque

graph = {}

#Create Graph
def create_graph():
    graph["you"] = ["alice","bob","claire"]
    graph["bob"] = ["anuj","peggy"]
    graph["anuj"] =[]
    graph["peggy"] =[]
    graph["alice"] =["peggy"]
    graph["claire"] =["tho","jonnym"]
    graph["tho"] =[]
    graph["jonnym"] =[]
    
def print_graph():
    for k,v in graph.items():
        mname = k[:]
        print(mname,v) 
        
#BFS Implementation
def find_mango_seller_friend(name):
    search_queue = deque()
    search_queue += graph[name]
    searchedArr = []
    while search_queue:
        person = search_queue.popleft()
        #print(person)
        if(person not in searchedArr):
            if( is_mango_seller(person)):
                return person;
            else:
                search_queue += graph[person]
                searchedArr.append(person)
    return None    
        
    

def is_mango_seller(person):
    return person[-1] == "m"
        


create_graph()
#print_graph()
print(find_mango_seller_friend("you"))