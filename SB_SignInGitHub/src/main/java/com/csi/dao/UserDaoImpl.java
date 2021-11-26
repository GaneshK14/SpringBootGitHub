package com.csi.dao;

import com.csi.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{

    private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
    @Override
    public void saveData(User user) {

        Session  session=factory.openSession();

        Transaction transaction=session.beginTransaction();

        session.save(user);

        transaction.commit();

    }

    @Override
    public List<User> signInByAnyVariable(User user) {

        Session session=factory.openSession();

        List<User> ul=new ArrayList<>();

        List<User> userList=session.createQuery("From User").list();

        for (User u: userList){

            if(u.getUserId()== user.getUserId() || u.getUserFirstName().equals(user.getUserFirstName()) ||

                    u.getUserLastName().equals(user.getUserLastName()) || u.getUserUid()== user.getUserUid() ||
                            u.getUserDob().equals(user.getUserDob())){
                ul.add(u);


            }
        }

        return ul;
    }
}
