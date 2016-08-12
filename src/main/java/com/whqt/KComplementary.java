package com.whqt;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.TreeMultimap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sergy Nazarevich
 */
public class KComplementary {
    public static Map<Integer, Integer> findComplimentary( Integer K, Integer[] A ){
        Map<Integer, Integer> C = new HashMap<>( );
        Multimap<Integer, Integer> Am = ArrayListMultimap.create();
        Am = putAll(Am, A);
        TreeMultimap<Integer, Integer> inverseA = Multimaps.invertFrom(Am, TreeMultimap.<Integer, Integer> create());
        for ( int i = 0; i < A.length; i++ ){
            if(A[i] <= K) {
                Integer expectedValue = K - A[i];
                for (Integer ind : inverseA.get(expectedValue)){
                    if(!ind.equals(i)) C.put(i, ind);
                }
            }
        }
        return C;
    }

    private static Multimap<Integer, Integer> putAll(Multimap<Integer, Integer>Am, Integer[] A) {
        for ( int i = 0; i < A.length; i++){
            Am.put(i, A[i]);
        }
        return Am;
    }    
}
