@echo off
"E:\\android-sdk\\cmake\\3.22.1\\bin\\cmake.exe" ^
  "-HD:\\Dhruta\\Mama Devalayam\\Mama Devalayam New\\app" ^
  "-DCMAKE_SYSTEM_NAME=Android" ^
  "-DCMAKE_EXPORT_COMPILE_COMMANDS=ON" ^
  "-DCMAKE_SYSTEM_VERSION=21" ^
  "-DANDROID_PLATFORM=android-21" ^
  "-DANDROID_ABI=arm64-v8a" ^
  "-DCMAKE_ANDROID_ARCH_ABI=arm64-v8a" ^
  "-DANDROID_NDK=E:\\android-sdk\\ndk\\25.1.8937393" ^
  "-DCMAKE_ANDROID_NDK=E:\\android-sdk\\ndk\\25.1.8937393" ^
  "-DCMAKE_TOOLCHAIN_FILE=E:\\android-sdk\\ndk\\25.1.8937393\\build\\cmake\\android.toolchain.cmake" ^
  "-DCMAKE_MAKE_PROGRAM=E:\\android-sdk\\cmake\\3.22.1\\bin\\ninja.exe" ^
  "-DCMAKE_LIBRARY_OUTPUT_DIRECTORY=D:\\Dhruta\\Mama Devalayam\\Mama Devalayam New\\app\\build\\intermediates\\cxx\\Debug\\555q1x35\\obj\\arm64-v8a" ^
  "-DCMAKE_RUNTIME_OUTPUT_DIRECTORY=D:\\Dhruta\\Mama Devalayam\\Mama Devalayam New\\app\\build\\intermediates\\cxx\\Debug\\555q1x35\\obj\\arm64-v8a" ^
  "-DCMAKE_BUILD_TYPE=Debug" ^
  "-BD:\\Dhruta\\Mama Devalayam\\Mama Devalayam New\\app\\.cxx\\Debug\\555q1x35\\arm64-v8a" ^
  -GNinja
