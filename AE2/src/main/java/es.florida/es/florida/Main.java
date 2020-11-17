package es.florida;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        es.florida.MemberCreator miembro1 = new es.florida.MemberCreator();
        es.florida.MemberMonitor miembro2 = new es.florida.MemberMonitor();
        Thread monitorThread = new Thread(miembro2);
        Thread creatorThread = new Thread(miembro1);
        creatorThread.start();
        monitorThread.start();
        creatorThread.join();
        monitorThread.join();
    }

}
