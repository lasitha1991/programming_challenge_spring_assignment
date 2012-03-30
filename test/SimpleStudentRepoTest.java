/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.cse.springtute.SimpleStudentRepository;
import org.cse.springtute.Student;
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
public class SimpleStudentRepoTest {
    private static Student s;
    private static SimpleStudentRepository r;
    public SimpleStudentRepoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        r=new SimpleStudentRepository();
        s=new Student();
        s.setFirstName("Lasitha");
        s.setLastName("Weerasinghe");
        s.setAddress("ABC/DEF");
        s.setRegNumber(123456);
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
    public void testSaveStudent(){        
        r.saveStudent(s);
        System.out.println("Student is "+r.findStudent(s.getRegNumber()).getFirstName());
    }
    
    @Test
    public void testDeleteStudent(){
        r.deleteStudent(s);
        Assert.assertEquals("Null Expected",null,r.findStudent(s.getRegNumber()));
    }
    @Test
    public void testUpdateStudent(){
        s.setFirstName("LKASDDFf");
        r.updateStudent(s);
        System.out.println("Student is "+r.findStudent(s.getRegNumber()).getFirstName());
    }

}