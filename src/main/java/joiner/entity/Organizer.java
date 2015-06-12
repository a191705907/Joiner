package joiner.entity;

/**
 * Created by distanceN on 2015/6/13.
 */
public class Organizer {
    String organizerId;
    String organizerName;
    String orgaizerPassword;

    public String getOrganizerId() {
        return organizerId;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public String getOrgaizerPassword() {
        return orgaizerPassword;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public void setOrgaizerPassword(String orgaizerPassword) {
        this.orgaizerPassword = orgaizerPassword;
    }
}
