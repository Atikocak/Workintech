package employeeApp;

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
        Healthplan healthplanBasic = new Healthplan(1, "Basic Health", Plan.BASIC);
        Healthplan healthplanPremium = new Healthplan(2, "Premium Health", Plan.PREMIUM);

        Employee employee1 = new Employee(1, "Ahmet Kaya", "ahmet.kaya@company.com", "pasword123", 3);
        Employee employee2 = new Employee(2, "Mehmet Küçük", "mehmet.kucuk@company.com", "pasword456", 2);

        employee1.addHealthplan(0, healthplanBasic.getName());
        employee1.addHealthplan(1, healthplanPremium.getName());
        employee2.addHealthplan(0, healthplanBasic.getName());

        Company company = new Company(1, "Workintech", 500000, 3);

        company.addEmployee(0, employee1.getFullName());
        company.addEmployee(1, employee2.getFullName());
        company.addEmployee(2, "Ali Veli");

        System.out.println("Healthplan 1: " + healthplanBasic.toString());
        System.out.println("Healthplan 2: " + healthplanPremium.toString());
        System.out.println("Employee 1: " + employee1.toString());
        System.out.println("Employee 2: " + employee2.toString());
        System.out.println("Company: " + company.toString());
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
