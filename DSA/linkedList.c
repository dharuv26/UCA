#include <stdlib.h>
#include <stdio.h>
#include <limits.h>
#include <assert.h>
#include "linkedList.h"

struct Node
{
	int val;
	struct Node* next;
};

typedef struct Node Node;
Node *head = NULL;
Node *tail = NULL;
int n = 0;

void push(int item)
{
	if(head == NULL)
	{
		head = (Node *) malloc(sizeof(Node));
		head->val = item;
		tail = head;
	}
	else
	{
		Node *oldTail = tail;
		tail->next = (Node *) malloc(sizeof(Node));
		tail = tail->next;
		tail->val = item;
	}
	n++;
}

int pop(int index)
{
	if(n == 0) return INT_MIN;
	int val = INT_MIN;
	Node* temp = head;
	if(index == 0)
	{
		head = head->next;
		n--;
		val = temp->val;
		free(temp);
	}
	else
	{
		for(int i = 0; i < index - 2; i++)
		{
			if(temp == NULL)
			{
				return val;
			}
			temp = temp->next;
		}
		if(temp->next != NULL)
		{
			Node *temp2 = temp->next;
			temp->next = temp2->next;
			val = temp2->val;
			n--;
			free(temp2);
		}
	}
	return val;
}

void print()
{
	Node *temp = head;
	while(temp != NULL)
	{
		printf("%d ",temp->val);
		temp = temp->next;
	}
	printf("\n");
}

int size()
{
	return n;
}

bool isEmpty()
{
	return n == 0;
}

int main()
{
	push(10);
	push(30);
	push(20);
	print();
	printf("%d %d %d %d\n", size(), pop(3), pop(0), size());
	print();
	return 0;
}
