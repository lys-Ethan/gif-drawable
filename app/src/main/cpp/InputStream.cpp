//
// Created by 李韵爽 on 2020/10/23.
//

#include "headers/InputStream.h"

static char* READ_METHOD_ID = "s";

InputStream::InputStream(JNIEnv *env, jobject jInputStream) {
    this->oInputStream = jInputStream;
    this->env = env;
}


int InputStream::read(void *Buffer, size_t size) {

    return env->CallIntMethod(oInputStream,)
}

InputStream::~InputStream() {
    env -> DeleteLocalRef(oInputStream);
}
