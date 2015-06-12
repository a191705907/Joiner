package joiner.entity;

import java.util.List;

/**
 * Created by distanceN on 2015/6/13.
 */
public class Activity {
    String activityId;
    String activityName;
    String organizerId;
    List<Student> students;

    public String getActivityId() {
        return activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }
}
