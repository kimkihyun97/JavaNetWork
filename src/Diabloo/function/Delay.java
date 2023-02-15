package Diabloo.function;

public class Delay {
    public static void delay(int temp)
    {
        try { Thread.sleep(temp); } catch (Exception e) { System.out.println("딜레이 함수 오류\n원인:"+e); }
    }
}
