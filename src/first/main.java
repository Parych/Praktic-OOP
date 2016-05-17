package first;
import java.util.*;
import static java.lang.Math.*;
public class main {
   
	public static void main (String[] args)
	{
       FirstFunct prog = new FirstFunct();
        
        Scanner s = new Scanner (System.in);
		int r=1;
		while(true)
		{if (r==0) System.exit(0);
		  System.out.println("\n-------------------------"+"\n1.Дані за замовчуванням;"+"\n2.Дані з клавіатури;"+"\n3.Друге завдання;"+"\n4.Третє завдання;"+"\n0 - вихід"+"\nВведіть варіант виконанння:  ");
		 r=s.nextInt();
		
		 	switch(r)	
		 	{
		 	case 1: {
		 			double a=1.1, b=0.004,x=0.2;
		 			System.out.println("a="+a+"\nb="+b+"\nx="+x);
		 			System.out.println("y="+prog.calc_Y(x,b,a));
		 			System.out.println("z="+prog.calc_Z(x,b,a));
		 			Date d=new Date();
				    System.out.printf("\nТекущее время: %1$TH:%1$TM. Сегодня: %1$td/%1$tm/%1$ty\n",d);}break;
		 	case 2: {System.out.println("Введите значение a: ");
					double a =s.nextDouble();
					System.out.println("Введите значение b: ");
					double b =s.nextDouble();
					System.out.println("Введите значение x: ");
					double x =s.nextDouble();
					  					
					System.out.println("y="+prog.calc_Y(x,b,a));
					System.out.println("z="+prog.calc_Z(x,b,a));
					Date d=new Date();
				    System.out.printf("\nТекущее время: %1$TH:%1$TM. Сегодня: %1$td/%1$tm/%1$ty\n",d);} break;
		 	case 3: {Funct2 zavd = new Funct2();
		 			Scanner n = new Scanner (System.in);
		 			System.out.print("Введіть у=");
		 			double y=n.nextDouble();
		 			System.out.println("N="+zavd.calc_N(y));}break;
		 	case 4:{Funct3 zavd = new Funct3();
		 			Scanner h = new Scanner (System.in);
		 			System.out.print("Введіть у=");
		 			double y=h.nextDouble();
		 			System.out.print("Введіть n=");
		 			double n=h.nextDouble();
		 			System.out.println("H="+zavd.calc_H(y,n));}break;	
		 			}
		}
			
	}
}
