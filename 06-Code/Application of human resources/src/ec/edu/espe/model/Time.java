
package ec.edu.espe.model;

/**
 *
 * @author Maisincho Richar 
 */
public class Time {
    //atributos
    String entrytime;
    String lunchtime;
    String departuretime;
    
    int time;

    @Override
    public String toString() {
        return "Time{" + "entrytime=" + entrytime + ", lunchtime=" + lunchtime + ", departuretime=" + departuretime + ", time=" + time + '}';
    }

    public Time(String entrytime, String lunchtime, String departuretime, int time) {
        this.entrytime = entrytime;
        this.lunchtime = lunchtime;
        this.departuretime = departuretime;
        this.time = time;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public void setLunchtime(String lunchtime) {
        this.lunchtime = lunchtime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public String getLunchtime() {
        return lunchtime;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public int getTime() {
        return time;
    }
    
    //metodo
    
    public static void main(String[] args){
        
    }

       
    
}
