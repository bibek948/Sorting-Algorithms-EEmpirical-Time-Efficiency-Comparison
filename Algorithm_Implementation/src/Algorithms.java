import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;

public class Algorithms {

	//bubble sort
	 static Integer[] bubbleSort(Integer[] arr) {
		int n=arr.length;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	//selection sort
	static Integer[] selectionSort(Integer[] arr) {
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			int min_index=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min_index]) {
					
					
					//swap the found minimum element with the first elements
					int temp=arr[min_index];
					arr[min_index]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//merge sort
	 static Integer[] mergeSort(Integer[] arr) {
		
		if(arr.length<=1) {
			return arr;
		}
		
		int pivot=arr.length/2;
		Integer[] left=mergeSort(Arrays.copyOfRange(arr, 0, pivot));
		Integer[] right=mergeSort(Arrays.copyOfRange(arr, pivot, arr.length));
		return merge(left, right);
	}

	//the following merge method is used my mergeSort method
	private static Integer[] merge(Integer[] left, Integer[] right) {
		Integer[] result=new Integer[left.length+right.length];
		int resultPointer=0, leftPointer=0, rightPointer=0;
		while(leftPointer<left.length && rightPointer<right.length) {
			if(left[leftPointer]>right[rightPointer]) {
				result[resultPointer++]=right[rightPointer++];
			}
			else {
				result[resultPointer++]=left[leftPointer++];
			}
		}
		
		while(leftPointer<left.length) {
			result[resultPointer++]=left[leftPointer++];
		}
		while(rightPointer<right.length) {
			result[resultPointer++]=right[rightPointer++];
		}
		return result;
	}
	
	
	
	
	

	//quick sort algorithm
	public static Integer[] quickSort(Integer[] nums) {
		return quickSortAlgorithm(nums, 0, nums.length-1);
	}
	
	//private quickSort algorithm, which is implemented insided public quickSort method
	 static Integer[] quickSortAlgorithm(Integer[] nums, int low, int high) {
		  if (low < high) 
	        { 
			  int q=partition(nums, low, high);
			  if(q-low <=high-(q+1)) {
				  quickSortAlgorithm(nums, low, q);
				  low=q+1;
			  }
			  else{
				  quickSortAlgorithm(nums, q+1, high);
				  high=q;
			  }
	           
	        } 
		  return nums;
	    } 
	

	 //partition 
	 static int partition(Integer[] arr, int low, int high) 
	    { 
	        int pivot = arr[high]; 
	  
	        // index of smaller element 
	        int i = (low - 1); 
	        for (int j = low; j <= high - 1; j++) { 
	            // If current element is smaller than or 
	            // equal to pivot 
	            if (arr[j] <= pivot) { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i + 1]; 
	        arr[i + 1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i + 1; 
	    } 
	  
	   
	
	//insertionSort Algorithm
	public static Integer[] insertionSort(Integer[] arr) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]> key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
//this method is used for reading the csv files 
	public static ArrayList<String[]> readData() throws IOException { 
	    int count = 0;
	    String file = "5000_random.csv";
	    ArrayList<String[]> content = new ArrayList<>();
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            content.add(line.split(","));
	        }
	    } catch (FileNotFoundException e) {
	      //Some error logging
	    }
	    return content;
	}
	
