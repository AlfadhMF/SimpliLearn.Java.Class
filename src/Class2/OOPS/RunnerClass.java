package Class2.OOPS;




public class RunnerClass {


    public  static void main (String [] args){

        Employee employee = new Employee();

        employee.Name = "Mohanad";
        employee.EmpID = 1468100;
        employee.Salary(5000);


       Employee employee2 = new Employee();
       employee2.Name = "Ashma";
       employee2.EmpID = 12457800;
       employee2.Salary(152222);

      /* employee.Display();
       employee2.Display();*/

       Employee employee3 = new Employee("Rohinj",102,00000);
       employee.Display();
       employee2.Display();
       employee3.Display();



       ICICIBank iciciBank = new ICICIBank();
       iciciBank.AccountNumber = 12345;
       iciciBank.BankID = 100;


       HDFCBank hdfcBank = new HDFCBank();
       hdfcBank.Account = 12345;

    }
}
