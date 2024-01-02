#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *right;
    struct node *left;
};
struct node *new(int x){
    struct node *n=(struct node *)malloc(sizeof(struct node));
    n->data=x;
    n->right=n->left=NULL;
    return n;
}
struct node *create(struct node *root,int x){
    if(root==NULL){
        root=new(x);
        return root;
    }
    if(root->data>x){
        root->left=create(root->left,x);
    }
    else if(root->data<x){
        root->right=create(root->right,x);
    }
    return root;
}
void post(struct node *root){
    if(root==NULL){
        return ;
    }
    post(root->left);
    post(root->right);
    printf("%d ",root->data);
}
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    struct node *root=NULL;
    int x;
    scanf("%d",&x);
    while(x>0){
        root=create(root,x);
        scanf("%d",&x);
    }
    printf("Post order : ");
    post(root);
    return 0;
}