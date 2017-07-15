import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by antonandreev on 09/07/2017.
 */
public class Event {
    private int id = new Random().nextInt();
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
