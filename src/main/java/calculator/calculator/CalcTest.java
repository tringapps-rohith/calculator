package calculator.calculator;

import java.util.*;
import java.util.logging.*;
class Calculator
{
	Logger l=Logger.getLogger("com.api.jar");
        private double a;
        private double b;
        public void setA(double a)
        {
                this.a=a;
        }
        public double getA()
        {
                return a;
        }
        public void setB(double b)
        {
                this.b=b;
        }
        public double getB()
        {
                return b;
        }
}
class Addition extends Calculator
{
        double calculate()
        {
                return getA()+getB();
        }
}
class Subtraction extends Calculator
{
        double calculate()
        {
                return getA()-getB();
        }
}
class Multiplication extends Calculator
{
        double calculate()
        {
                return getA()*getB();
        }
}
class Division extends Calculator
{
        double calculate()
        {
                return getA()/getB();
        }
}
class CalcTest
{
        public static void main(String ...args)
        {
				Logger l=Logger.getLogger("com.api.jar");

                Scanner sin=new Scanner(System.in);
                l.info("Enter first number\n");
                double a=sin.nextDouble();
                l.info("Enter second number\n");
                double b=sin.nextDouble();
                Calculator c=new Calculator();
                int ch;
                do
                {
                        l.info("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
                        l.info("Enter your choice\n");
                        ch=sin.nextInt();
                        switch(ch)
                        {
                                case 1:
                                        Addition add=new Addition();
                                        c=add;
                                        c.setA(a);
                                        c.setB(b);
                                        l.log(Level.INFO,()-> "Addition of 2 numbers is... "+add.calculate());
                                        break;
                                case 2: Subtraction s=new Subtraction();
                                        c=s;
                                        c.setA(a);
                                        c.setB(b);
                                        l.log(Level.INFO,()-> "Subtraction of 2 numbers is... "+s.calculate());
                                        break;
                                case 3:
                                        Multiplication m=new Multiplication();
                                        c=m;
                                        c.setA(a);
                                        c.setB(b);
                                        l.log(Level.INFO,()-> "Multiplication of 2 numbers is... "+m.calculate());
                                        break;
                                case 4:
                                         Division d=new Division();
                                        c=d;
                                        c.setA(a);
                                        c.setB(b);
                                        l.log(Level.INFO,()-> "Multiplication of 2 numbers is... "+d.calculate());
                                        break;

                                case 5:l.info("Thank You\n");
                                        break;
                                default:l.info("Invalid Input\n");                                     
										break;
                        }
                }while(ch!=5);
        }
}
