package builder;

import builder.classes.Student;

public class Main {
    public static void main(String[] args) {
        Student duke = Student.builder()
                        .name("sirwagya")
                        .mail("sirwagya.mail")
                        .batch(2029)
                        .build();
        
        System.out.println(duke.batch());
    }
}
