#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Mar  4 10:40:59 2018

@author: deltamanpro
"""
def get_best_stations():
    #list of Stations
    stations = {}
    stations["knone"] = set(["id","nv","ut"])
    stations["ktwo"] = set(["wa","id","mt"])
    stations["kthree"] = set(["or","nv","ca"])
    stations["kfour"] = set(["nv","ut"])
    stations["kfive"] = set(["ca","az"])
    
    
    
    #print(states_needed)    
    final_stations = []
    
    states_needed = set()
    
    #All the states which are needed to covered
    for k,v in stations.items():
        states_needed = states_needed | v
        
    while states_needed:
        best_station = None
        states_covered = set()   
        for station, states in stations.items():
            covered = states_needed & states
            if(len(covered) > len(states_covered)):
                best_station = station
                states_covered = covered
        states_needed -= states_covered
        final_stations.append(best_station)
        
    print(final_stations)    

get_best_stations()

        
            