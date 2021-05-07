import java.util.LinkedList;
import java.util.Date;

public class Tobirama{
    private int money = 0;
    private int salary = 20_000;
    private int debt = 0;
    private LinkedList<Date> debtDeadline = new LinkedList<Date>();

    public Tobirama(){}
    public Tobirama(int money, int salary, int debt, Date debtDeadline){
        this.money = money;
        this.salary = salary;
        this.debt = debt;
        this.debtDeadline.add(debtDeadline);
        var arr = new int[] {1, 2, 3};
        arr[-1] = 1;
    }

    public int getMoney(){
        return this.money;
    }

    public int getSalary(){
        return this.salary;
    }
    
    public int getDebt(){
        return this.debt;
    }
    
    public LinkedList<Date> getDebtDeadline(){
        return this.debtDeadline;
    }

    public void gainNewDebt(int debt, Date debtDeadline){
        this.debt += debt;
        this.debtDeadline.add(debtDeadline);
    }
    
    public void raisSalary(){
        this.money += this.salary;
    }

    public static void main(String[] args){
        var tobi = new Tobirama(0, 20000, 1000, new Date());
    }

}