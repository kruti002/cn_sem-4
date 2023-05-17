// Bit Stuffing

#include<stdio.h>
#include<string.h>

int main(){
    char input[50], output[50];
    int count = 0;
    int i, j;
    printf("Bit Stuffing \n");
    printf("Enter the string to be stuffed : ");
    scanf("%s", input);
    printf("Data Before Stuffing : %s\n", input);
    j = 0;
    count = 0;
    for(i=0;i<strlen(input);i++){
        output[j] = input[i];
        if(input[i] == '1'){
            count++;
        }
        else{
            count = 0;
        }
        if(count == 5){
            output[j+1] = '0';
            j++;
            count = 0;
        }
        j++;
    }
    
    printf("Data after Stuffing  : %s\n", output);
    
    j = 0;
    count = 0;
    for(i=0;i<strlen(output);i++){
        input[j] = output[i];
        if(output[i] == '1'){
            count++;
        }
        else{
            count = 0;
        }
        if(count == 5 && output[i+1] == '0'){
            i++;
            count = 0;
        }
        j++;
    }
    
    printf("Data received : %s", input);
    return 0;
}


