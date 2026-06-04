#include<stdio.h>
void main(){
    int n,x=125;
    scanf("%d",&n);
    if(n==x){
        printf("You found it");
    }
    else if(n<x){
        printf("Its higher than you think");
    }
    else{
        printf("It's lower than you think");
    }
}