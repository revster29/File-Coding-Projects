public class DataProfile {

    static class Profile {
        String name;
        String nickname;
        String birthday;
        String address;
        String favSong;
        String motivation;
        String support;
    }

    public static Profile createProfile() {
        Profile profile = new Profile();

        profile.name = "Revster B. Regacho";
        profile.nickname = "Revs";
        profile.birthday = "11/07/2006";
        profile.address = "Sooc, Arevalo, Iloilo City";
        profile.favSong = "All or Nothing by Town and Shape of My Heart by Backstreet Boys";
        profile.motivation =
                "I will study hard for my family who raised me and my girlfriend whom I love. "
                + "Every effort now builds a better life, security, and pride for both of them.";
        profile.support = "My family and my girlfriend.";

        return profile;
    }

    public static void showProfile(Profile prof) {
        System.out.println("🐶 🐶 🐶 (Dog person)");
        System.out.println("🙋Name       : " + prof.name);
        System.out.println("😃Nickname   : " + prof.nickname);
        System.out.println("🎂Birthday   : " + prof.birthday);
        System.out.println("🏠Address    : " + prof.address);
        System.out.println("🎧Fav Song   : " + prof.favSong);
        System.out.println("👊Motivation : " + prof.motivation);
        System.out.println("🫂Support    : " + prof.support);
    }

    public static void main(String[] args) {
        Profile myProfile;

        myProfile = createProfile();
        showProfile(myProfile);
    }
}
