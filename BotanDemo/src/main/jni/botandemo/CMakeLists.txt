#Ref : https://www.jianshu.com/p/6a50097e4c0c
#Ref : https://blog.csdn.net/u012528526/article/details/80647537
cmake_minimum_required(VERSION 3.4.1)
project(botandemo)

add_library(
        botandemo
        SHARED
        botandemo.cpp
)

find_library(log-lib log)

target_link_libraries(
        botan
)
