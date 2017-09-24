package edu.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Evgeniy on 17.09.2017.
 */
public class Event {

    private int id = new Random().nextInt();

    private String msg;

    private Date date;

    private DateFormat df;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public Event() {
    }

    @Override
    public String toString() {
        return df.format(date);
    }
}
