public class LeapYear {

   public static boolean isLeapYear(int year){

       boolean ans = false;
       if (year >=1 && year <=9999){
           if (year % 4 == 0) {
               if (year % 100 == 0){
                   if (year % 400 == 0){
                       ans = true;
                       return ans;
                   } else {
                       return ans;
                   }
               } else {
                   ans = true;
                   return ans;
               }
           } else {
               return ans;
           }

       } else {
           return ans;
       }
   }

}
