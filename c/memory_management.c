#include <stdio.h>
#include <stdlib.h>

// calloc using malloc
int main()
{
	int n;
	scanf("%d", &n);
	char *c = (char*) malloc(n);
	for(int i = 0; i < n; i++)
	{
		*(c + i) = '\0';
		printf("%c", c[i]);
	}
	return 0;
}
