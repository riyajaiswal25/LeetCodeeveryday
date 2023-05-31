class MyClass{
    String stName;
    int time;
    MyClass(String stName,int time){
        this.stName=stName;
        this.time=time;
    }
}
class AvgTime{
    double avgTime;
    int count;
    AvgTime(double avgTime,int count){
        this.avgTime=avgTime;
        this.count=count;
    }
}

class UndergroundSystem {
    HashMap<Integer,MyClass> traveller;
    HashMap<String,AvgTime> timeMap;

    public UndergroundSystem() {
        traveller=new HashMap<>();
        timeMap=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        if(traveller.containsKey(id)){
            traveller.remove(id);
        }
        traveller.put(id,new MyClass(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        MyClass startingInfo=traveller.get(id);
        String startingStation=startingInfo.stName;
        int startingTime=startingInfo.time;
        String path=startingStation+"<->"+stationName;
        double travelDuration=t-startingTime;
        if(timeMap.containsKey(path)){
            AvgTime obj=timeMap.get(path);
            double avgTime=obj.avgTime;
            int count=obj.count;
            double res=(double)((double)(avgTime*count)/(count+1)+(double)(travelDuration/(count+1)));
            timeMap.put(path,new AvgTime(res,count+1));
        }
        else{
            timeMap.put(path,new AvgTime(travelDuration,1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String path=startStation+"<->"+endStation;
        return timeMap.get(path).avgTime;
    }
}


/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */