package joiner.entity;

import java.util.List;

/**
 * Created by distanceN on 2015/6/13.
 */
public class Student {
    String studentId;
    String studentName;
    String studentPassword;
    List<Activity> activities;

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
