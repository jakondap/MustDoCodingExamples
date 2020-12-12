package com.examples.array;

public class SpirallyTraversing {
	/*int rows = 4;
	int cols = 4;
	int arr[][] = {{1, 2, 3, 4},
	               {5, 6, 7, 8},
	              {9, 10, 11, 12},
	              {13, 14, 15,16}}; */
	
	int rows = 3;
	int cols = 4;
	int arr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}};

	
	public static void main(String[] args) {
		SpirallyTraversing obj = new SpirallyTraversing();
		obj.spirallyTraverse();
	}
	
	private void spirallyTraverse() {
		int level = 0;
		int i = 0;
		int j = 0;
		
		while(level < 2) {	
			i = i + level;
			j = j+ level;
			while(i< (rows-level)) {
				while(j< cols-level) {
					System.out.print(arr[i][j]+"\t");
					j++;
				}
				
				if(j == cols - level) {
					i++;
					if(i<rows-level)
						System.out.print(arr[i][j-1]+"\t");
				}
			}
			i = i - 1;
			j = j - 1;
			while(i > (level)) {
				while(j>level) {
					j--;
					System.out.print(arr[i][j]+"\t");
				}
				if(j == level) {
					i--;
					if(i > level)
						System.out.print(arr[i][j]+"\t");
				}
			}
			level++;
		}
	}
	
	
}
