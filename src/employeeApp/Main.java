package employeeApp;

import com.modelchallange1.Company;
import com.modelchallange1.Employee;
import com.modelchallange1.HealthPlan;
import com.modelchallange1.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        String[] developers = {"AHMET", null, "MARY",null};
        String[] plans={"CARDİO","NİCE FODDS","YOGA",null,null};
        Company comp =new Company(5,"ALİ",100,developers);
        comp.addNames(1,"JOHN");
        comp.addNames(0,"ARTHUR");
        System.out.println(comp);

        Employee emp =new Employee(5,"ALİ İHSAN","VELİ@GMAİL.COM","2365LŞG",plans);
        emp.addHealthPlan(4,"veli");
        emp.addHealthPlan(9,"ali");
        System.out.println(emp);
        HealthPlan healthplan=new HealthPlan(5,"ahmet", Plan.BASİC);
        System.out.println(healthplan);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
