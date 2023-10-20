public class Time {
    public int hours;
    public int minutes;
    public Time addTime(Time otherTime){
        otherTime.hours += this.hours;
        otherTime.minutes += this.minutes;
        if(otherTime.minutes > 59){
            otherTime.minutes -= 60;
            otherTime.hours += 1;
        }
        if(otherTime.hours > 23){
            otherTime.hours -= 24;
        }
        return otherTime;
    }
}
