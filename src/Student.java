public class Student extends Person{
    public Section[] sections = new Section[10];
    private int Grade;
    public Student(String name, int Grade){
        super(name);
        this.Grade = Grade;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {

        this.Grade = grade;
    }
    public Section[] getSections() {

        return sections;
    }
    public void addSections(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        String v = "";
        for(int i = 0;i < sectionCount;i++){

            v += "(" +  this.sections[i].getName() + ") " + this.sections[i].getTeacher().getName() + ",";
        }
        return this.name + " is in grade "+ this.Grade + " and is enrolled in the following sections: " + v;
    }
}
