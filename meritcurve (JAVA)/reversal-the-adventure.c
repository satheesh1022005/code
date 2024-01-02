#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int stack[100];
int queue[100];
int front=-1,rear=-1;
int top=-1;
void push(int c){
    top+=1;
    stack[top]=c;
}
int pop(){
    return stack[top--];
}
void en(int x){
    if(front==-1&&rear==-1){
        front=0;
        rear=0;
        queue[rear]=x;
    }
    else{
        rear++;
        queue[rear]=x;
    }
}
int de(){
    if(front==rear){
        int r=queue[rear];
        front=rear=-1;
        return r;
    }
    else {
        return queue[front++];
    }
}
int main() {
    int n,x;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&x);
        push(x);
    }
    for(int i=0;i<n;i++){
        x=pop();
        en(x);
    }
    for(int i=front;i<=rear;i++){
        printf("%d ",queue[i]);
    }
    
}