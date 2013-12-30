/**Andrew Ninh
 * Ninh Laboratory of Computational Biology
 * FASTA File Reader and Writer version 1.0
 */
import java.io.*;
import java.util.*;
public class FASTAFile
{
    public String readFASTA(String fname)throws IOException{
        BufferedReader r = new BufferedReader(new FileReader(fname));
        Scanner input = new Scanner(r);
        String dna = "";
        String sDescription = input.nextLine();
        while(input.hasNext()){
            dna += input.nextLine().trim();    
        }
        return dna;
    }

    public void writeFASTA(String fName, String sDescription, String sSequence, String fLoc)throws IOException{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fLoc + fName)));
        int nStart=0;
        int nNum = 70;
        out.println(sDescription);
        while (nStart < sSequence.length()){
            if (sSequence.length() - nStart < nNum)
                out.println(sSequence.substring(nStart));
            else
                out.println(sSequence.substring(nStart, nStart+70));
            nStart = nStart + nNum;
        }
        out.close();
    }
}
