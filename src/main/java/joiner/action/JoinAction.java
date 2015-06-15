package joiner.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Activity;
import joiner.entity.Link;
import joiner.entity.Student;
import joiner.service.ActivityService;
import joiner.service.LinkService;
import joiner.service.StudentService;
import joiner.util.InitApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by distanceN on 2015/6/15.
 */
public class JoinAction extends ActionSupport {
    private StudentService studentService;
    private Student student;
    private ActivityService activityService;
    private Activity activity;
    private LinkService linkService;
    private Link link;
    public JoinAction() {
        System.out.println("StudentLoginAction constructing");
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        System.out.println("Context ok");
        studentService = (StudentService) context.getBean("studentService");
        activityService = (ActivityService) context.getBean("activityService");
        linkService = (LinkService) context.getBean("linkService");
    }
    @Override
    public String execute() throws Exception {
        System.out.println(student.getStudentName());
        if (!isValid(student.getStudentId())) {
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

        if (linkService.makeJoin(link)) {
            System.out.println("SUCCESS");
            ActionContext.getContext().getSession().put("student" , student);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
    }
    public boolean studentCheck(Student student) {
        System.out.print("Inside student check, student id: ");
        System.out.println(student.getStudentId());
        Student checkStudent = studentService.findStudentById(student.getStudentId());
        if (checkStudent == null) {
            System.out.println("No such student with student id: "
                    + student.getStudentId());
            return false;
        }
        System.out.println("Student name: " + checkStudent.getStudentName()
                + "\nStudent Id: " + checkStudent.getStudentId()
                + "\npassword: " + checkStudent.getStudentPassword());
        if (checkStudent.getStudentId().equals(student.getStudentId())
                && checkStudent.getStudentPassword().equals(student.getStudentPassword())) {
            student.setStudentName(checkStudent.getStudentName());
            System.out.println("Student id and password correct!");
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

    public ActivityService getActivityService() {
        return activityService;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setActivityService(ActivityService activityService) {
        this.activityService = activityService;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public LinkService getLinkService() {
        return linkService;
    }

    public Link getLink() {
        return link;
    }

    public void setLinkService(LinkService linkService) {
        this.linkService = linkService;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}