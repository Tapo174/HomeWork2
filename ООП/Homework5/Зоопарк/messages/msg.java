package Зоопарк.messages;
import java.util.Map;
import static java.util.Map.entry;

public class msg {
    public static final String welcomeMsg = "Welcome to Java Zoo!\n";
    public static final String byeMsg = "Bye!\n";
    public static final String chooseActionsMsg = "Choose one of next actions:";
    public static final String addAnimalMsg = """
            You've chosen to add new animal (see what types it can be)
            1 - Cat
            2 - Dog
            3 - Tiger
            4 - Wolf
            5 - Hen
            6 - Stork
            """;

    public static final String askAnimalClassMsg = "What is its type? ";
    public static final String askAnimalHeightMsg = "What is its height? ";
    public static final String askAnimalWeightMsg = "What is its weight? ";
    public static final String askAnimalEyeColorMsg = "What is its eye color? ";
    public static final String askPetNameMsg = "What is its name? ";
    public static final String askPetBreedMsg = "What is its breed? ";
    public static final String askPetVaccinationsMsg = "What vaccinations does it have (space separated)? ";
    public static final String askPetFurColorMsg = "What is its fur color? ";
    public static final String askPetBirthDaterMsg = "What is its birth date (format yyyy-mm-dd)? ";
    public static final String askWildAnimalHabitatMsg = "What is its habitat? ";
    public static final String askWildAnimalFoundDateMsg = "What is its found date (format yyyy-mm-dd)? ";
    public static final String askBirdFeathersColorMsg = "What is its feathers color? ";
    public static final String askBirdFlightAltitudeMsg = "What is its flight altitude? ";
    public static final String askIsDogTrainedMsg = "Is the dog trained (answer y / n)? ";
    public static final String askIsWolfLeaderdMsg = "Is the wolf leader (answer y / n)? ";
    public static final String askIsCatWoollyMsg = "Is the cat woolly (answer y / n)? ";

    public static final String getIndexlMsg = "Enter number: ";
    public static final String getAnimalIDMsg = "Enter animal ID: ";
    public static final String invalidAnimalIDMsg = "Invalid animal ID";
    public static final String incorrectInputMsg = "This is not a valid answer, try again!";
    public static final String cannotDoItMsg = "Cannot do it (invalid animal id)";

    public static final String animalWasAddedMsg = "This animal was added to zoo";
    public static final String animalNotAddedMsg = "This animal was not added to zoo";
    public static final String nobodyRemovedMsg = "Nobody was removed from zoo (invalid animal id)";
    public static final String animalWasRemovedMsg = "Animal was removed from zoo";

    public static final String nobodyLivesInZooMsg = "Nobody lives in zoo yet";
    public static final String notImplementedMsg = "It is not implemented yet";

    public static final String cannotFlyMsg = "The animal cannot fly... Sorry";
    public static final String cannotPetMsg = "The animal cannot be petted... Sorry";
    public static final String cannotTrainMsg = "The animal cannot be trained... Sorry";

    public static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Add new animal to zoo"),
            entry(2, "Remove an animal from zoo"),
            entry(3, "Print information about a specific animal"),
            entry(4, "Print information about all the animals in the zoo"),
            entry(5, "Make a sound of specific animal"),
            entry(6, "Make sounds of all the animals in the zoo"),
            entry(7, "Try animal to fly"),
            entry(8, "Try animal to pet"),
            entry(9, "Try animal to train"),
            entry(0, "Quit from Java Zoo"));
}
