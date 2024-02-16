package factorydesign;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
    }
}

/*    Creational Frameworks:
        JDBC(Java Database Connectivity)uses factories extensively for creating connections,statements,and result sets.
        Dependency injection frameworks like Spring and Guice rely heavily on factories to create and manage beans.
        GUI Toolkits:
        Swing and JavaFX use factories to create UI components like buttons,text fields,and labels,allowing for customization
        and flexibility in UI design.
*/
