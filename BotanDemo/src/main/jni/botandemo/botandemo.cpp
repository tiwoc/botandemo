#include <jni.h>
#include <./botan_all.h>

using namespace Botan;

extern "C" {
	JNIEXPORT jstring JNICALL Java_de_tiwoc_botandemo_Native_pbkdf2Demo
		(JNIEnv * env, jclass cls, jint iterations)
	{
		try {
			PBKDF* pbkdf = get_pbkdf("PBKDF2(SHA-256)");
			AutoSeeded_RNG rng;

			SecureVector<byte> salt = rng.random_vec(16);
			OctetString aes256_key = pbkdf->derive_key(
					32, "this_is_a_weak_password",
					&salt[0], salt.size(), iterations);
			return env->NewStringUTF(aes256_key.as_string().c_str());

		} catch (...) {
			std::string empty_str = "";
			return env->NewStringUTF(empty_str.c_str());
		}
	}
}
