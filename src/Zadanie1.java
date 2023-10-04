 import java.math.BigDecimal;
 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;

 public class Zadanie1 {

 public static final String fileName = "fibonacci100.txt";

 public static void main(String[] args) {

 System.out.println("Fibonacci wersja 1");

 try{

 BufferedWriter writer
 = new BufferedWriter(new FileWriter(fileName));
 for(int i=0; i<100; i++)
 writer.write(Fibonacci(i).toString() + "\n");
 writer.close();

 }catch (IOException ex)
 { System.out.println("Błąd");return; }

 System.out.println("Wynik zapisany do pliku: "
 + fileName);
 }
 static BigDecimal Fibonacci(int n) {

 if(n==0) return new BigDecimal(0);
 if(n==1) return new BigDecimal(1);

 BigDecimal f0= new BigDecimal(0);
 BigDecimal f1 = new BigDecimal(1);

 for(int i=2; i<=n; i++) {

 BigDecimal m = new BigDecimal(0);
 m = m.add(f1);
 m = m.add(f0);
 f0 = f1;
 f1 = m;
 }
 return f1;
 }
 }
