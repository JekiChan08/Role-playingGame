package plot.endings;

public class AttackingEnemyThroughTime extends Thread{
    private boolean doRun = true;
    private boolean madeMove = false;

    @Override
    public void run() {
        while (doRun) {

        }
    }
    public void makeStop() {
        this.doRun = false;
    }
}
