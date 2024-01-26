package org.example;


import java.util.Scanner;


public class BloodBank
{
    public static void main(String[] args) {
        System.out.println("Blood Bank Management System");
        BloodAcceptor obj=new BloodAcceptor();
        BloodDonar obj1=new BloodDonar();
        int val=000;
        boolean st=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int num=sc.nextInt();
        if(num==val)
        {
            st=true;
            while (true)
            {
                System.out.println("Enter your choice which you want to do:-");
                int choiceInner= sc.nextInt();
                if(choiceInner==1)
                {
                    System.out.println("Enter your adding choice:-");
                    int taker=sc.nextInt();
                    System.out.println("Press 1. add o+");
                    System.out.println("Press 2. add o-");
                    System.out.println("Press 3. add a+");
                    System.out.println("Press 4. add a-");
                    System.out.println("Press 5. add b+");
                    System.out.println("Press 6. add b-");
                    System.out.println("Press 7. add ab+");
                    System.out.println("Press 8. add ab-");
                    switch (taker)
                    {
                        case 1:
                            obj.addOpos();
                            break;
                        case 2:
                            obj.addOneg();
                            break;
                        case 3:
                            obj.addApos();
                            break;
                        case 4:
                            obj.addAneg();
                            break;
                        case 5:
                            obj.addBpos();
                            break;
                        case 6:
                            obj.addBneg();
                            break;
                        case 7:
                            obj.addABpos();
                            break;
                        case 8:
                            obj.addABneg();
                            break;
                        default:
                            System.out.println("Wrong choice");

                    }

                }

                else if(choiceInner==2)
                {
                    System.out.println("Enter your giving choice:-");
                    int giver=sc.nextInt();
                    System.out.println("Press 1. give o+");
                    System.out.println("Press 2. give o-");
                    System.out.println("Press 3. give a+");
                    System.out.println("Press 4. give a-");
                    System.out.println("Press 5. give b+");
                    System.out.println("Press 6. give b-");
                    System.out.println("Press 7. give ab+");
                    System.out.println("Press 8. give ab-");
                    switch(giver)
                    {
                        case 1:
                            obj1.giveOpos();
                            break;
                        case 2:
                            obj1.giveOneg();
                            break;
                        case 3:
                            obj1.giveApos();
                            break;
                        case 4:
                            obj1.giveAneg();
                            break;
                        case 5:
                            obj1.giveBpos();
                            break;
                        case 6:
                            obj1.giveBneg();
                            break;
                        case 7:
                            obj1.giveABpos();
                            break;
                        case 8:
                            obj1.giveABneg();
                            break;
                        default:
                            System.out.println("Wrong choice");
                    }
                }
                else{
                    System.out.println("Wrong Choice");
                    break;
                }


            }

        }
     }
}

class BloodAcceptor
{
    static int n1=1;
    static int n2=1;
    static int n3=1;
    static int n4=1;
    static int n5=1;
    static int n6=1;
    static int n7=1;
    static int n8=1;



    String oPos[]=new String[n1];
    String oNeg[]=new String[n2];

    String aPos[]=new String[n3];

    String aNeg[]=new String[n4];

    String bPos[]=new String[n5];

    String bNeg[]=new String[n6];

    String abPos[]=new String[n7];

    String abNeg[]=new String[n8];
    static int c1=0;
    static int c2=0;

    static int c3=0;

    static int c4=0;

    static int c5=0;

    static int c6=0;

    static int c7=0;

    static int c8=0;
    Scanner sc=new Scanner(System.in);

    public void addOpos()
    {
        System.out.println("Enter the O+ donar");
        for(int i=0;i<=n1;i++)
        {
            oPos[i]=sc.nextLine();
        }
        c1=c1+1;
        n1=n1+1;
    }



    public void addOneg()
    {
        System.out.println("Enter the O- donar");
        for(int i=0;i<=n2;i++)
        {
            oNeg[i]=sc.nextLine();
        }
        c2=c2+1;
        n2=n2+1;

    }

    public void addApos()
    {
        System.out.println("Enter the A+ donar");
        for(int i=0;i<=n3;i++)
        {
            aPos[i]=sc.nextLine();
        }
        c3=c3+1;
        n3=n3+1;
    }

    public void addAneg()
    {
        System.out.println("Enter the A- donar");
        for(int i=0;i<=n4;i++)
        {
            aNeg[i]=sc.nextLine();
        }
        c4=c4+1;
        n4=n4+1;
    }

    public void addBpos()
    {
        System.out.println("Enter the B+ donar");
        for(int i=0;i<=n5;i++)
        {
            bPos[i]=sc.nextLine();
        }
        n5=n5+1;
        c5=c5+1;
    }

    public void addBneg()
    {
        System.out.println("Enter the B- donar");
        for(int i=0;i<=n6;i++)
        {
            bNeg[i]=sc.nextLine();
        }
        c6=c6+1;
        n6=n6+1;
    }

    public void addABpos()
    {
        System.out.println("Enter the AB+ donar");
        for(int i=0;i<=n7;i++)
        {
            abPos[i]=sc.nextLine();
        }
        n7=n7+1;
        c7=c7+1;
    }

    public void addABneg()
    {
        System.out.println("Enter the AB- donar");
        for(int i=0;i<=n8;i++)
        {
            abNeg[i]=sc.nextLine();
        }
        n8=n8+1;
        c8=c8+1;
    }

}


class BloodDonar extends BloodAcceptor
{


    public void giveOpos()
    {
        BloodAcceptor.c1=c1-1;
        for(int i=0;i<BloodAcceptor.n1-1;i++)
        {
            oPos[i]=oPos[i-1];
        }
        BloodAcceptor.n1=n1-1;
        BloodAcceptor.c1=c1-1;
    }

    public void giveOneg()
    {
        for(int i=0;i<BloodAcceptor.n2-1;i++)
        {
            oNeg[i]=oNeg[i-1];
        }
        BloodAcceptor.c2=c2-1;
        BloodAcceptor.n2=n2-1;
    }

    public void giveApos()
    {
        for(int i=0;i<BloodAcceptor.n3-1;i++)
        {
            aPos[i]=aPos[i-1];
        }
        BloodAcceptor.c3=c3-1;
        BloodAcceptor.n3=n3-1;
    }
    public void giveAneg()
    {
        for(int i=0;i<BloodAcceptor.n4-1;i++)
        {
            aNeg[i]=aNeg[i-1];
        }
        BloodAcceptor.c4=c4-1;
        BloodAcceptor.n4=n4-1;
    }

    public void giveBpos()
    {
        for(int i=0;i<BloodAcceptor.n5-1;i++)
        {
            bPos[i]=bPos[i-1];
        }
        BloodAcceptor.c5=c5-1;
        BloodAcceptor.n5=n5-1;
    }

    public void giveBneg()
    {
        for(int i=0;i<BloodAcceptor.n6-1;i++)
        {
            bNeg[i]=bNeg[i-1];
        }
        BloodAcceptor.c6=c6-1;
        BloodAcceptor.n6=n6-1;
    }

    public void giveABpos()
    {
        for(int i=0;i<BloodAcceptor.n7-1;i++)
        {
            abPos[i]=abPos[i-1];
        }
        BloodAcceptor.c7=c7-1;
        BloodAcceptor.n7=n7-1;
    }

    public void giveABneg()
    {
        for(int i=0;i<BloodAcceptor.n8-1;i++)
        {
            abNeg[i]=abNeg[i-1];
        }
        BloodAcceptor.c8=c8-1;
        BloodAcceptor.n8=n8-1;
    }
}



