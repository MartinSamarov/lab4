import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradeTest {

    @Test
    public void testAddStudent() {
        // Test logic for adding a student
        GradeBook gradeBook = new GradeBook();
        gradeBook.addStudent("John Doe");
        assertEquals(1, gradeBook.getStudentCount());
    }

    @Test
    public void testAddAssignment() {
        // Test logic for adding an assignment
        GradeBook gradeBook = new GradeBook();
        gradeBook.addAssignment("Math Quiz", 100);
        assertEquals(1, gradeBook.getAssignmentCount());
    }

    @Test
    public void testAddGrade() {
        // Test logic for adding a grade
        GradeBook gradeBook = new GradeBook();
        gradeBook.addStudent("John Doe");
        gradeBook.addAssignment("Math Quiz", 100);
        gradeBook.addGrade("John Doe", "Math Quiz", 90);
        assertEquals(90, gradeBook.getGrade("John Doe", "Math Quiz"));
    }

    @Test
    public void testIntegration() {
        // Test logic for integrating all three functionalities
        GradeBook gradeBook = new GradeBook();
        gradeBook.addStudent("John Doe");
        gradeBook.addAssignment("Math Quiz", 100);
        gradeBook.addGrade("John Doe", "Math Quiz", 90);
        assertEquals(1, gradeBook.getStudentCount());
        assertEquals(1, gradeBook.getAssignmentCount());
        assertEquals(90, gradeBook.getGrade("John Doe", "Math Quiz"));
    }
}
