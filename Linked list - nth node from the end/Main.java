#include<iostream>
using namespace std;

class Node
{ 
public: 
	int data; 
	Node* next; 
};

void print(struct Node *head,int count)
{
    struct Node *node = head;
    node=node->next;
    while(count>0)
    {
        node = node->next;
      count--;
    }
  cout << node->data<<" is the nth node element in the list" << endl;
}

Node* newNode(int key) 
{ 
	Node* temp = new Node; 
	temp->data = key; 
	temp->next = NULL; 
	return temp; 
} 

void insert(Node **head, int value)
{
    Node *last = *head;
    Node *newnode = new Node;
    newnode->data = value;
    newnode->next = NULL;
    
    if(*head == NULL)
    {
        *head = newnode;
    }
    else
    {
        while(last->next != NULL)
        {
            last = last->next;
        }
        last->next = newnode;
    }
}
int main()
{
    Node* head = NULL;
    int elements;
  	int count=0;
    while(1)
    {
        cin >> elements;
        if(elements > 0)
        {
            insert(&head, elements);
          	count++;
        }
        else
        {
            break;
        }
    }
  	int n;
  	cout<<"Enter the nth node:"<<endl;
   	cin>>n; 
  	if(n>count)
  		cout<<"There is no nth node in the list";
  else if(n==count)
    cout << head->data<<" is the nth node element in the list" << endl;
  else
  	print(head,count-n-1);
  
}