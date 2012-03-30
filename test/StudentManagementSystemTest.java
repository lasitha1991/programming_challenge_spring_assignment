/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.cse.springtute.Student;
import org.cse.springtute.StudentManagementSystem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 100577a
 */
public class StudentManagementSystemTest {
    private static StudentManagementSystem sms;
    private static Student s;

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        sms=new StudentManagementSystem();
        s=new Student(100000, "AAAA", "WWWW", "EEEEE");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testAddNewStudent(){
        sms.registerStudent(s);
        sms.listAllStudents();
    }

}