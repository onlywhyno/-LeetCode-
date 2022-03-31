n,m=map(int,input().split())
j=1
if n<=0 or n>100 or m<=0 or m>100:        #注意题目的要求1<=n，m<=5
  exit(0)
j=m**n
print("1/%d"%j)