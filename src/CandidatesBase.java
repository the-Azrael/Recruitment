import java.util.*;

public class CandidatesBase {
    private final Set<Candidate> candidatesTreeSet = new TreeSet<>();

    public void addCandidate(Candidate candidate) {
        Iterator<Candidate> iterator = candidatesTreeSet.iterator();
        while (iterator.hasNext()) {
            String fullName = iterator.next().getFullName();
            if (fullName.equals(candidate.getFullName())) {
                return;
            }
        }
        candidatesTreeSet.add(candidate);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Candidate candidate : getCandidatesTreeSet()) {
            result.append(candidate.toString()).append("\n");
        }
        return result.toString();
    }

    public Set<Candidate> getCandidatesTreeSet() {
        return candidatesTreeSet;
    }
}
