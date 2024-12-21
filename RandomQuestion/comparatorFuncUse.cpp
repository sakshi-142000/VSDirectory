#include <iostream>
using namespace std;

bool compare (int a, int b){
    if(a>b) return true;
    else return false;
}

int main(){
    
    int a[8]={1,2,3,4,5,6,7,0};
    for(auto i:a) cout<<i<<" ";
    cout<<endl;
    sort(a, a+8, compare);
    for(auto i:a) cout<<i<<" ";
    return 0;
}