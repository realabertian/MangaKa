#include <jni.h>
#include <string>
#include <opencv2/opencv.hpp>

//
// Created by Bing Tian on 2020/10/17.
//


extern "C"
JNICALL jstring JNIEXPORT
Java_acgn_player_HelloJni_helloworld(JNIEnv *env, jclass clazz) {
    std::string hello = "helloworld";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_acgn_player_HelloJni_openCVVersion(JNIEnv *env, jclass clazz) {
   cv::
}