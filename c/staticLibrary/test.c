#include <stdio.h>
#include "list.h"

int main()
{
	int arr[10];
	push(arr, -1, 10);
	push(arr, 0, 11);
	push(arr, 1, 12);
	push(arr, 2, 13);
	printf("%d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]);
}
