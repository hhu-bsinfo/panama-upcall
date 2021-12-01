package de.hhu.bsinfo.panama.upcall;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.ResourceScope;

public class Application {

    private static final Addressable upcall = upcall_t.allocate(() -> {
        System.out.println("Hello from Java code!");
        throw new RuntimeException("Throwing an exception inside an upcall");
    }, ResourceScope.globalScope());

    public static void main(String[] args) {
        try {
            UpcallHelper.perform_upcall(upcall);
        } catch (Throwable e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("Upcall finished!");
        }
    }
}
