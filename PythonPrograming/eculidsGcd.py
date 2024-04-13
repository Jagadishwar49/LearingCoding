def gcd(m,n):
    if(n>m):
        (m,n)=(n,m)
    if(m%n==0):
        return(n)
    return(gcd(n,m%n))

if __name__=="__main__":
    print(gcd(36,12))
