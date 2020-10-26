package ro.mta.facc;

public class Main {
    public static void main(String[] args)
    {
       Carte c=new Carte("Zece negri mititei","Agatha Cristie",1998,200);
        Biblioteca b=new Biblioteca();
        b.add(c);
        b.add(new Carte("Sherlock Holmes","Connan Doyle", 2004,300));
        System.out.println(b);
        Thread.currentThread().setName(("My Thread"));
        System.out.println(Thread.currentThread().getName());
        MyThread[] threadArray =new MyThread[10];
        for(int i=0;i<10;i++)
        {
            threadArray[i]=new MyThread();
            threadArray[i].setName("" + i);
            threadArray[i].start();
        }
        for (int i=0;i<10;i++)
        {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
