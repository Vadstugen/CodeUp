long long int f(int n){
    long long sum = 1;
    for(int i=2; i<=n; i++){
        sum *= i;
    }
    return sum;
}
