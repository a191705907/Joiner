package joiner.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Activity;
import joiner.entity.Student;
import joiner.service.ActivityService;
import joiner.service.StudentService;
import joiner.util.InitApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by distanceN on 2015/6/14.
 */
public class ActivityDetailForStuAction extends ActionSupport {
    private ActivityService activityService;
    private Activity activity;
    private StudentService studentService;
    private Student student;
    public ActivityDetailForStuAction() {
        System.out.println("ActivityDetailActionForStu constructing");
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        activityService = (ActivityService) context.getBean("activityService");
        studentService = (StudentService) context.getBean("studentService");
    }
    @Override
    public String execute() throws Exception {
        System.out.println(activity.getActivityId());
        if (!isValid(activity.getActivityId())) {
            System.out.println("ERROR in get activity id");
            return INPUT;
        }
        Activity checkActivity = activityService.findActivityById(activity.getActivityId());
        if (checkActivity == null) {
            System.out.println("No such activity with activity id: "
                    + activity.getActivityId());
            return ERROR;
        }
        System.out.println("SUCCESS");
        ActionContext.getContext().getSession().put("activity", checkActivity);
        ActionContext.getContext().getSession().put("student", student);

        int joinedByStudent = 0;
        if (activityService.joinedByStudent(student.getStudentId())) {
            joinedByStudent = 1;
        } else {
            joinedByStudent = 0;
        }
        ActionContext.getContext().getSession().put("joinedByStudent", joinedByStudent);

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