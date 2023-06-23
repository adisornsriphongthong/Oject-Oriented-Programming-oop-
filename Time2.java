import java.sql.Time;

public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public Time2(int h){
        //this.hour = h;
        //this.minute = 0;
        //this.second = 0;
        this(h,0,0);
    }
    public Time2(int h, int m){
        this.hour = h;
        this.minute = m;
        this.second = 0;
    }
    public Time2(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
     public Time2(Time2 time){
        //this.hour = time.getHour();
        ///this.minute = time.getMinute();
        //this.second = time.getSecond();
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    //refactor
    

    //mutator
    public void setHour(int h){
        this.hour = ((h >=0 && h < 24) ? h: 0);
    }
    public void setMinute(int m){
        this.minute = (( m >= 0 && m < 60) ? m:0);
    }
    public void setSecond(int s){
        this.second = ((s>=0 && s < 60) ? s:0);
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }


    public String toUniversalString(){
        if(this.hour > 24){
            this.hour = 0;
            if(this.minute > 60){
                this.minute = 0;
                if(this.second > 60){
                    this.second = 0;
                }
            }
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}

class Time2Test{
    public static void main(String[] args){
        Time2 time1 = new Time2();
        Time2 time2 = new  Time2(2);
        Time2 time3 = new  Time2(21, 34);
        Time2 time4 = new  Time2(12, 25, 42);
        Time2 time5 = new  Time2(77, 77);
        Time2 time6 = new  Time2(time4);
        System.out.println(time1.toUniversalString());
        System.out.println(time2.toUniversalString());
        System.out.println(time3.toUniversalString());
        System.out.println(time4.toUniversalString());
        System.out.println(time5.toUniversalString());
        System.out.println(time6.toUniversalString());
    }
}


/*package TimeTest;

public class Time2 {

    // instance variables
    private int hour;
    private int minute;
    private int second;

    //constructor
    public Time2() 
    
    {
        this.hour = 0 ;
        this.minute = 0 ;
        this.second = 0 ;
    }

    public Time2(int h)

    {
        this.hour = h ;
        this.minute = 0 ;
        this.second = 0 ;
    }

    public Time2(int h,int m)
    
    {
        this.hour = h ;
        this.minute = m ;
        this.second = 0 ;
    }

    public Time2(int h,int m,int s)
    
    {
        setHour(h); //this.hour = h ;
        setMinute(m); //this.minute = m ;
        setSecond(s); //this.second = s ;
    }

    public Time2(Time2 time)
    
    {
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
    }

    // @return the hour คือชั่วโมงที่ส่งออกมา
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //data variation
    public void setHour(int hour){
        this.hour = (hour >= 0 && hour <= 24)? hour : 0;
    }

    public void setMinute(int minute){
        this.minute = (minute >= 0 && minute < 60)? minute : 0;
    }

    public void setSecond(int second){
        this.second = (second >= 0 && second < 60)? second : 0;
    }

    public void setTime (int h, int m, int s) {
    hour = ((h >=0 && h < 24) ? h: 0);
    minute = (( m >= 0 && m < 60) ? m:0);
    second = ((s>=0 && s < 60) ? s:0);
    }
    public String toUniversalString(){
    	return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    public String toString () {
    	return String.format("%d:%02d:%02d %s",((hour==0 || hour==12) ? 12 : hour % 12), 
    minute,second,(hour < 12 ? "AM":"PM"));
    }


} */


