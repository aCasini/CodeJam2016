package it.kasoale.code.jam.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by local_admin on 16/03/2017.
 */
public class GenerateOutFile {

    private String rowTemplate = "Case #%ID%: %VALUE%";
    private String outPath = "src/resources/out/";

    public boolean generate(ArrayList<String> resultArray, String fileName){

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(outPath+fileName);
            bw = new BufferedWriter(fw);

            int index = 1;
            for (String result : resultArray ) {

                String content = rowTemplate.replace("%ID%", String.valueOf(index));
                content = content.replace("%VALUE%", result)+"\n";

                bw.write(content);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();

                return true;
            } catch (IOException ex) {
                ex.printStackTrace();
                return false;
            }

        }

    }
}
