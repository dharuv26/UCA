#include <stdio.h>

int add(int a, int b)
{
	return a + b;
}

int sub(int a, int b)
{
	return a - b;
}

int div(int a, int b)
{
	return a / b;
}

int mul(int a, int b)
{
	return a * b;
}

int performOperation(int (*operation)(int, int), int a, int b)
{
	return (*operation)(a,b);
}

int main()
{
	printf("%d\n", performOperation(add, 20, 10));
	printf("%d\n", performOperation(sub, 20, 10));
	printf("%d\n", performOperation(div, 20, 10));
	printf("%d\n", performOperation(mul, 20, 10));

	return 0;
}
