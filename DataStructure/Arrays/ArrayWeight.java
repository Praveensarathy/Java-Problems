package Javabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Weightages {

	public static void main(String[] args) {
		Integer []arr = {49,36,8,10,12};
		int i,w=0;
		Integer weight[] =new Integer[arr.length];
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		for(i=0;i<arr.length;i++) {
			double j = Math.sqrt(arr[i]);
			if(Math.floor(Math.ceil(j))==Math.sqrt(arr[i])) 
				w +=5;
			
			if(arr[i]%4 == 0 && arr[i]%6 == 0) 
				w +=4;
			
			if(arr[i]%2==0) 
				w+=3;
			hash.put(arr[i], w);
			weight[i] = w;
			w=0;
		}
		int temp=0;
		for(i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(weight[i]<weight[j]){
                    temp = weight[j];
                    weight[j] = weight[i];
                    weight[i] = temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print("<"+arr[i]+","+weight[i]+"> ");
		}
	}
		
}
