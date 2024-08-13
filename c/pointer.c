#include <stdio.h>

int main()
{
	unsigned int a=234;
	int *b=&a;
	char *c=&a;
	printf("%d\n%d\n",*b,*c);
	return 0;
}
