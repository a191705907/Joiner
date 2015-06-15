package joiner.dao.impl;

import joiner.dao.LinkDao;
import joiner.entity.Link;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by Feizhou on 2015/6/15.
 */
public class LinkDaoImpl extends HibernateDaoSupport implements LinkDao{
    @Override
    public List<Link> listAll() {
        return getHibernateTemplate().find("from Link");
    }

    @Override
    public List<Link> findStudentsByActivity(String activityId) {
        System.out.println("Searching stduents by activityId");

        try {
            List <Link> myList = getHibernateTemplate().find("from Link where activityId = "+ activityId);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return getHibernateTemplate().find("from Link where activityId = ?", activityId);

    }

    @Override
    public List<Link> findActivitiesByStudent(String studentId) {
        System.out.println("Searching activities by stduentId");
        return getHibernateTemplate().find("from Link where studentId = ?", studentId);
    }

}
