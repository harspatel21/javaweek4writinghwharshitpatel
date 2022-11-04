package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //Setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        //displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime Roll No: " + obj.getRollNo());
        // Direct access of rollNo is not possible due to encapsulation
        //System.out.println("Prime's Roll No: " + obj.geekName); ???? What is this line mean???
    }
}
