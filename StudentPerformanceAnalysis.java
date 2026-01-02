public class StudentPerformanceAnalysis {
    public static void main(String[] args) {
        // Node 1: Start
        int totalModules = 5;      // Node 2
        int weakCount = 0;         // Node 3

        int[] moduleMarks = {72, 45, 60, 38, 81};
        // Node 4: Loop through modules
        for (int i = 0; i < totalModules; i++) {
            // Node 5: Read module mark
            int mark = moduleMarks[i];
            // Node 6: Decision
            if (mark < 50) {
                // Node 7: Increment weak counter
                weakCount++;
            }
            // Node 8: Else branch exists logically (satisfactory case)
        }
        // Node 10: End - final output
        System.out.println("Total weak performance areas: " + weakCount);
    }
}
