class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n=gas.length;
        
        //here we define 3 variable
        //total=find how much is needed to complete the length
        //gasInTank= if any where in the traverse it goes -ve we cant move forward
        //IndexUpdate=in the above case we will start from the next index
        
        int total=0,indexUpdate=0,gasInTank=0;
        for(int i=0;i<n;i++){
            int expense=gas[i]-cost[i];
            
            gasInTank+=expense;
            total+=expense;
            if(gasInTank<0){
                indexUpdate=i+1;
                gasInTank=0;
            }
        }
        //if our total is-ve means we cant complete the track
        if(total>=0) return indexUpdate;
        else return -1;
    }
}