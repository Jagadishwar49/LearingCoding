def BinarySearch(list,v,l,r):
    if(r-l==0):
        return("Value is not present")
    mid=(l+r)//2
    if(v==list[mid]):
        return("Value is present")
    if(v>list[mid]):
        return(BinarySearch(list,v,mid+1,r))
    else:
        return(BinarySearch(list,v,l,mid))

if __name__=="__main__":
    list=[2,6,3,4,8,9,34]
    print(BinarySearch(list,12,0,len(list)-1))
