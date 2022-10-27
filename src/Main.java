import courses.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Course java = new Java("Java", 52500, 3, "Bootcamp", 5);
        Course python = new Python("Python", 42000, 7, "Online", 3);
        Course javascript = new JavaScript("Java script", 70000, 7, "Offline", 3);
        Course flutter = new Flutter("Flutter", 60000, 7, "Offline", 3);

        System.out.println("Курсы от ITschool Megacom");
        Thread.sleep(1500);
        System.out.print("\n" + java);
        ((Java) java).mentor();
        System.out.println("=====================");
        Thread.sleep(5000);
        System.out.println(python);
        ((Python) python).mentor();
        System.out.println("=====================");
        Thread.sleep(5000);
        System.out.println(javascript);
        ((JavaScript) javascript).mentor();
        System.out.println("=====================");
        Thread.sleep(5000);
        System.out.println(flutter);
        ((Flutter) flutter).mentor();
        System.out.println("=====================");
        Thread.sleep(5000);
        System.out.println("По всем возникшим вопросам обращаться по номеру: 0 999 999 440");

    }
}