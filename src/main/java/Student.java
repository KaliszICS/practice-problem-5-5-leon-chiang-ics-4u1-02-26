class Student implements Comparable<Student> {
    public String name;
    public int age;
    public String studentNumber;

    public Student (String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    @Override
    public String toString() {
        return "N:" + this.name + " A:" + this.age + "SN:" + this.studentNumber;
    }

    public int compareTo(Student student) {
        return this.studentNumber.compareTo(student.studentNumber);
    }
}