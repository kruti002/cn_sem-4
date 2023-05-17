#include<stdio.h>
#include<string.h>

int main(){
    printf("Byte Stuffing\n");
    char input[50];
    printf("Enter the Message : ");
    scanf("%s", input);
    printf("Data before byte Stuffing : %s\n", input);
    printf("Data after byte Stuffing  : ");
    printf("F");
    for(int i = 0;i<strlen(input);i++){
        if(input[i] == 'E'){
            printf("EE");
        }
        else if(input[i] == 'F'){
            printf("EF");
        }
        else{
            printf("%c", input[i]);
        }
    }
    
    printf("F");
    return 0;
}
