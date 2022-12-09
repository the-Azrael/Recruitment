import java.util.Comparator;

public class CandidatesComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate candidate1, Candidate candidate2) {
        int relevanceCompare = Integer.compare(candidate2.getRelevance(), candidate1.getRelevance());
        int ratingCompare = Integer.compare(candidate2.getRating(), candidate1.getRating());
        int fullNameCompare = candidate1.getFullName().compareTo(candidate2.getFullName());

        if (relevanceCompare == 0 && ratingCompare == 0) {
            return fullNameCompare;
        } else if (relevanceCompare == 0) {
            return ratingCompare;
        } else {
            return relevanceCompare;
        }
    }
}
