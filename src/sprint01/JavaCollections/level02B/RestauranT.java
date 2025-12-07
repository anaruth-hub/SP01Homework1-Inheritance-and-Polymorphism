package sprint01.JavaCollections.level02B;

import java.util.Objects;

public class RestauranT implements Comparable<RestauranT> {

    private final String name;
    private final int score;

    public RestauranT(String name, int score) {
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.score = score;


    }

    public String getName() {
        return name;

    }

    public int getScore() {
        return score;
    }

    public int compareTo(RestauranT other) {

        int nameComparison = this.name.compareToIgnoreCase(other.name);
        if (nameComparison != 0) {
            return nameComparison;

        }

        return Integer.compare(other.score, this.score);
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RestauranT other)) return false;

        return this.score == other.score
                && this.name.equalsIgnoreCase(other.name);
    }


    public int hashCode() {
        return Objects.hash(name.toLowerCase(), score);

    }


    public String toString() {
        return "RestauranT{name='" + name + "', score=" + score + "}";
    }
}
