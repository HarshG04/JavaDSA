public class Main {
   public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int version = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isBadVersion(mid)){
                version = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }

        return version;
    }
}
