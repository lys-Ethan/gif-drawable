//
// Created by 李韵爽 on 2020/10/19.
//

#include "headers/lys_gif.h"
#include <string>
#include <gif_lib.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_ethanlee_test_TestUtils_jnitest(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    DGifOpen()
    return env->NewStringUTF(hello.c_str());
}
