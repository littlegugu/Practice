package Find_Ugly_Number;

public class Ugly_Number {

    public boolean is_ugly(int num){
        if (num<=0)
            return false;

        while (num%2==0) num/=2;
        while (num%3==0) num/=3;
        while (num%5==0) num/=5;
        if (num==1){
            return true;
        }else{
            return false;
        }
    }

    public int test(int num){
        while (num%2==0) num/=2;
        return num;
    }



}
