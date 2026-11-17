package builder;

import builder.models.Student;

public class Client {
    public static void main(String[] args) {
        demoBuilder();
    }

    public static void demoBuilder() {
        Student duke = Student.builder()
                .name("sirwagya")
                .mail("sirwagya.mail")
                .batch(2029)
                .build();

        System.out.println(duke);
    }
}
