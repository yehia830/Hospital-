package com.tiy.practice;

/**
 * Created by Yehia830 on 8/29/16.
 */
public class Diagnosis {
    public static final int LUNG_CANCER = 1;
    public static final int BRAIN_CANCER = 2;
    public static final int COMMON_COLD = 3;
    public static final int STREP_THROAT = 4;
    public static final int UNDIAGONOSED = -1;

    private int illness = UNDIAGONOSED;

    public Diagnosis(int illness) {
        this.illness = illness;
    }
}
