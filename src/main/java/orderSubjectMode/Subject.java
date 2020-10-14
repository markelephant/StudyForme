package orderSubjectMode;

public interface Subject {
    public void registerSub(Observer ob);

    public void unregistSub(Observer ob);

    public void subcribe(String msg);


}
