package jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Springdb.xml");

        Dao d = (Dao) context.getBean("dao");

        Scanner s = new Scanner(System.in);

        System.out.println("1. Insert");
        System.out.println("2. Display");
        System.out.println("3. Update");
        System.out.println("4. Delete");

        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter pid, pname, price");
                Product p1 = new Product(
                        s.nextInt(),
                        s.next(),
                        s.nextDouble());

                System.out.println(d.saveData(p1));
                break;

            case 2:
                List<Product> list = d.getData();

                for(Product p : list)
                {
                    System.out.println(
                            p.getPid() + " " +
                            p.getPname() + " " +
                            p.getPrice());
                }
                break;

            case 3:
                System.out.println("Enter pid, new pname, new price");

                Product p2 = new Product();
                p2.setPid(s.nextInt());
                p2.setPname(s.next());
                p2.setPrice(s.nextDouble());

                System.out.println(d.Updatedata(p2));
                break;

            case 4:
                System.out.println("Enter pid to delete");
                int pid = s.nextInt();

                System.out.println(d.deleteData(pid));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        s.close();
    }
}