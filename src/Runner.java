public class Runner {
    public static void main(String[] args) {

        School bhs = new School("Berkeley High");
        Teacher a = new Teacher("Austera","Math");
        Teacher al = new Teacher("Mueller","Bio");
        Teacher m = new Teacher("Albinson","Computer Science");
        Section ma = new Section("Math");
        Section b = new Section("biology");
        Section cs = new Section("Computer Science");
        Student flynn = new Student("Flynn",11);
        Student dash = new Student("Dash",11);
        Student ella = new Student("Ella",11);
        Student vince = new Student("Vince",11);
        Student jasper = new Student("Jasper",11);
        Student azman = new Student("Azman",11);
        ma.setTeacher(a);
        b.setTeacher(m);
        cs.setTeacher(al);
        bhs.addSections(ma);
        bhs.addSections(cs);
        bhs.addSections(b);
        a.addSections(ma);
        al.addSections(cs);
        m.addSections(b);
        ma.addStudents(flynn);
        ma.addStudents(dash);
        ma.addStudents(ella);
        ma.addStudents(vince);
        ma.addStudents(jasper);
        ma.addStudents(azman);
        flynn.addSections(b);
        flynn.addSections(ma);
        flynn.addSections(cs);
        dash.addSections(b);
        dash.addSections(ma);
        dash.addSections(cs);
        ella.addSections(b);
        ella.addSections(ma);
        ella.addSections(cs);
        vince.addSections(b);
        vince.addSections(ma);
        vince.addSections(cs);
        jasper.addSections(b);
        jasper.addSections(ma);
        jasper.addSections(cs);
        azman.addSections(b);
        azman.addSections(ma);
        azman.addSections(cs);
        cs.addStudents(flynn);
        cs.addStudents(dash);
        cs.addStudents(ella);
        cs.addStudents(vince);
        cs.addStudents(jasper);
        cs.addStudents(azman);
        b.addStudents(flynn);
        b.addStudents(dash);
        b.addStudents(ella);
        b.addStudents(vince);
        b.addStudents(jasper);
        b.addStudents(azman);
        System.out.println(bhs.toString());
        System.out.println(m.toString());
        System.out.println(ma.toString());
        System.out.println(dash.toString());
    }

    }
