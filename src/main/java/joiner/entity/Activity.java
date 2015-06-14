package joiner.entity;

/**
 * Created by distanceN on 2015/6/13.
 */
public class Activity {
    String activityId;
    String activityName;
    String organizerName;
    String time;
    String place;
    String description;
//    List<Student> students;

    public String getActivityId() {
        return activityId;
    }

    public String getActivityName() {
        return activityName;
    }

//    public List<Student> getStudents() {
//        return students;
//    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    public void setOrganizerName(String organizer) {
        this.organizerName = organizer;
    }

    public void setTime(String time){this.time = time;}

    public String getTime(){return this.time;}

    public void setPlace(String place){this.place = place;}

    public String getPlace(){return this.place;}

    public void setDescription(String description){this.description = description;}

    public String getDescription(){return this.description;}

}
