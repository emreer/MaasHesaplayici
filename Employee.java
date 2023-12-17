public class Employee {
    Employee employee;
    String name;
    double salary, salaryIncrease, workHours,bonus,tax;
    int hireYear;
    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void ToString() {
        System.out.println("Adı: "+this.name+"\nMaaşı: "+this.salary+"\nÇalışma Saati: "+this.workHours+
                "\nBaşlangıç Yılı: "+this.hireYear+"\nVergi: "+tax()+
                "\nBonus: "+bonus()+"\nMaaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: "+ (this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş: "+ (this.salary+bonus()-tax()+raiseSalary()));

    }
    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary*0.03;
        }
    }
    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours-40)*30;

        } else {
            return 0;
        }
    }
    double raiseSalary() {
        if (2023 - this.hireYear < 10) {
            return this.salary* 0.05;
        } else if (2023 - this.hireYear < 20 && 2023 - this.hireYear > 9) {
            return this.salary* 0.10;
        } else {
            return this.salary* 0.15;
        }
    }

}

