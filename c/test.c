#include <stdio.h>

int main() {
	int arr[]={1,2,3,4,5};
	int *ptr=arr;
	for(int i=0; i < 6 ; i++){
		printf("%d\n",arr[i]);
	}
	printf("\n");
	for(int i=0;i<6;i++){
		printf("%d\n", *(ptr+i));
	}
	return 0;
}
