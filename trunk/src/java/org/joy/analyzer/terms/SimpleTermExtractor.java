/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.joy.analyzer.terms;

import java.util.HashSet;
import org.joy.nlp.Word;

/**
 *
 * @author Administrator
 */
public class SimpleTermExtractor extends TermExtractor{

    @Override
    public HashSet<String> getTerms() {
        //直接把分词结果作为term返回
        HashSet<String> termSet = new HashSet<String>();
        for(Word w:words){
            termSet.add(w.getText());
        }
        return termSet;
    }

}