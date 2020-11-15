public class Ball {

    private int count = 0;

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void print() {
        if (this.count != 0) {
            String name = "볼";
            System.out.printf("%d%s", this.count, name);
        }
    }
}
