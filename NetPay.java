import java.util.Scanner;
public class NetPay {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Gross salary= ");
        // Gs = gross salary
        double GS = sc.nextDouble();
        //IT = income tax 
        double  IT = GS * 0.1;
        // ST = State tax 
        double  ST = GS * 0.035;
        // MT = madical tax 
        double  MT  = GS * 0.0275;
        // PP = pension plan 
        double  PP = GS * 0.05;
        // HI = health insurance 
        double  HT = 175.00;
        
        double NetPay = GS - IT - ST - MT - PP - HT ; 
        System.out.println("gross salary: RM " + GS);
        System.out.println("Income tax : RM" + IT);
        System.out.println("Income tax : RM" + ST);
        System.out.println("Medicare tax : RM"+ MT);
        System.out.println("Persion Plan : RM "+ PP);
        System.out.println("Health Insurance : RM  " + HT);
        System.out.println("Net salary : RM " + NetPay);
    }
    
}