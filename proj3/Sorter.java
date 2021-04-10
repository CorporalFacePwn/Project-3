package proj3;

import java.util.ArrayList;


class Sorter{
	private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		int pivot = pList.get(pFromIdx);
		int leftIdx = pFromIdx - 1; 
		int rightIdx = pToIdx + 1;

		while(leftIdx < rightIdx) {

			leftIdx++;
			while(pList.get(leftIdx) < pivot){
				leftIdx++;
			}
			rightIdx--;
			while(pList.get(rightIdx) > pivot){
				rightIdx--;
			}
			
			if(leftIdx < rightIdx){
				swap(pList, leftIdx, rightIdx);
			}
		}
		return rightIdx;
	}

	private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx){
		if(pFromIdx >= pToIdx){
			return;
		}
		int partitionIdx = partition(pList, pFromIdx, pToIdx);
		quickSort(pList, pFromIdx, partitionIdx);
		quickSort(pList, partitionIdx + 1, pToIdx);
	}

	public static void sort(ArrayList<Student> pList){
		quickSort(pList, 0, pList.size() - 1);
	}

	private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2){
		int x = pList.get(pIdx1);
		int y = pList.get(pIdx2);
		pList.set(pIdx1, y);
		pList.set(pIdx2, x);
	}
}