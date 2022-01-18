//Assignment 1, Nathan Borchelt
import java.util.ArrayList;

public class BorchelAssinment1 {
    public static void main(String[] args) {
        ArrayList<String> personHobbies = new ArrayList<>();
        personHobbies.add("Video Games");
        personHobbies.add("cars");
        personHobbies.add("weightlifting");
        personHobbies.add("guns");
        personHobbies.add("eating");
        personHobbies.add("sleeping");
        Person nathan = new Person();
        nathan.userInfo("Nathan Borchelt", "November 27, 2002", "Ford vs Ferrari", personHobbies);
        System.out.println(nathan);

        ArrayList<Website> favSites = new ArrayList<>();
        favSites.add(new Website("Additing Games", "https://www.addictinggames.com/"));
        favSites.add(new Website("Netflix", "https://www.netflix.com"));
        favSites.add(new Website("YouTube", "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));

        for(Website w : favSites){
            System.out.println(w);
        }
    }

    public static class Website {
        private String siteName;
        private String siteURL;

        public Website(String siteName, String siteURL) {
            this.siteName = siteName;
            this.siteURL = siteURL;
        }
        public String toString(){
            return siteName +" : "+siteURL;
        }
    }

    public static class Person {
        private String name;
        private String birthday;
        private String movie;
        private ArrayList<String> hobbies;

        public void userInfo(String name, String birthday, String movie, ArrayList<String> hobbies) {
            this.name = name;
            this.birthday = birthday;
            this.movie = movie;
            this.hobbies = hobbies;
        }

        public String toString() {
            String outString = "Name: " + name;
            outString += "\nBirthday: " + birthday;
            outString += "\nFavorite Movie: " + movie;
            String hobbyStringOut = "";
            // https://stackoverflow.com/a/599181
            for (String s : hobbies) {
                hobbyStringOut += s + ", ";
            }
            outString += "\nHobbies: " + hobbyStringOut;
            return outString;
        }
    }
}