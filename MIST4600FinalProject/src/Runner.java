import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        AthleteManager athleteManager = new AthleteManager();

        SocialMediaInfluencer influencer1 = new SocialMediaInfluencer("Carson Beck", "@carsonbeck", 82679, 102769, 136, 1865.43);
        SocialMediaInfluencer influencer2 = new SocialMediaInfluencer("Malaki Starks", "@mstarks24", 34462, 214214, 938, 1445.80);
        SocialMediaInfluencer influencer3 = new SocialMediaInfluencer("KJ Bolden", "@kj4dagreat", 65029, 155470, 4189, 1332.60);
        SocialMediaInfluencer influencer4 = new SocialMediaInfluencer("Dallis Goodnight", "@dallisgoodnightt", 13892, 41348, 412, 321.07);
        SocialMediaInfluencer influencer5 = new SocialMediaInfluencer("Jaiden Fields", "@jaidenfields", 25545, 26027, 496, 292.70);
        SocialMediaInfluencer influencer6 = new SocialMediaInfluencer("Sara Mosley", "@_saramosley_", 5641, 33546, 323, 231.69);
       
        

        athleteManager.addAthlete(influencer1);
        athleteManager.addAthlete(influencer2);
        athleteManager.addAthlete(influencer3);
        athleteManager.addAthlete(influencer4);
        athleteManager.addAthlete(influencer5);
        athleteManager.addAthlete(influencer6);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. View Athlete Profiles");
            System.out.println("2. Update Athlete Profile");
            System.out.println("3. Plan Social Media Campaign");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Athlete Profiles:");
                    displayAthleteProfiles(athleteManager);
                    break;
                case 2:
                    System.out.println("Enter Athlete Name to Update Profile:");
                    String athleteName = scanner.nextLine();
                    updateAthleteProfile(athleteManager, athleteName);
                    break;
                case 3:
                    System.out.println("Social Media Campaign Planning:");
                    planSocialMediaCampaign(athleteManager);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayAthleteProfiles(AthleteManager athleteManager) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
        System.out.println("Available Athletes:");
        for (Athlete athlete : athleteManager.getAthletes()) {
            System.out.println("- " + athlete.getName());
        }

        System.out.print("Enter the name of the athlete to view their profile: ");
        String athleteName = scanner.nextLine();

        Athlete selectedAthlete = null;
        for (Athlete athlete : athleteManager.getAthletes()) {
            if (athlete.getName().equalsIgnoreCase(athleteName)) {
                selectedAthlete = athlete;
                break;
            }
        }

        if (selectedAthlete != null) {
            System.out.println("Profile for " + selectedAthlete.getName() + ":");
            System.out.println("IG Handle: " + selectedAthlete.getIGHandle());
            System.out.println("Followers: " + selectedAthlete.getFollowers());
            System.out.println("Likes: " + selectedAthlete.getLikes());
            System.out.println("Comments: " + selectedAthlete.getComments());
            System.out.println("Price Per Post: $" + selectedAthlete.getPricePerPost());
            System.out.println("Instagram Posts Count: " + "8");
            System.out.println("-------------------------------------");
        } else {
            System.out.println("Athlete not found. Please enter a valid athlete name.");
            
        }
        }

        scanner.close();
       
    }


    private static void updateAthleteProfile(AthleteManager athleteManager, String athleteName) {
        boolean found = false;
        for (Athlete athlete : athleteManager.getAthletes()) {
            if (athlete.getName().equalsIgnoreCase(athleteName)) {
                athlete.updateProfile();
                System.out.println("Your request for an update for " + athleteName + "has been documented by AthleteMetrix. We will update you with changes when they are made.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Athlete " + athleteName + " not found.");
        }
    }

    private static void planSocialMediaCampaign(AthleteManager athleteManager) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
        System.out.println("Select athletes for the campaign:");
        for (Athlete athlete : athleteManager.getAthletes()) {
            System.out.println("- " + athlete.getName());
        }

        System.out.print("Enter the name of the athlete you'd like to represent the brand: ");
        String athleteName = scanner.nextLine();

        Athlete selectedAthlete = null;
        for (Athlete athlete : athleteManager.getAthletes()) {
            if (athlete.getName().equalsIgnoreCase(athleteName)) {
                selectedAthlete = athlete;
                break;
            }
        }

        if (selectedAthlete != null) {
            System.out.print("What brand would you like this athlete to represent? ");
            String brandName = scanner.nextLine();

            System.out.println("What type of partnership are you seeking with the athlete?");
            System.out.println("1. One Time Post");
            System.out.println("2. Multiple Partnerships");
            System.out.println("3. Other");

            int partnershipType = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    partnershipType = scanner.nextInt();
                    scanner.nextLine();
                    if (partnershipType >= 1 && partnershipType <= 3) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }

            switch (partnershipType) {
                case 1:
                    System.out.print("What are you willing to pay the athlete? $");
                    double payment1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("The following information has been sent to " + selectedAthlete.getName() +
                            ". We will update you with their response.");
                    break;
                case 2:
                    System.out.print("How many posts? ");
                    int numberOfPosts = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("What are you willing to pay the athlete per post? $");
                    double paymentPerPost = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("The following information has been sent to " + selectedAthlete.getName() +
                            ". We will update you with their response.");
                    break;
                case 3:
                    System.out.println("Email athletemetrix@gmail.com to provide a more in-depth plan for " +
                            selectedAthlete.getName() + ".");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } else {
            System.out.println("Athlete not found. Please select a valid athlete.");
   
        }
        }
        scanner.close();
    }  
}



