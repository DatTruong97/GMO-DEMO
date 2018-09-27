package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable{
    private List<String>studentList=new ArrayList<String>();

    public Student(){};
    public Student(List<String>list){
        this.studentList=list;
    }

    public void addInit(){
        studentList.add("Van A");
        studentList.add("Nguyen B");
        studentList.add("Quang Dat");
        studentList.add("Minh Ha");
    }

    public List<String> getStudentList(){
        return studentList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp=new ArrayList<String>();
        for(String s:this.getStudentList()){
            temp.add(s);
        }
        return new Student(temp);
    }
}
