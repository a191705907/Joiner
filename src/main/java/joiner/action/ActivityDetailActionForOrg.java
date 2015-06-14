package joiner.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import joiner.entity.Activity;
import joiner.service.ActivityService;
import joiner.util.InitApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by Feiz on 2015/6/14.
 */
public class ActivityDetailActionForOrg extends ActionSupport {
    private ActivityService activityService;
    private Activity activity;
    public ActivityDetailActionForOrg() {
        System.out.println("ActivityDetailActionForOrg constructing");
        ApplicationContext context = InitApplicationContext.getApplicationContext();
        activityService = (ActivityService) context.getBean("activityService");
    }
    @Override
    public String execute() throws Exception {
        System.out.println(activity.getActivityId());
        if (!isValid(activity.getActivityId())) {
            System.out.println("ERROR in get activity id");
            return INPUT;
        }
        if(!activityCheck(activity)){
            System.out.println("ERROR in check activity");
            return ERROR;
        }
        System.out.println("SUCCESS");
        ActionContext.getContext().getSession().put("activity" , activity);
        return SUCCESS;
    }
    public boolean isValid(String keyword) {
        return keyword != null && keyword != "";
    }
    public boolean activityCheck(Activity activity) {
        System.out.print("Inside activity check, activity id: ");
        System.out.println(activity.getActivityId());
        Activity checkActivity = activityService.findActivityById(activity.getActivityId());
        if (checkActivity == null) {
            System.out.println("No such activity with activity id: "
                    + activity.getActivityId());
            return false;
        }
        System.out.println("Activity name: " + checkActivity.getActivityName()
                + "\nActivity Id: " + checkActivity.getActivityId());
        if (checkActivity.getActivityId().equals(activity.getActivityId())) {
            activity.setActivityName(checkActivity.getActivityName());
            activity.setActivityId(checkActivity.getActivityId());
            activity.setOrganizerName(checkActivity.getOrganizerName());
            System.out.println("Activity id correct!");
            return true;
        }
        System.out.println("Activity id is wrong, please check!");
        return false;
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
}