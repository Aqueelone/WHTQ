package com.whqt;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Sergy Nazarevich
 */
public class TagOrganizer {
    /**
     * this method read file with many tags separated with "|"
     * and return "top tags"
     * 
     * (if need only 100000 we could do itterations in this while statment)
     * @param fileName path with file name which we'll read
     * @return Multiset with sorted (nest in top) tags as string 
     * @throws IOException when file not found or other IO read error 
     */
    public static Multiset<String> findTop(String fileName) throws IOException{
        Multiset<String> multiset = HashMultiset.create();
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line = br.readLine();
            //TODO possible refactoring with multithreding f.e. via AKKA
            while (line != null) {
                multiset.addAll(Arrays.asList(line.split("\\|")));
                line = br.readLine();
            }
        }
        
        Multiset<String> highestCountFirst = Multisets.copyHighestCountFirst(multiset);
        return highestCountFirst;
    }
}
