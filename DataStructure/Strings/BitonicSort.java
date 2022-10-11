int e[] = new int[arr.length/2];
		int o[] = new int[arr.length/2]; 
		for(i=0;i<arr.length;i++) {
			if(i%2==0)
				e[k++] = arr[i];
			else
				o[j++] = arr[i];
		}

		for(i=0;i<k;i++) {
			for(int m=i+1;m<k;m++) {
				if(e[i] > e[m] ) {
					int temp = e[i];
					e[i] = e[m];
					e[m] = temp;
				}
			}
			//System.out.print(e[i]);
		}
	
		for(i=0;i<j;i++) {
			for(int m=i+1;m<j;m++) {
				if(o[i] < o[m] ) {
					int temp = o[i];
					o[i] = o[m];
					o[m] = temp;
				}
			}
			//System.out.println(o[i]);
		}
		i=0;
		while(i<k) {
			System.out.print(e[i++] + " ");
		}
		i=0;
		while(i<j) {
			System.out.print(o[i++]+ " ");
		}
	
