package de.hhu.bsinfo.panama.upcall;

import jdk.incubator.foreign.Addressable;

public class UpcallHelper {
    static <T> T requireNonNull(T obj, String symbolName) {
        if (obj == null) {
            throw new UnsatisfiedLinkError("unresolved symbol: " + symbolName);
        }
        return obj;
    }

    public static void perform_upcall ( Addressable upcall) throws Throwable {
        var mh$ = UpcallHelper.requireNonNull(constants$0.perform_upcall$MH, "perform_upcall");
        mh$.invokeExact(upcall);
    }
}
