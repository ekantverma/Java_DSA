import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // - (if end array not in sorted, so sorted process is
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // sort activities 2d array - Lambda Function - shortform) -
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // // end time basis sorted
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // // 1st Activity
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];
        // for (int i = 1; i < end.length; i++) {
        // if (start[i] >= lastEnd) {
        // // acitivity selection
        // maxAct++;
        // ans.add(1);
        // lastEnd = end[i];
        // }
        // }
        // System.out.println("max activity " + maxAct);
        // for (int j = 0; j < ans.size(); j++) {
        // System.out.print("A" + ans.get(j) + " ");
        // }
        // System.out.println();

        // So lets change code to without sorting ending index
        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // acitivity selection
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activity " + maxAct);
        for (int j = 0; j < ans.size(); j++) {
            System.out.print("A" + ans.get(j) + " ");
        }
        System.out.println();
    }
}
