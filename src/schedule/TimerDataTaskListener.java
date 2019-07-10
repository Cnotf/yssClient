package schedule;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 20:39 2019/07/04
 */
public class TimerDataTaskListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        new TimerManager();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
