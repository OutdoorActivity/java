package equalsHashCode;


public final class Exam {
    private final long id;
    private final String date;
    private final int mark;

    public Exam(long id, String date, int mark) {
        this.id = id;
        this.date = date;
        this.mark = mark;
    }

    public long getId() {
        return id;
    }


    public String getDate() {
        return date;
    }


    public int getMark() {
        return mark;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exam exam = (Exam) o;

        if (id != exam.id) return false;
        if (mark != exam.mark) return false;
        return date != null ? date.equals(exam.date) : exam.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + mark;
        return result;
    }


}
