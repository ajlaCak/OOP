package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class student {
    private int id;
    private String name;
    private String department;
    private String uni;
    private double gpa;

    public student(int id, String name, String department, String uni, double gpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.uni = uni;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return name;
    }

}
class emptystudentlistexc extends RuntimeException{
    public emptystudentlistexc(String m){
        super(m);
    }
}
class studentnotfound extends Exception{
    public studentnotfound(String m){
        super(m);
    }
}
class studentsystem{
    public List<student> ll;
    public studentsystem(String f){
        try{
            this.ll=readStudents(f);
        }
        catch(IOException e){
            e.printStackTrace();
            this.ll=new ArrayList<>();
        }
    }
    public List<student> readStudents (String f) throws IOException{
        List<student> ll=new ArrayList<>();
        try(BufferedReader r=new BufferedReader(new FileReader(f))){
            List<String> lines = r.lines().collect(Collectors.toList());
            for(String li:lines){
                String[] part=li.split(",");
                int id=Integer.parseInt(part[0]);
                String name=part[1];
                String university=part[2];
                String department=part[3];
                double gpa=Double.parseDouble(part[4]);
                student s=new student(id,name,university,department,gpa);
                ll.add(s);
            }
        }
        return ll;
    }
    public Optional<student> op(int id){
        for(student s:ll){
            if(s.getId()==id){
                return Optional.of(s);
            }
        }return Optional.empty();
    }
    public student highestgpa() throws emptystudentlistexc{
        if(ll.isEmpty()){
            throw new emptystudentlistexc("nema studenta");
        }
        double max=0;
        for(student s:ll){
            if(s.getGpa()>max){max=s.getGpa();}
        }
        for(student s:ll){
            if(s.getGpa()==max){return s;}
        }
        return null;
    }
    public student getlongestnamestudent() throws emptystudentlistexc{
        if(ll.isEmpty()){throw new emptystudentlistexc("nema");}
        int max=0;
        for(student s:ll){
            if(s.getName().length()>max){max=s.getName().length();}
        }
        for(student s:ll){
            if(s.getName().length()==max){return s;}
        }return null;
    }

}
class StudentSystemTest {

    private studentsystem system;

    @BeforeEach
    void setUp() {
        system = new studentsystem("students.csv");
    }
    @Test
    void testIfStudentIsPresent() {
        List<student> students = system.ll;
        assertFalse(students.isEmpty(), "There should be at least one student in the file");
    }
    @Test
    void testStudentNull() {
        int nonExistentStudentId = 999;
        Optional<student> studentById = system.op(nonExistentStudentId);
        assertFalse(studentById.isPresent(), "Student with ID 999 should not be present");
    }
    @Test
    void testStudentNull() {
        int nonExistentStudentId = 999;
        Optional<student> studentById = system.op(nonExistentStudentId);
        assertFalse(studentById.isPresent(), "Student with ID 999 should not be present");
    }

    @Test
    void testHighestGPAStudent() {
        assertDoesNotThrow(() -> {
            student highestGPAStudent = system.highestgpa();
            assertNotNull(highestGPAStudent, "There should be a student with the highest GPA");
        });
    }

    @Test
    void testExceptionForEmptyStudentList() {
        assertThrows(emptystudentlistexc.class, () -> {
            studentsystem emptySystem = new studentsystem("empty.csv");
            emptySystem.highestgpa();
        });
    }

    @Test
    void testNamesArray() {
        String[] expectedNames = {"John Doe", "Jane Smith", "Bob Johnson", "Alice Williams", "Charlie Brown"};
        String[] actualNames = system.ll.stream()
                .limit(5)
                .map(student::getName)
                .toArray(String[]::new);

        assertArrayEquals(expectedNames, actualNames, "First five names should match");
    }

    @Test
    void testSize() {
        assertEquals(70, system.ll.size(), "Size of the student list should be 70");
    }

    @Test
    void testLargestName() {
        student longestNameStudent = system.getlongestnamestudent();
        assertNotEquals("Ava White", longestNameStudent.getName(), "The student with the longest name should not be Ava White");
    }

    @Test
    void testStudents() {
        student highestGPAStudent = system.highestgpa();
        student longestNameStudent = system.getlongestnamestudent();

        assertNotSame(highestGPAStudent, longestNameStudent, "The student with the highest GPA should not be the same as the one with the longest name");
    }

    @Test
    void testSameStudent() {
        int studentIdToFind = 12;
        Optional<student> studentById = system.op(studentIdToFind);
        student highestGPAStudent = system.highestgpa();

        assertTrue(studentById.isPresent(), "Student with ID 12 should be present");
        assertSame(highestGPAStudent, studentById.get(), "The student with the highest GPA should be the same as the one with ID 12");
    }

}