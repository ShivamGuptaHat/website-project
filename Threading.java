class Threading 
{
  public static void main(String []args)
  {
   Thread thread=new Thread(new MyThread);
   thread.start();
  }
}
class MyThread implements Runnable
{
 public void run()
 {
  for(int  i=0;i<5;i++)
  {
   System.out.println(" Hello Friends : ");
  }
 }
}
