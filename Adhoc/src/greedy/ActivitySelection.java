package greedy;

public class ActivitySelection {

	public static void main(String[] args) {
        int[] start = new int[]{41, 13, 4, 70, 10, 58, 61, 34, 100, 79};
        int[] end = new int[]{68, 39, 12, 97, 13, 66, 82, 38, 120, 99};
        ActivitySelection.maxActivity(start, end);
    }

    private static void maxActivity(int[] start, int[] end) {
        int i = 0;
        int j = 0;
        int act = 0;
        int max = 0;
        while (i < start.length) {
            System.out.println("compairing:" + start[i] + " " + end[j]);
            if (start[i] < end[j]) {
                System.out.println("start is smaller");
                System.out.println("Act: " + ++act);
                if (act == 1) {
                    System.out.println("updating max value to: " + ++max);
                }
                ++i;
                continue;
            }
            System.out.println("decrementing act from " + act);
            act = 0;
            ++j;
        }
        System.out.println(max);
    }
}
