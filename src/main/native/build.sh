#!/bin/bash
 
gcc -c -Wall -Werror -fpic upcall.c || exit $?
gcc -shared -o libupcall.so upcall.o || exit $?
