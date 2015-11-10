
public class Tester
{
  public static void main(String[] args)
  {
    PollDisplayPanel votingMachine =
                   new PollDisplayPanel("Tami", "Brain", "Liz");
    votingMachine.vote1();
    votingMachine.vote2();
    votingMachine.vote3();
    System.out.println(votingMachine);
  }
}
