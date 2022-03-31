#include<bits/stdc++.h>
using namespace std;
int flag;
string a,b;
int len;
int k;
int _check1(int len) {
    int i,j;
    for( i=0; i<len; i++) {
        if(a[i]!=b[i]&&fabs(a[i]-b[i])!=32) {
            k--;    //只要有一个不相等，就计数 -1
            //最后我只要判断小于0就满足第4种情况,等于0就是完全相等 
        }
 
        if(a[i]!=b[i] && fabs(a[i]-b[i])==32) {
            k++;// 如果满足条件3大小写不同的话，K应该等于len
        }
        /*if(a[i]==b[i]){ 
           
            k+=2;//如果满足条件2 完全相等的话，k最后应该是len的两倍
        }
        */
 
    }
    if(k==0)//如果没有不相等，则K=0
        return  flag = 2;
    if(k<0) 
    return flag =4;
    if(k>0) 
    return flag =3;
 
}
int main() {
    cin>>a>>b;
    int len1 = a.size();
    int len2 = b.size();
    if(len1 == len2) {
        _check1(len1);
        printf("%d",flag);
    }
     
else {
    flag=1;
    printf("%d",flag);
}
return 0;
 
}