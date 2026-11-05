class MyCalendar {
    private List<int[]>calendar;

    public MyCalendar() {
        calendar=new ArrayList<>();
        
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] intervals:calendar){
            // if(intervals[1]>startTime&&endTime>intervals[0]){
            //     return false;
            // }
            if (startTime < intervals[1] && intervals[0] < endTime) {
    return false; // Overlap detected
}
        }
        calendar.add(new int[]{startTime,endTime});
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */