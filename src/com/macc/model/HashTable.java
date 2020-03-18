package com.macc.model;

public class HashTable {
    
    private final Integer size = 13;//Num primo
    
    public HashTable(){
        System.out.println("Called since HastTable");
    }
    
    private Integer hash(Integer k){
        Integer key = 0;
        key = (k & 0x7ffffff)%size;
        return key;
    }
    
  
    public Integer search(Integer k){
        return null;
    }
    
    public void add(Integer k) {
        System.out.println(k + " tiene el hash "+ hash(k));
    }
    
    
    public void delete(Integer k){
        
    } 
    
}
