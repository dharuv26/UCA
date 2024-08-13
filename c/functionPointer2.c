#include <stdio.h>

void swap(int arr[], int i, int j)
{
	int temp =  arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}


void sort(int arr[], int n, int (*compare)(int, int))
{
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n - i + 1; j++)
		{
			if(compare(arr[j], arr[j+1])) swap(arr, j, j+1);
		}
	}
}

int compareAsc(int a, int b)
{
	return a > b;
}

int compareDesc(int a, int b)
{
	return a < b;
}

void printArray(int arr[], int n)
{
	for(int i=0; i < n; i++)
		printf("%d ", arr[i]);
	printf("\n");
}

int main()
{
	int arr[]={4,3,5,54,6,2,62,10};
	printArray(arr, 8);
	sort(arr, 8, compareDesc);
	printArray(arr, 8);
}
