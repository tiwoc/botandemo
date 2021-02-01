#Ref : https://www.jianshu.com/p/6a50097e4c0c
#Ref : https://blog.csdn.net/u012528526/article/details/80647537
cmake_minimum_required(VERSION 3.4.1)

add_library(
        botan
        SHARED
        botan_all.cpp
)

find_library( # Sets the name of the path variable.
        log-lib
        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)
