package orderSubjectMode;

import java.util.ArrayList;
import java.util.List;

public class Subject3dLoli implements Subject {

    private String msg;

    private List<Observer> observers =new ArrayList<>();
    @Override
    public void registerSub(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void unregistSub(Observer ob) {
        if(observers.indexOf(ob)>0){
            observers.remove(ob);
        }
    }

    @Override
    public void subcribe(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        subcribe(msg);
    }
}
