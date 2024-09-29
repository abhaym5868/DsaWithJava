int main() { printf("no. element in arrau"); 
scanf("%d",&n); 
for(i=0;i<=n;i++){
    int A[i];scanf("%d",&A[i]);
    } 
    int A[];
    int size = sizeof(A) / sizeof(A[0]); 
    int count = 0; 

   
    for (int i = 0; i < size; i++) {
        if (A[i] == 0) {
            count++;
        }
    }

  
    printf("No of zero = %d\n", count);

    return 0;
}

