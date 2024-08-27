class Solution {
public:
    int minEle(vector<int>& arr){
        int lo=0;
        int n=arr.size();
        int hi=n-1;
        int mid;
        while(lo<hi){
		mid=(lo+hi)/2;
		if(arr[mid]>arr[hi]){
			lo=mid+1;
		}
		else if(arr[mid]<arr[hi]){
			hi=mid;
		}
	}
	return lo;
    }
    int search(vector<int>& arr, int key) {
        int pivot=minEle(arr);
        int n=arr.size();
        int lo=0;
        int hi=n-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            int rm=(mid+pivot)%n;
            if(arr[rm]==key){
                return rm;
            }
            else if(arr[rm]>key){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;
    }
};
