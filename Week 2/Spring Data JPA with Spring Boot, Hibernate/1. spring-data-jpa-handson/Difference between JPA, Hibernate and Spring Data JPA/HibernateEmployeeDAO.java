import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

public class HibernateEmployeeDAO {

    public Integer addEmployee(Employee employee) {

        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeId = null;

        try {
            tx = session.beginTransaction();

            employeeId = (Integer) session.save(employee);

            tx.commit();

        } catch (HibernateException e) {

            if (tx != null)
                tx.rollback();

        } finally {

            session.close();
        }

        return employeeId;
    }
}
