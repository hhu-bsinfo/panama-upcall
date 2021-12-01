#include "upcall.h"
#include <stdio.h>

void perform_upcall(upcall_t upcall) {
    printf("Hello from native code!\n");
    upcall();
}
