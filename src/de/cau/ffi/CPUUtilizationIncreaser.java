package de.cau.ffi;

import java.util.Random;

public class CPUUtilizationIncreaser {
    public static final int doDummyWork() {
        int retVal = 0;
        int i = 0;

        while (i < 12582912) {
			if (i == 0)
				retVal = new Random().nextInt();
				
            retVal = retVal + 2;
            i++;
        }

        return retVal;
    }
}
