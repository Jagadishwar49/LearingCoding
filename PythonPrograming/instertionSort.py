def insertionSort(l):
    for i in range(len(l)):
        pos=i;
        while(pos>0 and l[pos]<l[pos-1]):
            (l[pos],l[pos-1])=(l[pos-1],l[pos])
            pos=pos-1
    return(l)

if __name__=="__main__":
    print(insertionSort([2,4,5,1,3,7,6,9,8]))

