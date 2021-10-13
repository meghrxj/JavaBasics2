public class StringToInt2 {
    
    public static void main(String[] args){

        String s = "age: 47";
        s = s.replaceAll("\\D+","");

        int n = Integer.parseInt(s);
//after 2 years
        System.out.println(n + 2);
//output 49
    }
}
