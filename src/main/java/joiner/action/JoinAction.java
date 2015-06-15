package joiner.action;

import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Activity;
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
    private ActivityService activityService;
    private Activity activity;
    private StudentService studentService;
    private Student student;
    private LinkService linkService;

    public JoinAction() {
        System.out.println("JoinAction constructing");
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        activityService = (ActivityService) context.getBean("activityService");
        studentService = (StudentService) context.getBean("studentService");
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
    }

    public ActivityService getActivityService() {
        return activityService;
    }

    public Activity getActivity() {
        return activity;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setActivityService(ActivityService activityService) {
        this.activityService = activityService;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
