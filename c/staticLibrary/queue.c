void push(int *arr, int index, int value)
{
	arr[index+1] = value;
}

int pop(int *arr, int index)
{
	int val = arr[index];
	arr[index] = 0;

	return val;
}
