import java.util.Comparator;
import java.util.Objects;

public class Candidate implements Comparable<Candidate>{
    private String fullName;
    private String gender;
    private String age;
    private Integer relevance;
    private Integer rating;

    public Candidate(String fullName, String gender, String age, int relevance, int rating) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public Integer getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("%30s %15d %15d", getFullName(), getRelevance(), getRating());
    }

    @Override
    public int compareTo(Candidate o) {
        Comparator<Candidate> c = new CandidatesComparator();
        return c.compare(this, o);
    }
}
