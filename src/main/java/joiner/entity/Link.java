package joiner.entity;

import java.io.Serializable;

/**
 * Created by distanceN on 2015/6/14.
 */
public class Link implements Serializable {
    String studentId;
    String activityId;

    public String getStudentId() {
        return studentId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

}
