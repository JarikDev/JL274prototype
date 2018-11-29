package com;

public class Main implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache =new Cache();
        cache.setStudent(new Student());
        Student student=cache.getStudent();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Main)super.clone();
    }
}
class   Student implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
class Cache {
    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return (Student) student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}