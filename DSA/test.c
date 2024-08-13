#include <stdio.h>
#include <unistd.h>

int main()
{
	fork();
	printf("Hello\n");
	fork();
	printf("Hi\n");
	return 0;
}
