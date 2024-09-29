//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        String party = "O";

        if (party == "D")
        {
            System.out.println("You get a Democratic Donkey!");
        }

        else if (party == "R")
        {
            System.out.println("You get a Republican Elephant!");
        }

        else if (party == "I")
        {
            System.out.println("You get the Independent Person!");
        }

        else
        {
            System.out.println("You got the other party!");
        }
    }
}