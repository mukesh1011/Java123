public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean shouldWakeUp = false;
        if (barking == true){
            if (hourOfDay < 0 || hourOfDay > 23) {
                return shouldWakeUp;
            } else if (hourOfDay < 8 || hourOfDay > 22) {
                shouldWakeUp = true;
                return shouldWakeUp;
            } else if (hourOfDay < 0 || hourOfDay > 23){
                return shouldWakeUp;
            } else {
                return shouldWakeUp;
            }

        }

       return shouldWakeUp;

    }
}
