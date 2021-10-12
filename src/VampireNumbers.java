import java.util.*;
public class VampireNumbers
{
    public static void main(String[] args) {
        Set<Long> vampireNumbers =new TreeSet<Long>();
        for(long i = 10; vampireNumbers.size()<=100 ; i++) {
            if ((numOfDigit(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long fang1 = 2; fang1 <= Math.sqrt(i) + 1; fang1++) {
                if (i % fang1 == 0) {
                    long fang2 = i / fang1;
                    if (validFangs(i, fang1, fang2) && fang1 <= fang2) {
                        vampireNumbers.add(i);
                    }
                }
            }
        }
        for(long result:vampireNumbers)
            System.out.println(result);
    }
    public static boolean validFangs(long num, long fang1 , long fang2){
        String strOfFang1=Long.toString(fang1);
        String strOfFang2=Long.toString(fang2);
        if(strOfFang1.endsWith("0") && strOfFang2.endsWith("0"))
            return false;
        int lengthOfNum=numOfDigit(num)/2;
        if(numOfDigit(fang1) != lengthOfNum || numOfDigit(fang2) != lengthOfNum)
            return false;
        String strFormOfNum=Long.toString(num);
        strOfFang1+=strOfFang2;
        char[] numToChar =strFormOfNum.toCharArray();
        char[] charsOfFangs =strOfFang1.toCharArray();
        Arrays.sort(numToChar);
        Arrays.sort(charsOfFangs);
        return Arrays.equals(numToChar,charsOfFangs);
    }
    public static int numOfDigit(long l){
        return Long.toString(Math.abs(l)).length();
    }
}
