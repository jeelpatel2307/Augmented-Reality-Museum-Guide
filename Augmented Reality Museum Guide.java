import java.util.Scanner;

public class AugmentedRealityMuseumGuide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Augmented Reality Museum Guide!");
        System.out.println("Choose a museum exhibit to explore:");
        System.out.println("1. Ancient Artifacts");
        System.out.println("2. Dinosaur Fossils");
        System.out.println("3. Renaissance Paintings");
        System.out.println("4. Space Exploration");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                exploreAncientArtifacts();
                break;
            case 2:
                exploreDinosaurFossils();
                break;
            case 3:
                exploreRenaissancePaintings();
                break;
            case 4:
                exploreSpaceExploration();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    public static void exploreAncientArtifacts() {
        System.out.println("You are exploring Ancient Artifacts!");
        // Add augmented reality logic for Ancient Artifacts here
    }
    
    public static void exploreDinosaurFossils() {
        System.out.println("You are exploring Dinosaur Fossils!");
        // Add augmented reality logic for Dinosaur Fossils here
    }
    
    public static void exploreRenaissancePaintings() {
        System.out.println("You are exploring Renaissance Paintings!");
        // Add augmented reality logic for Renaissance Paintings here
    }
    
    public static void exploreSpaceExploration() {
        System.out.println("You are exploring Space Exploration!");
        // Add augmented reality logic for Space Exploration here
    }
}
	 
