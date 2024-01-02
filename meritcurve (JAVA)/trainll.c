#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int i=1;
struct node{
    int data;
    char na[100];
    struct node *next;
    struct node *prev;
}*temp;
struct node *create(char x[],struct node *head){
    struct node *n=(struct node *)malloc(sizeof(struct node));
    n->data=i;
    i++;
    strcpy(n->na,x);
    n->next=n->prev=NULL;
    if(head==NULL){
        head=n;
        temp=head;
    }
    else{
        temp->next=n;
        n->prev=temp;
        temp=temp->next;
    }
    
    return head; 
}
void display(struct node *head){
    temp=head;
    while(temp!=NULL){
        printf("%d %s ",temp->data,temp->na);
        temp=temp->next;
    }
}
struct node *del(int r,struct node *head){
    temp=head;
    struct node *tail=head;
    while(tail->next!=NULL){
        tail=tail->next;
    }
    while(temp!=NULL&&temp->data!=r){
        temp=temp->next;
    }
    tail->next=temp;
    temp->prev->next=temp->next;
    temp->next->prev=temp->prev;
    temp->next=NULL;
    temp->prev=tail;
    return head;
    
}
int main() {
    struct node *head=NULL;
    int n;
    char s[100];
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%s",s);
        head=create(s,head);
    }
    //display(head);
    int r=n/2;
    head=del(r,head);
    display(head);
}
