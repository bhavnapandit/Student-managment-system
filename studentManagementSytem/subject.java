package studentManagementSytem;

public class subject {
    String subject_name;
    int mark;
    public String getSubject_name() {
        return subject_name;
    }
    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    public subject(String subject_name, int mark) {
        this.subject_name = subject_name;
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "subject [subject_name=" + subject_name + ", mark=" + mark + "]";
    }

    
    
}
