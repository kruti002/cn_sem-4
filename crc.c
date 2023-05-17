#include<stdio.h>
#include<string.h>
int main(){
    printf("Cyclic Redundancy Check\n");
    int temp[20],dividend[20];
    int divisor[5];
    int rem[5];
    int n,m,i,j;
    printf("Enter the size of the dividend : ");
    scanf("%d",&n);
    printf("Enter the dividend : ");
    for(i=0;i<n;i++){
        scanf("%d", &dividend[i]);
        temp[i] = dividend[i];
    }
    printf("Enter the size of the divisor : ");
    scanf("%d",&m);
    printf("Enter the divisor : ");
    for(i=0;i<m;i++){
        scanf("%d", &divisor[i]);
    }
    
    for(i=n;i<m-1;i++){
        dividend[i] = 0;
    }
    
    for(i=0;i<n;i++){
        int temp = i;
        if(dividend[i] == 1){
            for(j=0;j<m;j++){
                if(dividend[temp] == divisor[j]){
                    dividend[temp] = 0;
                    rem[j] = 0;
                }
                else{
                    rem[j] = 1;
                    dividend[temp] = 1;
                }
                temp = temp+1;
            }
        }
    }
    printf("The remainder is : ");
    for(i=0;i<m;i++){
        printf("%d ", rem[i]);
    }
    printf("\nThe final data to be sent is : ");
    for(i=0;i<n;i++){
        printf("%d", temp[i]);
    }
    for(i=1;i<m;i++){
        printf("%d", rem[i]);
    }
    
    
    
    return 0;
}


