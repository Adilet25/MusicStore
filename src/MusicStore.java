import java.util.ArrayList;
import java.util.Scanner;

public class MusicStore {
    static ArrayList<String> titles = new ArrayList<>();
    static ArrayList<String> authors = new ArrayList<>();
    static ArrayList<Integer> listeners = new ArrayList<>();
    static ArrayList<String> genres = new ArrayList<>();
    static ArrayList<Integer> likes = new ArrayList<>();

    public static void main(String[] args) {
        initializeMusicDatabase();
        Scanner sca = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.println("\nMenu:");
            System.out.println("1. Add music");
            System.out.println("2. Display all music");
            System.out.println("3. Search for music");
            System.out.println("4. Press like");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sca.nextInt();
            sca.nextLine();

            switch (choice) {
                case 1:
                    addMusic(sca);
                    break;
                case 2:
                    displayMusic();
                    break;
                case 3:
                    searchMusic(sca);
                    break;
                case 4:
                    updateLikes(sca);
                    break;
                case 5:
                    stop = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sca.close();
    }

    public static void initializeMusicDatabase() {
        titles.add("double take");
        authors.add("dhruv");
        listeners.add(1000000000);
        genres.add("Pop");
        likes.add(5000000);

        titles.add("Loose");
        authors.add("Daniel Caesar");
        listeners.add(23000000);
        genres.add("R&B");
        likes.add(9000000);

        titles.add("Heart to Heart");
        authors.add("Mac DeMarco");
        listeners.add(41000000);
        genres.add("Indie");
        likes.add(8000000);
    }

    public static void addMusic(Scanner sca) {
        System.out.print("Enter title: ");
        String title = sca.nextLine();
        titles.add(title);

        System.out.print("Enter author: ");
        String author = sca.nextLine();
        authors.add(author);

        System.out.print("Enter listeners count: ");
        int listenerCount = sca.nextInt();
        listeners.add(listenerCount);
        sca.nextLine();

        System.out.print("Enter genre: ");
        String genre = sca.nextLine();
        genres.add(genre);

        System.out.print("Enter likes count: ");
        int likeCount = sca.nextInt();
        likes.add(likeCount);

        System.out.println("Music added successfully!");
    }

    public static void displayMusic() {
        System.out.println("\nAvailable Music:");
        for (int i = 0; i < titles.size(); i++) {
            System.out.println("\nMusic " + (i + 1));
            System.out.println("Title: " + titles.get(i));
            System.out.println("Author: " + authors.get(i));
            System.out.println("Listeners: " + listeners.get(i));
            System.out.println("Genre: " + genres.get(i));
            System.out.println("Likes: " + likes.get(i));
        }
    }

    public static void searchMusic(Scanner sca) {
        System.out.println("\nSearch by:");
        System.out.println("1. Title");
        System.out.println("2. Author");
        System.out.println("3. Genre");
        System.out.print("Choose an option: ");
        int option = sca.nextInt();
        sca.nextLine();

        System.out.print("Enter search keyword: ");
        String keyword = sca.nextLine();
        boolean found = false;

        for (int i = 0; i < titles.size(); i++) {
            boolean match = false;
            if (option == 1 && titles.get(i).equalsIgnoreCase(keyword)) {
                match = true;
            } else if (option == 2 && authors.get(i).equalsIgnoreCase(keyword)) {
                match = true;
            } else if (option == 3 && genres.get(i).equalsIgnoreCase(keyword)) {
                match = true;
            }

            if (match) {
                System.out.println("\nMusic Found:");
                System.out.println("Title: " + titles.get(i));
                System.out.println("Author: " + authors.get(i));
                System.out.println("Listeners: " + listeners.get(i));
                System.out.println("Genre: " + genres.get(i));
                System.out.println("Likes: " + likes.get(i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No music found with the given keyword.");
        }
    }

    public static void updateLikes(Scanner sca) {
        System.out.print("Enter the title of the music to update likes: ");
        String title = sca.nextLine();
        boolean found = false;

        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).equalsIgnoreCase(title)) {
                System.out.print("Enter new likes count: ");
                int newLikes = sca.nextInt();
                likes.set(i, newLikes);
                System.out.println("Likes updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Music with the given title not found.");
        }
    }
}
