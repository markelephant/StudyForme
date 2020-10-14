package orderSubjectMode;

public class SubTest {

    public static void main(String[] args) {

        Subject sb = new Subject3dLoli();

        Observer o1 = new ObserverFor3D("xias",sb);
        Observer o2 = new ObserverFor3D("sdfs1",sb);
        Observer o3 = new ObserverFor3D("sdfs",sb);

        sb.unregistSub(o2);
        sb.subcribe("  大家好，我们要努力！");

    }
}
