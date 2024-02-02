/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binary.search;

/**
 *
 * @author jcham
 */
public class binaryserach {
    
    int binarysearch(int array[],int x){
       int l =0,r= array.length-1;
     
        while(l<=r){
             int m = l+(r-1)/2;
            if(array[m]==x)
               return m;
           if(array[m]<x){
               l=m+1;  // ignore left hand side
            
       } else{
              r=m-1;  //ignore the right hand side
       }
       }
        return -1;
    
}
    
    
}


