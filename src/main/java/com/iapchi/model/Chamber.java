package com.iapchi.model;

import com.iapchi.AnimateImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;

@Data
@AllArgsConstructor
public class Chamber implements Animate {
    @NonNull
    String particles;

    @Override
    public String[] animate(int i) throws Exception {
        AnimateImpl animateImpl = new AnimateImpl();
        String particleString = getParticles();
        boolean lengthCheck = AnimateImpl.checkLength(particleString.length());
        boolean speedCheck = animateImpl.checkSpeed(i);
        boolean contentCheck = animateImpl.checkContent(particleString);
        ArrayList<String> result = new ArrayList<>();
        String leftString = particleString.replace("R",".");
        String rightString = particleString.replace("L",".");
        StringBuilder leftResultString = new StringBuilder(leftString);
        StringBuilder rightResultString = new StringBuilder(rightString);
        String[] initialStrArray = new String[particleString.length()];
        Arrays.fill(initialStrArray, ".");
        if (lengthCheck && speedCheck && contentCheck) {
            result.add(particleString.replaceAll("L|R","X"));
            while (!(leftString.matches("[.]*")) || (!rightString.matches("[.]*"))) {
                String[] strArray = new String[particleString.length()];
                Arrays.fill(strArray, ".");
                for (int lIndex = leftString.indexOf("L");
                     lIndex >= 0;
                     lIndex = leftString.indexOf("L", lIndex + 1)) {
                    if (lIndex - i >= 0 && lIndex >= 0) {
                        strArray[lIndex - i] = "X";
                        leftResultString.setCharAt(lIndex - i, 'L');
                    }leftResultString.setCharAt(lIndex, '.');
                }
                for (int rIndex = rightString.lastIndexOf("R");
                     rIndex >= 0;
                     rIndex = rightString.lastIndexOf("R", rIndex -1)) {

                    if (rIndex + i <= rightString.length() - 1 && rIndex >= 0) {
                        strArray[rIndex + i] = "X";
                        rightResultString.setCharAt(rIndex + i, 'R');
                    }rightResultString.setCharAt(rIndex, '.');
                }
                leftString = leftResultString.toString();
                rightString = rightResultString.toString();
                result.add(String.join("", strArray));
            }
        }
            return result.toArray(new String[result.size()]);

        }
    }