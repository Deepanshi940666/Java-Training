#include<iostream>
using namespace std;

// int diagonalSum(int a[][]){

// }

int main(){
    int a[3][3]={(1,2,3),(1,2,3),(1,2,3)};
    // int sum=0;
    int b[3][3];
    for(int i=0; i<3;i++){
        for(int j=0; j<3; j++){
           b[j][i]= a[i][j];
        }
    }
   for(int i=0; i<3; i++){
    for(int j=0;j<3; j++){
        cout<<b[i][j];
    }
   }
}