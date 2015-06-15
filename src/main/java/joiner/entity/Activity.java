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
    boolean isPost;
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

    public boolean isPost() {
        return isPost;
    }

    public void setPost(boolean isPost) {
        this.isPost = isPost;
    }

    // below are add for link of activity and student
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        } else if (!(o instanceof Activity)) {
//            return false;
//        } else {
//            final Activity activity = (Activity) o;
//            if (this.activityId != null ?
//                !this.activityId.equals(activity.getActivityId()) :
//                activity.getActivityId() != null) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//    }
//
//    Set<Student> students = new HashSet<Student>();
//
//    public Set<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(Set<Student> students) {
//        this.students = students;
//    }
}
