package homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program2 {
    public static HashMap<String, String> sortBycapital(HashMap<String, String> hashmap)
    {
        List<Map.Entry<String, String> > list = new LinkedList<Map.Entry<String, String> >(hashmap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String> >() {
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, String> temp = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> pair : list) {
            temp.put(pair.getKey(), pair.getValue());
        }
        return temp;
    }

    public static void printlastelemenets(HashMap<String, String> hm,int n){
        String[] keysval= hm.keySet().toArray(new String[hm.size()]);
        int start_index=hm.size()-10;
        System.out.println("Last "+ n +" entries of the hashmap");
        for(int i= start_index;i< hm.size(); i++){
            System.out.println("Country Name: "+keysval[i]+" Capital Name: "+hm.get(keysval[i]) );
        }

    }

    public static void main(String[] args) throws IOException {
        String file="homework3/country-list.csv";
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(file));
            int Traceline = 0;
            HashMap<String,String> hashmap = new HashMap<>();
            while((line = br.readLine()) != null){

                String[] str = line.split(",");

                if(Traceline != 0) {
                    hashmap.put(str[0], str[1]);
                }

                if(Traceline <= 10){
                    for(String index : str){
                        System.out.print(index + " ");
                    }
                    System.out.println();
                }
                Traceline++;
            }
            hashmap = sortBycapital(hashmap);
            printlastelemenets(hashmap,10);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
