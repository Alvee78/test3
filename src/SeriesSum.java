public class SeriesSum {
    private  int result;
    public SeriesSum(){
        result=0;
    }
    public int seriesSum(int highestNumber){
        for (int loopCount = 0 ; loopCount <= highestNumber ; loopCount++){
            result = result + loopCount ;
        }
        return result;
    }


}
