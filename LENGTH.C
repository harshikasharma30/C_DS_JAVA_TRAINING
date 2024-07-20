// Online C compiler to run C program online
#include <stdio.h>

int main() {
    char name[100];
    int i, length=0;
    printf("Enter the name : ");
    scanf("%s",&name);
    for(i=0; name[i]!='\0'; i++){
        length++;
    }
    printf("%d",length);
    return 0;
}