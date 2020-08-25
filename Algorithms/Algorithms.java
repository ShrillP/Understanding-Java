package Algorithms;

import java.util.*;

public class Algorithms {

	static int dig(int number, int pos) {
		number /= Math.pow(10, pos);
		number %= 10;
		return number;
	}

	public static int[] toIntArray (ArrayList <Integer> integerList) {
		int [] intArray = new int [integerList.size()];
		for (int x = 0; x < integerList.size(); x++) {
			intArray[x] = integerList.get(x);
		}
		return intArray;
	}

	public static int max(int[] arr) {
		int maximum = 0;
		for (int x : arr) {
			if (x > maximum)
				maximum = x;
		}
		return maximum;
	}

	public static String reverse(String string) {
		if (string == null || string.length() == 0) {
			return string;
		}
		return reverse(string.substring(1)) + string.charAt(0);
	}

	public static int[] swap(int[] arr, int x, int y) {
		arr[y] = arr[x] + arr[y];
		arr[x] = arr[y] - arr[x];
		arr[y] = arr[y] - arr[x];
		return arr;
	}

	private static void swapp(int[] num, int x, int y){

		int temp = num[x];

		num[x] = num[y];
		num[y] = temp;

	}

	public static int[] createRandomArray(int number, int range) {

		int[] array = new int[number];
		for(int i = 0; i < number; i++) {
			array[i] = (int) (Math.random()*range);
		}
		return array;

	}

	public static int[] createOrderedArray(int number, int range) {

		int[] array = new int[number];
		int diff = range / number;
		int last = 0;
		for(int i = 0; i < number; i++) {
			array[i] = (int)(Math.random() * diff + last);
			last = array[i];
		}
		return array;

	}

	public static int[] createReverseArray (int number, int range) {
		int[] array = new int[number];
		int diff = range / number;
		int last = range-1;
		for(int i = 0; i < number; i++) {
			array[i] = (int)(last - Math.random() * diff);
			last = array[i];
		}
		return array;
	}

	public static int[] createNinetyPercentArray (int number, int range) {
		int[] array = createOrderedArray(number, range);
		for (int i = 0; i < number*0.1; i++) {
			int x = (int) (Math.random()*number);
			int y = (int) (Math.random()*number);
			array = swap(array, x, y);
		}
		return array;
	}

