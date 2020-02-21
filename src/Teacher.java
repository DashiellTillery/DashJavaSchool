public class Teacher extends Person{
    private String Subject;
    public Section[] sections = new Section[10];
    public Teacher(String name,String Subject){
        super(name);
        this.Subject = Subject;

    }

    public String getSubject() {

        return Subject;
    }

    public void setSubject(String subject) {

       this.Subject = subject;
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
          v = v + "(" + this.sections[i].getCurrentSize() + ") " + this.sections[i].getName();
        }
        return this.name + " teaches the following sections: " + v;
    }
}
