/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binary.search;

/**
 *
 * @author jcham
 */
public class BinarySearch {

    public static void main(String[] args) {
    binaryserach b = new binaryserach();
    int array[]={2,3,40,50,53,45,100};
    int x =45;
    int result=b.binarysearch(array, x);
     if(result==-1){
         System.out.println("element is not present in array");
         
     }else{
              System.out.println("element in presen at "+result+"index");
     }
    }
}
