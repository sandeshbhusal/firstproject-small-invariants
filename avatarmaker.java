import java.util.ArrayList;
import java.util.Random;

class Avatar {
    int height;
    float capacity;
    int stamina;
    int magic;
    int sneak;

    Avatar() {}

    // Constructor
    Avatar(int height, float capacity, int stamina, int magic, int sneak) {
        this.height = height;
        this.capacity = capacity;
        this.stamina = stamina;
        this.magic = magic;
        this.sneak = sneak;
    }

    public static Avatar AvatarFactory(int height, float capacity, int stamina, int magic, int sneak) {
        if (height <= 0 || height >= 20)
            return null;
        
        if (capacity <= 10.0 || capacity >= 50.0)
            return null;

        if (stamina <= 50 || stamina >= 100)
            return null;

        if (sneak <= 3 || sneak >= 13)
            return null;

        return new Avatar(height, capacity, stamina, magic, sneak);
    }
}

public class avatarmaker {
    public static void testavatarcreator() {
        // Generate a random permutation-combination of avatar values and see if we generate the invariants.
        ArrayList<Avatar> avatars = new ArrayList<Avatar>();
        Random rand = new Random();
        
        // Valid avatars.
        for (int i = 0; i <= 100; i++) {
            int height = rand.nextInt(19) + 1; // Random height between 1 and 19
            float capacity = rand.nextFloat() * (49.0f - 10.1f) + 10.1f; // Random capacity between 10.1 and 49.0
            int stamina = rand.nextInt(49) + 51; // Random stamina between 51 and 99
            int magic = rand.nextInt(101); // Random magic between 0 and 100
            int sneak = rand.nextInt(10) + 4; // Random sneak between 4 and 13
            
            Avatar a =  new Avatar();
            if (a.AvatarFactory(height, capacity, stamina, magic, sneak) != null)
                avatars.add(a);
        }

        // Invalid avatars (all -ve range)
        for (int i = 0; i <= 100; i++) {
            int height = rand.nextInt() * (20) - 20; // Random height between -20 and 0
            float capacity = rand.nextFloat() * (49.0f - 10.1f) - 50.0f; // Random capacity between 10.1 and 49.0
            int stamina = rand.nextInt(49) + 51; // Random stamina between 51 and 99
            int magic = rand.nextInt(101); // Random magic between 0 and 100
            int sneak = rand.nextInt(10) + 4; // Random sneak between 4 and 13
            
            Avatar a =  new Avatar();
            if (a.AvatarFactory(height, capacity, stamina, magic, sneak) != null)
                avatars.add(a);
        }
    }
    // Generate a avatar with constraints.
    public static void main(String[] args) {
        // Run the avatarcreator.
        testavatarcreator();
    }
}