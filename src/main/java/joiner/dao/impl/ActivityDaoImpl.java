package joiner.dao.impl;

import joiner.dao.ActivityDao;
import joiner.entity.Activity;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by distanceN on 2015/6/14.
 */
public class ActivityDaoImpl extends HibernateDaoSupport implements ActivityDao {
    @Override
    public String addActivity(Activity activity) {
        String success = "";
        String name = activity.getActivityName();
        if(findActivitysByName(name).size() == 0){
            try {
                getHibernateTemplate().save(activity);
                success = "Activity saved ok!";
            } catch (DataAccessException e) {
                success = "Sorry, activity can't be added.";
            }
        } else {
            success = "The activity name has been existed!";
        }
        return success;
    }

    @Override
    public Activity findActivityById(String activityId) {
        System.out.println("Searching activity by id");
        List<Activity> activitys = getHibernateTemplate().find("from Activity where activityId = ?", activityId);
        if (1 > activitys.size()) {
            return null;
        } else {
            return activitys.get(0);
        }
    }

    @Override
    public List<Activity> findActivitysByName(String activityName) {
        return getHibernateTemplate().find("from Activity where activityName = ?", activityName);
    }

    @Override
    public List<Activity> listAll() {
        return getHibernateTemplate().find("from Activity");
    }
}