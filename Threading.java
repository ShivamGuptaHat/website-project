class Threading 
{
  public static void main(String []args)
  {
   Thread thread=new Thread(new MyThread);
   thread.start();
<<<<<<< HEAD
   System.out.println(" Done ");
=======
    System.out.println(" main done ");
>>>>>>> 4a945b738a7c2992856c5a90e8705e3bc456b8ee
  }
}
class MyThread implements Runnable
{
 public void run()
 {
  for(int  i=0;i<5;i++)
  {
	  System.out.println(" Hi ");
	  sdfasdfasdfsda
   System.out.println(" Hello Friends : ");
  }
 }
}
