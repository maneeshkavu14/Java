public class College {
    Principal principal;
    Hods[] hods;
    Professors[] professors;
    Students[] students;

    public College(Principal principal, Hods[] hods, Professors[] professors, Students[] students) {
        this.principal = principal;
        this.hods = hods;
        this.professors = professors;
        this.students = students;
    }

    public College() {

    }
}