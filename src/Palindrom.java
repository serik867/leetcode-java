public class Palindrom {
    public static void main(String[] args) {


        System.out.println(isPolindrom(181));
        System.out.println(isPolindrom(182));
        System.out.println(isPolindrom(111));
        System.out.println(isPolindrom(101));
    }

    public static boolean isPolindrom(int num){
        String number= String.valueOf(num);
        String reversed="";

        for (int i = number.length()-1; i >=0 ; i--) {
            reversed+=number.charAt(i);

        }

        if (number.equals(reversed)){
            return true;
        }else{
            return false;
        }




    }



}
