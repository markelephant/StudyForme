package orderSubjectMode;


public class ObserverFor3D implements Observer {

    private String name;
    private Subject subject;

    public ObserverFor3D(String msg, Subject subject) {
        this.name = msg;
        this.subject = subject;

        subject.registerSub(this);
    }

    @Override
    public void update(String msg) {

        System.out.println(name + msg);
    }
}
