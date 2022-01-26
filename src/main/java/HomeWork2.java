public class HomeWork2 {
    public static void main(String[] args) {
        isWithinNumbers(5, 17);
        positiveOrNegative( -1);
        isNegative(2);
        printWordINTimes("Привет", 6);
        years(1605);
    }
    public static boolean isWithinNumbers(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <=20){

            System.out.println(true);
            return true;
        }
        else{
            System.out.println(false);
            return false;
        }

    }
    public static void positiveOrNegative(int input) {
        if(input >= 0){
            System.out.println("число положительное");
        }
        else{
            System.out.println("число отрицательное");
        }

    }
    public static boolean isNegative(int input) {
        if(input >= 0){
            System.out.println("число положительное");
            return true;
        }
        else{
            System.out.println("число отрицательное");
            return false;
        }
    }
    public static void printWordINTimes(String word, int times){
        int a = 1;
        while(true){
            System.out.println(word);
            if (a == times){
                break;
            }
            a ++;
        }
    }
    public static boolean years(int year){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Год высокосный");
            return true;
        }
        else if(year %400 == 0) {
            System.out.println("Год высокосный");
            return true;
        }
        else{
            System.out.println("Год  не высокосный");
            return false;
        }

    }
    
}
