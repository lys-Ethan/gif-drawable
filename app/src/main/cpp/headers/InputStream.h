//
// Created by 李韵爽 on 2020/10/23.
//

#ifndef GIF_DRAWABLE_INPUTSTREAM_H
#define GIF_DRAWABLE_INPUTSTREAM_H

#include "lys_gif.h"

#endif //GIF_DRAWABLE_INPUTSTREAM_H

class InputStream {

public:

    InputStream(JNIEnv *env, jobject jInputStream);

    int read(void* Buffer, size_t size);
    ~InputStream();

private:
    jobject oInputStream;

    JNIEnv *env;
};
