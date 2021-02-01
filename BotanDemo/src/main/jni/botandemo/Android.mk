LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := botandemo
LOCAL_SRC_FILES := botandemo.cpp
LOCAL_SHARED_LIBRARIES := botan

include $(BUILD_SHARED_LIBRARY)