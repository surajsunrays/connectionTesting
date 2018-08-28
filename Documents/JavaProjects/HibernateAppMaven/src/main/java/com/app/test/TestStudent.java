package com.app.test;

import com.app.model.Student;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
     //   Transaction tx = null;
        try(Session ss = HibernateUtil.getSf().openSession()) {


            Student s = new Student();
            //Step 1
            String hql = "from "+Student.class.getName();
          //  String hql = "from com.app.model.Student";
            //Step 2
            Query q = ss.createQuery(hql);
            //Step 3
            List<Student> data = q.list();
            for (Student s1: data)
            {
                System.out.println(s1);
            }
            //
            data.forEach(System.out::println);
            //Lambda Expression
            data.forEach((s1)->System.out.println(s1));

       //     tx.commit();
        }catch (Exception e)
        {
         //   tx.rollback();
            e.printStackTrace();
        }
    }
}
