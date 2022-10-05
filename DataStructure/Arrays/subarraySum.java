package zoho;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;

public class subarraySum {
    public static void main(String[] args){
    	int i,j,sum=0,k=12;
    	int a[] =  {1,2,3,7,5};
    	int l = 0;
    	i=0;j=1;
    	while(k!=sum) {
    		if(k>sum) {
    			sum += a[l+i];
    			i++;
    		}
    		else {
    			sum -= a[l];
    			if(sum==k) {
    				l++;
    				break;
    			}
    			l++;
    			i=0;
    		}
    	}
    	System.out.println(++l + " " + i);
    	
    }
}
 
