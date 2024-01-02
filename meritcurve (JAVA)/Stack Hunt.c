#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
char stack[100];
int top=-1;
void push(char c){
    top+=1;
    stack[top]=c;
}
char pop(){
    return stack[top--];
}
int main() {
    char c[100];
    scanf("%s",c);
    for(int i=0;i<strlen(c);i++){
        push(c[i]);
    }
    for(int i=0;i<strlen(c);i++){
        char q=pop();
        printf("%c",q);
    }
    
    
}
