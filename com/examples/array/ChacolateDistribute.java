package com.examples.array;

public class ChacolateDistribute {

		int arr []= {5,10,12,3,4,205};
		//int arr []= {15,2,6,9,13,305,11};	
		int diff =0;
		int totaldiff =0;
		String indeces ="";
		int childCount = 3;
		int prevDeff = 0;
		
		public static void main(String[] args) {
			ChacolateDistribute obj = new ChacolateDistribute();
			obj.chacolateDistribute();
			System.out.println(obj.indeces);
		}
		
		private void chacolateDistribute() {
			for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<(arr.length-(childCount-1));j++) {
					int k = j;
					int kloop = 1;	
					String index = "";
					diff = 0;
					while(kloop < childCount && k<arr.length) {
						System.out.println("arr[i] \t arr[k]\t"+arr[i]+"\t"+arr[k]);
						kloop++;
						if(arr[i]>arr[k])
							diff += arr[i] - arr[k];
						else if(arr[k]>arr[i])
							diff += arr[k] - arr[i];
						
						index += ","+ k;
						k++;
					}
					if(i == 0 && j == i+1 && kloop == 3) {
						prevDeff = diff;
						indeces = i+","+index;
					}else {
						if(diff == 0)
							continue;
						if(diff < prevDeff && kloop == 3) {
							indeces = i+","+index;
							prevDeff = diff;
							System.out.println(indeces);
						}	
					}	
					System.out.println("Diff\t"+diff+"\tprevDeff\t"+prevDeff);
				}				
			}
		}
}
