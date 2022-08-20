use the below ndk build command to create the .so files 
ndk-build NDK_APPLICATION_MK=src/main/jni/Application.mk NDK_PROJECT_PATH=src/main

use the below ndk build command to clean the project
ndk-build clean NDK_APPLICATION_MK=src/main/jni/Application.mk NDK_PROJECT_PATH=src/main