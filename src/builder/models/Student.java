package builder.models;

public class Student {
    private final String name;
    private final int batch;
    private final String mail;

    public static Builder builder() {
        return new Builder();
    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.batch = builder.batch;
        this.mail = builder.mail;
    }

    public String name() {
        return this.name;
    }

    public String mail() {
        return this.mail;
    }

    public int batch() {
        return this.batch;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', batch=" + batch + ", mail='" + mail + "'}";
    }

    public static class Builder {
        private String name;
        private int batch;
        private String mail;

        private Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder batch(int batch) {
            this.batch = batch;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Student build() {
            if (name == null || name.isBlank()) {
                throw new IllegalStateException("Name is required");
            }
            if (batch < 2029) {
                throw new IllegalStateException("Batch can't be before 2029");
            }
            return new Student(this);
        }
    }
}
