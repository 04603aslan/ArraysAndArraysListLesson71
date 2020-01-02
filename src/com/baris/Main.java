package com.baris;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arrays={2,1,9,4,12,5,7,5};
        int password;
        ArrayList<Integer> values= new ArrayList<>();
       int[] passwordArrray = new int[8];
        boolean value=false;
        Arrays.sort(arrays);
        do {
            for (int i=0;i<arrays.length;i++)
            {
                password = Integer.valueOf(JOptionPane.showInputDialog("Enter Password"));
                passwordArrray[i] = password;
            }
            value =Arrays.equals(arrays,passwordArrray);
        }
        while (value==false);

        {
            JOptionPane.showMessageDialog(null,"Accept Account ");
        }
        for (int i=0;i<arrays.length;i++)
        {
            int val;
            val=Integer.parseInt(JOptionPane.showInputDialog("Enter "+i+" value"));
            values.add(val);
        }

            JOptionPane.showMessageDialog(null,values);


    }
}
