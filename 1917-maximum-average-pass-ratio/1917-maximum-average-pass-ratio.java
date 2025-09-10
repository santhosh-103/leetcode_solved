import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
                (a, b) -> Double.compare((b[0] + 1) / (b[1] + 1) - b[0] / b[1], (a[0] + 1) / (a[1] + 1) - a[0] / a[1]));
        for (int[] c : classes)
            pq.add(new double[] { c[0], c[1] });
        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            top[0]++;
            top[1]++;
            pq.add(top);
        }
        double sum = 0;
        while (!pq.isEmpty()) {
            double[] c = pq.poll();
            sum += c[0] / c[1];
        }
        return sum / classes.length;
    }
}
