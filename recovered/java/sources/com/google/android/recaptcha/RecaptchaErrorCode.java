            package com.google.android.recaptcha;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.kb1;
            import p000.ke0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m6176d2 = {"Lcom/google/android/recaptcha/RecaptchaErrorCode;", HttpUrl.FRAGMENT_ENCODE_SET, "errorCode", HttpUrl.FRAGMENT_ENCODE_SET, "errorMessage", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "UNKNOWN_ERROR", "NETWORK_ERROR", "INVALID_SITEKEY", "INVALID_KEYTYPE", "INVALID_PACKAGE_NAME", "INVALID_ACTION", "INVALID_TIMEOUT", "NO_NETWORK_FOUND", "INTERNAL_ERROR", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public enum RecaptchaErrorCode {
                UNKNOWN_ERROR(0, "Unknown Error"),
                NETWORK_ERROR(1, "Network Error"),
                INVALID_SITEKEY(2, "Site key invalid"),
                INVALID_KEYTYPE(3, "Key type invalid"),
                INVALID_PACKAGE_NAME(4, "Package name not allowed"),
                INVALID_ACTION(5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information"),
                INVALID_TIMEOUT(6, "Invalid timeout, minimum value is 5_000L milliseconds"),
                NO_NETWORK_FOUND(7, "No network found on device"),
                INTERNAL_ERROR(100, "Internal Error");

                private static final /* synthetic */ ke0 $ENTRIES = kb1.m6030C(values());
                private final int errorCode;
                private final String errorMessage;

                RecaptchaErrorCode(int i, String str) {
/* 4 */             this.errorCode = i;
/* 6 */             this.errorMessage = str;
                }

                public static ke0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public final int getErrorCode() {
/* 1 */             return this.errorCode;
                }

                public final String getErrorMessage() {
/* 1 */             return this.errorMessage;
                }
            }
