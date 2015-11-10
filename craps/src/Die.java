
public class Die
{
   private int NumDots;
   
    public void roll()
    {
      NumDots = (int)(Math.random()*6+1);
    }
    public static void main(String[] args)
    {
      Die die = new Die();
      die.roll();
      System.out.println(die.getNumDots());
    }
    public int getNumDots()
    {
      return NumDots;
    }
}
