/**
 * Write a description of class GADriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class GADriver
{
    public static void main(String[] args) throws IOException
    {
        GeneAutomaton GA = new GeneAutomaton();
        FASTAFile f = new FASTAFile();
        String filename = "human_astrovirus.fasta";
        String seq = f.readFASTA("C:\\Users\\andrew\\BioDocs\\Research\\GeneAutomaton\\genes\\"+filename);
        GA.cellAutomaton(seq);
    }
}
