package joiner.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Activity;
import joiner.entity.Organizer;
import joiner.service.ActivityService;
import joiner.service.OrganizerService;
import joiner.util.InitApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by Feiz on 2015/6/14.
 */
public class ActivityDetailActionForOrg extends ActionSupport {
    private ActivityService activityService;
    private Activity activity;
    private Organizer organizer;
    private OrganizerService organizerService;
    public ActivityDetailActionForOrg() {
        System.out.println("ActivityDetailActionForOrg constructing");
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        activityService = (ActivityService) context.getBean("activityService");
        organizerService=(OrganizerService) context.getBean("organizerService");
    }
    @Override
    public String execute() throws Exception {
        System.out.println("Begin");
        if (!isValid(organizer.getOrganizerName())) {
            System.out.println("ERROR in get organizer name");
            return INPUT;
        }
        List<Activity> activityList = activityService.findActivitysByOrganizer(organizer.getOrganizerName());
        System.out.println("SUCCESS");
        ActionContext.getContext().getSession().put("activityList" , activityList);
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

    public void setActivityService(ActivityService activityService) {
        this.activityService = activityService;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Organizer getOrganizer(){return organizer;}
}