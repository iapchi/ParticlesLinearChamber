package com.iapchi;

import com.iapchi.exception.InvalidContentException;
import com.iapchi.exception.InvalidLengthException;
import com.iapchi.exception.InvalidSpeedException;

import javax.swing.*;

public class AnimateImpl {
    public static boolean checkLength(int i) throws InvalidLengthException {
        if (i > 50) {
            JOptionPane.showMessageDialog(null, "Invalid String length(1-50 allowed). Press OK to exit.");
            throw new InvalidLengthException("Invalid String length");
        }
        return true;
    }

    public boolean checkSpeed(int i) throws InvalidSpeedException {
        if (i < 1 || i > 10) {
            JOptionPane.showMessageDialog(null, "Invalid Speed (1-10 allowed). Press OK to exit.");
            throw new InvalidSpeedException("Invalid Speed");
        }
        return true;
    }

    public boolean checkContent(String particles) throws InvalidContentException {
        if (!particles.matches("[.RL]*")) {
            JOptionPane.showMessageDialog(null, "Invalid String Content ( . , R , L  Only). Press OK to exit.");
            throw new InvalidContentException("Invalid String Content");
        }return true;
    }

}
