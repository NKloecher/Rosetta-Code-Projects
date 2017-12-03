import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        hundredDoors();

    }


    private static void hundredDoors(){
        String[] doors = new String[101];
        //Alternatily do with booleans
        for (int i = 1; i < doors.length; i++) {
            doors[i] = "closed";
        }

        System.out.print(Arrays.toString(doors) + "\n");

        for (int i = 1; i < doors.length; i++) {
            for (int i1 = 1; i1 < doors.length; i1++) {
                if (i % i1 == 0){ //imperfect  ^ i1 + i
                    if (doors[i].equals("closed")){
                        doors[i] = "open";
                    }else doors[i] = "closed";
                }
            }
        }

        System.out.print(Arrays.toString(doors) + "\n");
        System.out.print("The opened doors are: \n");

        for (int i = 0; i < doors.length; i++) {
            if (doors[i].equals("open")){
                System.out.print(i + " ");
            }
        }
    }


}
