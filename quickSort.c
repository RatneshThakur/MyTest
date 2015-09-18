#include<stdio.h>
void quickSort(int numArray[], int length);
void quickSort_aux(int numArray[], int p, int r);
int findPivot(int numArray[], int p, int r);
void swap(int *p, int *r);
int main()
{
	int numArray[8] = {5,9,2,1,3, 11, 14, 4};
	int i=0;
	quickSort(numArray,8);	
	for(i=0;i<8;i++)
	{
		printf("%d \n", numArray[i]);
	}
	return 0;
}

void quickSort(int numArray[], int length)
{
	quickSort_aux(numArray, 0, length);
}

void quickSort_aux(int numArray[], int p, int r)
{
	int q = 0;
	if(p<r)
	{
		q = findPivot(numArray, p, r);
		quickSort_aux(numArray, p, q);
		quickSort_aux(numArray,q+1, r);
	}
}

int findPivot(int numArray[], int p, int r)
{
	int i=p-1;
	int j;
	for(j=p; j<(r-1) ; j++)
	{
		if(numArray[j] <= numArray[r-1])
		{
			i++;
			swap(&numArray[i], &numArray[j]);
		}
	}

	swap(&numArray[i+1], &numArray[r-1]);
	return i+1;
	
}

void swap(int *p , int *r)
{
	int temp=0;
	temp = *p;
	*p = *r;
	*r = temp;	
}
