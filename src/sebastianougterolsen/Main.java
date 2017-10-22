package sebastianougterolsen;

public class Main {

    public static void main(String[] args) {

        BMI test = new BMI("Sebastian", 21, 1.79,79 );
        System.out.println(test.getName()+" is " +test.getAge()+" years old. His BMI is "+ test.getBMI()+".\nHe is "+ test.getStatus()+"." );

    }
}