	public static void printArray(int[] arr) {
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = arr.length-1; i >=0; i--) {
			boolean changes = false;
			for (int j = 0; j < i; j++) {
				if (arr[j+1] < arr[j]) {
					arr = swap(arr, j, j+1);
					changes = true;
				}
			}
			if (changes == false) break;
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			int pos = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[pos])
					pos = j;
			}
			if (arr[i] != arr[pos]) {
				swap(arr, pos, i);
			}
		}
		return arr;

	}

	public static int[] insertionSort(int[] arr) {

		for (int x = 0; x < arr.length; x++) {
			int data = arr[x];
			int y = x;
			while (y > 0 && data < arr[y-1]) {
				arr[y] = arr[y-1];
				y--;
			}
			arr[y] = data;
		}
		return arr;

	}

	public static int[] countintSort (int[] arr) {

		int[] count = new int[max(arr)+1];
		for (int i = 0; i < arr.length; i++)
			count[arr[i]]++;

		int index = 0;
		for (int i = 1; i < count.length; i++) {
			for(int j = 0; j < count[i]; j++) {
				arr[index] = i;
				index++;
			}
		}
		return arr;

	}

	public static int[] radixSort( int[] num) {

		//create an array (radix) of integer ArrayLists
		ArrayList<Integer>[] radix = new ArrayList[10];

		for( int i = 0; i < 10; i++ )
			radix[i] = new ArrayList<Integer>();

		//determine the highest power of 10 by looking at the length of the numbers
		int power = Integer.toString(max(num)).length();

		//cycle through all powers of 10
		for( int x = 0; x <= power; x++ ) {
			for( int i = 0; i < num.length; i++ ) {
				int digit = num[i]; //store the current ith item
				digit /= Math.pow(10, x); //shift the digits to right
				digit %= 10; //extract the current least significant digit
				radix[digit].add(num[i]); //add the item to the corresponding ArrayList
			}

			//recreate the num array according to the lsd order
			int index = 0;
			for( int i = 0; i < 10; i++ ) {

				for(int j = 0; j < radix[i].size(); j++) {
					num[index] = radix[i].get(j);
					index++;

				}
				radix[i].clear();
			}
		}
		return num;
	}

	public static int[] bucketSort( int[] num, int maxValue) {

		//create an array (bucket) of integer ArrayLists
		int numBuckets = (int)Math.sqrt(maxValue)+1; //could use different amounts

		ArrayList<Integer>[] bucket = new ArrayList[numBuckets];

		for( int i = 0; i < bucket.length; i++ )
			bucket[i] = new ArrayList<Integer>();

		//'scatter' the numbers into the appropriate buckets
		for( int i = 0; i < num.length; i++ ) {
			int bucketNum = num[i]/numBuckets; //determine the appropriate bucket
			bucket[bucketNum].add(num[i]); //add the item to the corresponding bucket
		}

		int index = 0;

		//sort the individual buckets and 'gather' the numbers back into the num array
		for (int i = 0; i < bucket.length; i++) {

			if (bucket[i].size()>0){

				//copy each bucket to an integer array for sorting
				int[] bucketArray = new int[bucket[i].size()];

				for(int j = 0; j < bucket[i].size(); j++) {
					bucketArray[j] = bucket[i].get(j);
				}

				//sort the bucket
				bucketArray = insertionSort(bucketArray);

				//copy the bucket back into the num array
				for( int j = 0; j < bucketArray.length; j++ ) {
					num[index] = bucketArray[j];
					index++;
				}
			}
		}

		return num;
	}

	public static int[] shellSort (int[] arr) {

		// initializes the crucial gap variable
		int gap = arr.length;

		do {

			// defines the gap of elements being swapped
			gap /= 2;

			// keeps track of any swaps occurring
			boolean swapped;

			do {

				// Defines swapped as false in the beginning of cycle
				swapped = false;

				// Conduct all swapping
				for (int i = 0; i < arr.length - gap; i++) {
					if (arr[i] > arr[i+gap]) {
						arr = swap(arr, i, i+gap);
						swapped = true;
					}
				}

			} while (swapped == true); // continue if any values were swapped in the last round

		} while (gap > 1); // end if gap is 1, since a gap of 0 is redundant

		return arr;

	}

	public static int[] quickSortHelper(int[] num) {

		quickSort(num, 0, num.length - 1);
		return num;

	}

	public static int[] quickSort(int num[], int start, int end) {

		int left = start;
		int right = end;

		int pivot = num[start + (end - start) / 2]; // pivot on 'middle'; other pivots can be used

		// Divide into two lists
		while (left <= right) {

			// If the current value from the left list is smaller then the pivot element
			// then get the next element from the left list
			while (num[left] < pivot)
				left++;

			// If the current value from the right list is larger then the pivot element
			// then get the next element from the right list
			while (num[right] > pivot)
				right--;

			// If we have found a value in the left list which is larger than the pivot
			// element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the values. As we
			// are done we can increase the left pointer and decrease the right pointer
			if (left <= right) {
				swapp(num, left, right);
				left++;
				right--;
			}
		}

		// Perform recursion on both sublists
		if (start < right)
			quickSort(num, start, right);
		if (left < end)
			quickSort(num, left, end);

		return num;

	}

	public static int[] mergeSortHelper(int num[]) {
		// start the sort process on the entire list
		mergeSort(num, 0, num.length - 1);
		return num;
	}

	private static void mergeSort(int[] num, int low, int high) {
		// if the sublist size is greater than or equal to one
		if ((high - low) >= 1) {

			// find the middle index
			int middle = (low + high) / 2;

			// make recursive calls to the 'left' and 'right' sides of the sublist
			mergeSort(num, low, middle);
			mergeSort(num, middle + 1, high);

			// merge the sublists back together
			merge(num, low, middle, middle + 1, high);

		}
	}

	private static void merge(int[] num, int low, int mid1, int mid2, int high) {

		int combinedIndex = low;
		int leftIndex = low;
		int rightIndex = mid2;
		int[] combined = new int[num.length];

		// select items from either sub-array till one sub-array is used
		// increment the indexes accordingly
		while (leftIndex <= mid1 && rightIndex <= high) {

			if (num[leftIndex] < num[rightIndex]) {
				combined[combinedIndex] = num[leftIndex];
				leftIndex++;
			} else {
				combined[combinedIndex] = num[rightIndex];
				rightIndex++;
			}
			combinedIndex++;
		}

		// if the left sub-array is all used then
		if (leftIndex == mid2) {
			// merge the rest of the right sub-array
			while (rightIndex <= high) {
				combined[combinedIndex] = num[rightIndex];
				combinedIndex++;
				rightIndex++;
			}
		} else { // otherwise the right sub-array is all used
			// merge the rest of the left sub-array
			while (leftIndex <= mid1) {
				combined[combinedIndex] = num[leftIndex];
				combinedIndex++;
				leftIndex++;
			}

		}

		// copy the sorted combined sub-array to the main array
		for (int i = low; i <= high; i++)
			num[i] = combined[i];
	}

	public static int[] bottomUpMergeSort(int[] num) {

		// empty array to temporary hold the sorted values

		int[] temp = new int[num.length];

		// repeat merging process while width is smaller than length
		for (int width = 2; width <= num.length; width *= 2) {

			// System.out.println("width = " + width );

			// merge sublists
			for (int i = 0; i < num.length; i += width)
				mergeLists(num, i, width, temp);

			// copy temp array back to original array
			for (int i = 0; i < num.length; i++) {
				num[i] = temp[i];
				// System.out.print(num[i] + " ");
			}

			// System.out.println();
			// System.out.println();
		}

		return num;

	}

	private static void mergeLists(int[] num, int left, int width, int[] temp) {

		int i, j, k; // pointers to keep track of the current item's index
		int middle = left + width / 2;
		int right = left + width;

		// check if this is the last sub-list
		if (right > num.length) {
			middle = num.length;
			right = num.length;
		}

		// initialize the pointers
		i = left;
		j = middle;
		k = left;

		// System.out.println("left = " + left + " middle = " + middle + " right = " +
		// right);

		// keep merging until both sides have been added to the temp array
		while (i < middle || j < right) {

			// System.out.println("i = " + i + " j = " + j + " k = " + k);

			// Both sides still have elements to compare
			if (i < middle && j < right) {
				if (num[i] < num[j])
					temp[k++] = num[i++];
				else
					temp[k++] = num[j++];
			}

			// If either side is empty then simply copy the rest of the elements
			else if (i == middle)
				temp[k++] = num[j++];
			else if (j == right)
				temp[k++] = num[i++];
		}

	}


	public static void main(String[] args) {

		for (int i = 1; i < 8; i++) {

			// creation options; uncomment method

			// Predefined values

			int len = (int) Math.pow(10, i);
			int range = 10000;

			int[] array = createRandomArray(len, range);
			//       int[] array = createOrderedArray(len, range);
			//       int[] array = createReverseArray(len, range);
			//       int[] array = createNinetyPercentArray(len, range);

			long startTime = System.nanoTime();

			// Uncomment the one you want to use

			//       array = bubbleSort(array);
			//       array = selectionSort(array);
			//       array = insertionSort(array);
			array = countintSort(array);
			//       array = radixSort(array);
			//       array = bucketSort(array, max(array));
			//       array = shellSort(array);
			//       array = mergeSortHelper(array);
			//       array = quickSort(array, 0, array.length-1);
			//       System.out.println("Invalid choice");

			long stopTime = System.nanoTime();
			System.out.println(stopTime - startTime);

		}
	}
}

