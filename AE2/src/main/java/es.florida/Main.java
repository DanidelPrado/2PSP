package es.florida;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MemberCreator miembro1 = new MemberCreator();
        MemberMonitor miembro2 = new MemberMonitor();
        Thread monitorThread = new Thread(miembro2);
        Thread creatorThread = new Thread(miembro1);
        creatorThread.start();
        monitorThread.start();
        creatorThread.join();
        monitorThread.join();
    }

}
