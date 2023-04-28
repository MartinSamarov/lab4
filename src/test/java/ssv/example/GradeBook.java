import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Integer> studentGrades;
    private Map<String, Integer> assignmentMaxScores;

    public GradeBook() {
        studentGrades = new HashMap<>();
        assignmentMaxScores = new HashMap<>();
    }

    public void addStudent(String studentName) {
        studentGrades.put(studentName, null);
    }

    public void addAssignment(String assignmentName, int maxScore) {
        assignmentMaxScores.put(assignmentName, maxScore);
    }

    public void addGrade(String studentName, String assignmentName, int score) {
        studentGrades.put(studentName, score);
    }

    public int getStudentCount() {
        return studentGrades.size();
    }

    public int getAssignmentCount() {
        return assignmentMaxScores.size();
    }

    public int getGrade(String studentName, String assignmentName) {
        Integer score = studentGrades.get(studentName);
        if (score != null && assignmentMaxScores.containsKey(assignmentName)) {
            return score;
        }
        return -1; // Return -1 if grade or assignment not found
    }
}
