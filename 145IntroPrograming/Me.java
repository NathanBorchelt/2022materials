<<<<<<< HEAD
//CSC 145 Assignment 1
=======
//CSC 145 Assignment 1 Nathan Borchelt
>>>>>>> b5886afc70359d94f91f568ca293da7c9767417c
public class Me {
    public static void main(String[] args) {
        String name = "Nathan Borchelt";
        String birthday = "November 27";
        String favMovie = "Ford v. Ferrari";
        String hobbies = "video games, cars, weightlifting, guns, eating, sleeping";
        //String outStr = "Name : ".concat(name.concat("\nBirthday: ".concat(birthday.concat("\nFavorite Movie: ".concat(favMovie.concat("\nHobbies: ".concat(hobbies)))))));
        String outStr = "Name: "+name;
        /*outStr.concat("\nBirthday: "+birthday);
        outStr.concat("\nFavorite Movie: "+favMovie);
        outStr.concat("\nHobbies: "+hobbies);
        */
        outStr+="\nBirthday: "+birthday;
        outStr+="\nFavorite Movie: "+favMovie;
        outStr+="\nHobbies: "+hobbies;
        System.out.println(outStr);
    }
}