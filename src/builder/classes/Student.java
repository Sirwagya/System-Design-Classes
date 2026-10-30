package builder.classes;

public class Student {
    private String name ;
    private int batch ;
    private String mail;

    public static Builder builder() {
        return new Builder();
    }

    private Student (Builder b) {
        this.name = b.name;
        this.batch = b.batch;
        this.mail = b.mail;
    }

    public String name () {
        return this.name;
    }

    public String mail () {
        return this.mail;
    }

    public int batch () {
        return this.batch;
    }


    public static class Builder {
        private String name ;
        private int batch ;
        private String mail;
    
        private Builder() {}
        
        public Builder name (String name) {
            this.name = name;
            return this;
        }
        public Builder batch (int batch) {
            this.batch = batch;
            return this;
        }
    
        public Builder mail (String mail) {
            this.mail = mail;
            return this;
        }
        public Student build() {
            if (name == null) {
                throw new IllegalStateException("Name is required");
            }
            if (batch < 2029) {
                throw new IllegalStateException("batch can't be before 2029");
            }
    
            return new Student(this);
        }
    }
}

