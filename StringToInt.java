public class StringToInt {

    public static void main(String[] args){

        //thats NOT how it works
        String s = "102";
        System.out.println(s + 4);
//output - 1024 

//thats how it works

    String m = "105";
    System.out.println(Integer.parseInt(m) + 4);
//output = 109

// also 

int n = Integer.parseInt("3");

System.out.println("3" + 4);
//or
System.out.println(n + 4);
//output- 7


//turn int to string
int l = 8;
System.out.println(l + 1);
//output 9
System.out.println(Integer.toString(l) + 1);

//output 81






    }
    
}
