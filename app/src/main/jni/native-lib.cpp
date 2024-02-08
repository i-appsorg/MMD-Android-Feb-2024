#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring
JNICALL
Java_com_MamaDevalayam_Interwork_MyApplication_getSheetApiKey(JNIEnv *env, jobject){
    std::string mNativeKey = "AIzaSyDQzTsnTRgYvCDfEUm1ac0rQgHZbiiB_ew";
    return env->NewStringUTF(mNativeKey.c_str());
}

//extern "C" JNIEXPORT jstring
//JNICALL
//Java_com_MamaDevalayam_Interwork_MyApplication_getSheetApiKey(JNIEnv *env, jobject){
//    std::string mNativeKey = "AIzaSyBMkCWoTqmo_qdjL675bfgP5zbh1zboKCk"; // test
//    return env->NewStringUTF(mNativeKey.c_str());
//}

extern "C" JNIEXPORT jstring
JNICALL
Java_com_MamaDevalayam_Interwork_MyApplication_getSheetId(JNIEnv *env, jobject){
    std::string mNativeKey = "1O-8LD2wcWDqBiKw9I3QDI0JuwWCVrenyN_IzVHVMd4E";
    return env->NewStringUTF(mNativeKey.c_str());
}

//extern "C" JNIEXPORT jstring
//JNICALL
//Java_com_MamaDevalayam_Interwork_MyApplication_getSheetId(JNIEnv *env, jobject){
//    std::string mNativeKey = "1wGP8IHJGOCT-K0t2eXAh_lmaGYRHgmWmgAIrUJ4ASQo"; // test
//    return env->NewStringUTF(mNativeKey.c_str());
//}