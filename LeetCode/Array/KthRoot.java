public class Kth_Root {
    public static void main(String[] args) {
        int n = 143;
        int k = 3;
        System.out.println(search(n,k));

    }
    public static int root(int n, int k){
        int low = 1;
        int high = n;
        int mid = -1;
        while(low<=high){
            mid = (low+high)/2;
            int pow = (int)Math.pow(mid,k);
            if(pow==n) return mid;
            else if(pow<n){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return mid;
    }
}
