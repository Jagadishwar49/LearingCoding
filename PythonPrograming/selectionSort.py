def selectionSort(l):
    for i in range(len(l)):
        minpos=i
        for j in range(i,len(l)):
            if(l[minpos]>l[j]):
                minpos=j
        (l[i],l[minpos])=(l[minpos],l[i])
    return(l)

if __name__=="__main__":
    print(selectionSort([2,4,5,1,3,7,6,9,8]))
