package com.javalab22.text.entity;

import com.javalab22.text.operation.Splitter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by vten on 30.06.2017.
 */
public class Letters implements Splitter {
    public List<String> split(List<String> list) {
        List<String> letters = new ArrayList<String>();
        Pattern p = Pattern.compile("");
        for (String s : list) {

            for (String s1 : p.split(s)) {
                letters.add(s1);
            }
            //letters.add(" ");
        }
        //letters.remove(letters.size()-1);

        return letters;
    }
}
