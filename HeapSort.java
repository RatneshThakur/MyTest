package sorting;

class Heap{
	int[] array;
	int heapSize;
	int arraySize;
	Heap(){
		arraySize = 11;
		heapSize = 11;
		array = new int[11];
	}
	Heap(int heapSize_value){
		heapSize=arraySize = heapSize_value + 1;
		array = new int[arraySize];
	}
	public void max_heapify(int i){
		int l,r;
		l = 2*i;
		r = 2*i + 1;
		int temp = 0;
		int largest = 0;
		if(l < this.heapSize && array[i]< array[l])
			largest = l;
		else
			largest = i;
		if( r < this.heapSize && array[largest] < array[r])
			largest = r;
		if(largest != i){
			temp = array[largest];
			array[largest] = array[i];
			array[i] = temp;
			max_heapify(largest);
		}
	}
	

	public void build_heap(){
		int i=0;
		this.heapSize = this.arraySize;
		for(i=this.arraySize/2; i>=1; i--){
			this.max_heapify(i);
		}
	}
	public void heap_sort(){
		int i = 0;
		int temp = 0;
		build_heap();
		for(i= this.arraySize-1; i>=2 ; i--){
			temp = array[i];
			array[i] = array[1];
			array[1] = temp;
			this.heapSize = this.heapSize -1;
			this.max_heapify(1);
		}	
	}
	public void printArray(){
		int i = 0;
		System.out.println("Printing the array");
		for(i=1; i< this.arraySize ; i++)
		{
			System.out.println(this.array[i]);
		}
	}
}
public class HeapSort{
	public static void main(String[] args){
		Heap heap1 = new Heap(10);
		//heap1.array[0] = 1;
		heap1.array[1] = 0;
		heap1.array[2] = -1;
		heap1.array[3] = 10;
		heap1.array[4] = 3;
		
		heap1.array[5] = 8;
		heap1.array[6] = 4;
		heap1.array[7] = 3;
		heap1.array[8] = 2;
		heap1.array[9] = 1;
		heap1.array[10] = 6;
		heap1.heap_sort();
		heap1.printArray();
	}
}

