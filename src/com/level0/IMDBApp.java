package com.level0;

public class IMDBApp {
    public static void main (String args[]) {
        String actorName = "Deepika Padukone";
        int yob = 1988;

        int age = 2023 - yob;
        String[] movieTitles = {
                "Cocktail", "XXX", "Race", "Houseful", "YJHD"
        };

        float[] ratings = {
                8.9F, 4.7F, 8.8F, 6.9F, 8.8F
        };


        System.out.println("Actor's name: " + actorName);

        System.out.println("Age:" + age);

        System.out.println("Movies");

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + "-" + getRating(ratings[i]));
        }
        ;

    }

        static String getRating(float rating){
            if (rating <= 5.0) {
                return "bad";
            } else if (rating > 5.0 && rating <= 6.5) {
                return "average";

            } else if (rating > 6.5 && rating <= 7.0) {
                return "good";
            } else if (rating > 7.0 && rating <= 8.0) {
                return "very good";
            } else {
                return "amazing";

            }
        }

}
