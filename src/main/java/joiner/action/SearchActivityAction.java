package joiner.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Activity;
import joiner.entity.Student;
import joiner.service.ActivityService;
import joiner.service.StudentService;
import joiner.util.InitApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by distanceN on 2015/6/14.
 */
public class SearchActivityAction extends ActionSupport {
    private StudentService studentService;
    private Student student;
    private ActivityService activityService;
    private Activity activity;
    public SearchActivityAction() {
        System.out.println("SearchActivityAction constructing");
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        System.out.println("Context ok");
        studentService = (StudentService) context.getBean("studentService");
        activityService = (ActivityService) context.getBean("activityService");
    }
    @Override
    public String execute() throws Exception {
        if (student == null) {
            System.out.println("student is null");
        }
        System.out.println(student.getStudentId());
        if (!isValid(student.getStudentId())) {
            System.out.println("ERROR in get student name");
            return INPUT;
        }

        System.out.println("SUCCESS");
        ActionContext.getContext().getSession().put("student" , student);
        List<Activity> activityList = activityService.findActivitysByName(activity.getActivityName());
        ActionContext.getContext().getSession().put("activityList1", activityList);
        return SUCCESS;
    }
    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
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
}