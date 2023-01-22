package part04_singleton.quiz;

public enum Triple {

    ALPHA, BETA, GAMMA;

    public static Triple getInstance(String name) {

        switch (name) {
            case "ALPHA":
                return ALPHA;
            case "BETA":
                return BETA;
            case "GAMMA":
                return GAMMA;
        }
        return null;
    }
}
