package joiner.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Student;
import joiner.service.StudentService;
import joiner.util.InitApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by distanceN on 2015/6/13.
 */
public class StudentLoginAction extends ActionSupport {
    private StudentService studentService;
    private Student student;
    public StudentLoginAction() {
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        studentService = (StudentService) context.getBean("studentService");
    }
    @Override
    public String execute() throws Exception {
        System.out.println(student.getStudentName());
        if (!isValid(student.getStudentName())) {
            System.out.println("ERROR in get student name");
            return INPUT;
        }
        if (!isValid(student.getStudentPassword())) {
            System.out.println("ERROR2 in get student password");
            return INPUT;
        }
        if(!studentCheck(student)){
            System.out.println("ERROR in check student");
            return ERROR;
        }
        System.out.println("SUCCESS");
        ActionContext.getContext().getSession().put("student" , student);
        return SUCCESS;
    }
    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
    }
    public boolean studentCheck(Student student) {
        System.out.print("ERROR inside student check, student name: ");
        System.out.println(student.getStudentName());
        List<Student> studentList = studentService.findStudentsByName(student.getStudentName());
        if (studentList == null || studentList.size() < 1) {
            return false;
        }
        Student checkStudent = studentList.get(0);
        System.out.println("Student name: " + checkStudent.getStudentName()
                + "\nStudent Id: " + checkStudent.getStudentId());
        if (student.getStudentName().equals(checkStudent.getStudentName()) && student.getStudentPassword().equals(checkStudent.getStudentPassword())) {
            return true;
        }
        System.out.println("Student name or student password is wrong, please check!");
        return false;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