	 public static final String delimiter = ",";
	   public static Integer[] read(String csvFile) {
		   List<Integer> list=new ArrayList<>();
	      try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	            	
	            	list.add(Integer.parseInt(tempStr));
	          
	            }
	          
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	      return list.toArray(new Integer[0]);
	   }
	
	   /*
	    * 
	    */
	   //implementing all the algorithms inside a program in main method
	   
	   
	public static void main(String[] args) throws IOException {
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("Please enter the data size (5000, 25000, 80000, 150000, 300000)");
		
		int userData=myObj.nextInt();
		
		//the following code is placing the csv files as strings which can be used afterwards
		String csvFile5000="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithms\\src\\5000_random.csv";
		String csvFile25000="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithms\\src\\25000_random.csv";
		String csvFile80000="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithms\\src\\80,000_random.csv";
		String csvFile150000="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithms\\src\\150,000_random.csv";
		String csvFile300000="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithms\\src\\300,000_random.csv";
		
		//the following code is for the path of the sorted files 
		/*
		String csvFile5000_increasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\5000_random_sorted(increasing).csv";
		String csvFile25000_increasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\25000_random_sorted(increasing).csv";
		String csvFile80000_increasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\80,000_random(increasing).csv";
		String csvFile150000_increasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\150,000_random_increasing.csv";
		String csvFile300000_increasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\300,000_random_increasing.csv";
		*/
		
		//the following code is for the path of the sorted files
		/*
		String csvFile5000_decreasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\5000_random_sorted(decreasing).csv";
		String csvFile25000_decreasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\25000_random_sorted(decreasing).csv";
		String csvFile80000_decreasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\80,000_random(decreasing).csv";
		String csvFile150000_decreasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\150,000_random_decreasing.csv";
		String csvFile300000_decreasing="C:\\Users\\Bibek Timalsina\\eclipse-workspace\\Algorithm_Analysis\\src\\300,000_random_decreasing.csv";
		*/
		Integer[] result=null;
		
		//reading the data from our files as selected by the user
		//if needed to run the program for increasing order or decreasing data, please uncomment the codes below
		if(userData==5000) {
			result= read(csvFile5000);
			//result=read(csvFile5000_increasing);
			//result= read(csvFile5000_decreasing);
				
		}
		else if(userData==25000) {
			result=read(csvFile25000);
			//result=read(csvFile25000_increasing);
			//result= read(csvFile25000_decreasing);
		}
		else if(userData==80000) {
			result=read(csvFile80000);
			//result=read( csvFile80000_increasing);
			//result=read(csvFile80000_decreasing);
		}
		else if(userData==150000) {
			result=read(csvFile150000);
			//result=read( csvFile150000_increasing);
			//result=read(csvFile150000_decreasing);
		}
		else if(userData==300000) {
			result=read(csvFile300000);
			//result=read( csvFile300000_increasing);
			//result=read(csvFile300000_decreasing);
		}
		else {
			System.out.println("The data size you selected is not available. Please run the program again by selecting appropriate data size");
			
			
		}
		
		//the following code is asking users to select the preferred sorting algorithms
			System.out.println("Select preferred algorithm");
			System.out.println("1 For Bubble Sort, 2 for Selection Sort, 3 for Merge Sort, 4 for Quick sort, 5 for Insertion sort ");
		
		int userData2=myObj.nextInt();
		if(userData2==1) {
		long startTime=System.nanoTime();
		Integer[] result1=bubbleSort(result);
		long stopTime=System.nanoTime();
		long var=stopTime-startTime;
		System.out.println("The time it takes for bubble sort to process "+ " is "+ var+ " nanoseconds");
		}
		
		else if(userData2==2) {

			long startTime=System.nanoTime();
			Integer[] result1=selectionSort(result);
			long stopTime=System.nanoTime();
			long var=stopTime-startTime;
			System.out.println("The time it takes for selection sort to process "+ " is "+ var+ " nanoseconds");
		}
		
		else if(userData2==3) {

			long startTime=System.nanoTime();
			Integer[] result1=mergeSort(result);
			long stopTime=System.nanoTime();
			long var=stopTime-startTime;
			System.out.println("The time it takes for merge sort to process "+ " is "+ var+ " nanoseconds");
		}
		else if(userData2==4) {

			long startTime=System.nanoTime();
			Integer[] result1=quickSort(result);
			
			long stopTime=System.nanoTime();
			long var=stopTime-startTime;
			System.out.println("The time it takes for quick sort to process "+ " is "+ var+ " nanoseconds");
		
		}
		else if(userData2==5) {

			long startTime=System.nanoTime();
			Integer[] result1=insertionSort(result);
			long stopTime=System.nanoTime();
			long var=stopTime-startTime;
			System.out.println("The time it takes for insertion sort to process "+ " is "+ var+ " nanoseconds");
		}
		else {
			System.out.println("Please enter the proper input size, and select the proper algorithm");
		}
		
		
		
		
		
	}
	
	
}
