/**
 * Turns genes into a numberical array and prints them for Automaton Analysis
 * 
 * Andrew Ninh
 * version 1.0  03/27/2013
 */
public class GeneAutomaton
{
    void cellAutomaton(String gene)
    {
        int [] gMatrix = new int [gene.length()];
        for(int i=0; i<gene.length();i++)
        {
            switch (gene.charAt(i))
            {
                case 'A': gMatrix[i]=1; break;
                case 'C': gMatrix[i]=2; break;
                case 'G': gMatrix[i]=3; break;
                case 'T': gMatrix[i]=4; break;
                default: gMatrix[i]=0; break;
            }
        }
        print(gMatrix);
    }
    
    void print(int [] gMatrix)
    {
        System.out.print("{");
        for(int i = 0; i < gMatrix.length; i++)
        {
             if((i+1)%100==0)
                System.out.print(gMatrix[i] + "},\n{");
             else if (i != gMatrix.length-1)
                System.out.print(gMatrix[i] + ",");
             else
                System.out.print(gMatrix[i] + "}");
        }
        //System.out.print(cMatrix[cMatrix.length-1]+"},\n");
    }
}
