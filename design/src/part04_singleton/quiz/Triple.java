package part04_singleton.quiz;

public enum Triple {

    ALPHA(/*1,*/ "ALPHA"), BETA(/*2,*/ "BETA"), GAMMA(/*3,*/ "GAMMA");

    // private int index;
    private String name;

    Triple(/*int index, */String name) {
        // this.index = index;
        this.name = name;
    }

    public static Triple getInstance(String name) {
        switch (name) {
            case "ALPHA":
                return Triple.ALPHA;
            case "BETA":
                return Triple.BETA;
            case "GAMMA":
                return Triple.GAMMA;
            default:
                return null;
        }
    }
}
