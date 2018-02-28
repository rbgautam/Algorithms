#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb 28 13:52:10 2018

@author: deltamanpro
"""

 # Creating the Neighbours hashmap
graph ={}
 
graph["start"] ={}
graph["start"]["a"] = 6
graph["start"]["b"] = 2

graph["a"] ={}
graph["a"]["fin"] =1

graph["b"] ={}
graph["b"]["a"] = 3
graph["b"]["fin"] = 5

graph["fin"] ={}

# Creating the costs hashmap
infinity = float("inf")
costs ={}
costs["a"] = 6
costs["b"] = 2
costs["fin"] = infinity 

#Creating the parents hashmap
parents= {}
parents["a"] = "start"
parents["b"] = "start"
parents["fin"] = None

#array to track processed vertices
processed =[]


#find the lowest cost node in the neighbors
def find_lowest_cost_node(costs):
    lowest_cost = float("inf")
    lowest_cost_node = None
    for node in costs:
        cost = costs[node]
        print(cost) 
        if cost < lowest_cost and node not in processed:
            lowest_cost = cost
            lowest_cost_node = node
        return lowest_cost_node
    
    

#Shortest path algorithm
def shortest_path():
    node = find_lowest_cost_node(costs)
    while node is not None:
        
        cost= costs[node]
        print(cost) 
        neighbors = graph[node]
        for n in neighbors.keys():
            new_cost = cost + neighbors[n]
            if costs[n] > new_cost:
                costs[n] = new_cost
                parents[n] = node
        processed.append(node)
        node = find_lowest_cost_node(costs)
        
        
def print_shortest_path():
    for k,v in parents.items():
        print(k ,v )

shortest_path()
print_shortest_path()
        