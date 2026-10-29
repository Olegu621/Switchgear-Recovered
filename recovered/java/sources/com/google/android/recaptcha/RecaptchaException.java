            package com.google.android.recaptcha;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m6176d2 = {"Lcom/google/android/recaptcha/RecaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "Lcom/google/android/recaptcha/RecaptchaErrorCode;", "errorMessage", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Lcom/google/android/recaptcha/RecaptchaErrorCode;Ljava/lang/String;)V", "getErrorCode", "()Lcom/google/android/recaptcha/RecaptchaErrorCode;", "getErrorMessage", "()Ljava/lang/String;", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 11 */    public final class RecaptchaException extends Exception {
                private final RecaptchaErrorCode errorCode;
                private final String errorMessage;

                public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this(recaptchaErrorCode, (i & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
                }

                public final RecaptchaErrorCode getErrorCode() {
/* 1 */             return this.errorCode;
                }

                public final String getErrorMessage() {
/* 1 */             return this.errorMessage;
                }

/* 12 */        public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
/* 13 */            super(str);
                    this.errorCode = recaptchaErrorCode;
                    this.errorMessage = str;
                }
            }
