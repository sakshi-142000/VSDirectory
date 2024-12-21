#include <iostream>
#include<vector>
using namespace std;

bool compare(vector<int> &a, vector<int> &b){
    if(a[2]<b[2]) return true;
    else return false;
}

int main(){
    vector<vector<int> > test;
    test.push_back({1,2,5});
    test.push_back({1,2,3});

    //for(auto i:test) cout<<i[2];

    sort(test.begin(), test.end(), compare);

    for(auto i:test) cout<<i[2];

    return 0;
}