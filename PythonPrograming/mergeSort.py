def merge(L,R):
    (c,m,n)=([],len(L),len(R))
    (i,j)=(0,0)
    while((i+j)<(m+n)):
        if(i==m):
            c.append(R[j])
            j=j+1
        elif(j==n):
            c.append(L[i])
            i=i+1
        elif(L[i]<=R[j]):
            c.append(L[i])
            i=i+1
        elif(L[i]>R[j]):
            c.append(R[j])
            j=j+1
    return(c)

def mergeSort(l,left,right):
    if(right-left<=1):
        return(l[left:right])
    if (right-left>1):
        mid=(right+left)//2
        L=mergeSort(l,left,mid)
        R=mergeSort(l,mid,right)
        return(merge(L,R))


if __name__=="__main__":
    l=[2,4,5,1,3,7,6,9,8]
    print(mergeSort(l,0,len(l)))

