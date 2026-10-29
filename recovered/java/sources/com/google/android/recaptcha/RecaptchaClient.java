            package com.google.android.recaptcha;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.c10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m6176d2 = {"Lcom/google/android/recaptcha/RecaptchaClient;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/android/recaptcha/RecaptchaAction;", "recaptchaAction", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "Lo42;", HttpUrl.FRAGMENT_ENCODE_SET, "execute-0E7RQCE", "(Lcom/google/android/recaptcha/RecaptchaAction;JLc10;)Ljava/lang/Object;", "execute", "execute-gIAlu-s", "(Lcom/google/android/recaptcha/RecaptchaAction;Lc10;)Ljava/lang/Object;", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public interface RecaptchaClient {
                /* JADX INFO: renamed from: execute-0E7RQCE, reason: not valid java name */
                Object mo10486execute0E7RQCE(RecaptchaAction recaptchaAction, long j, c10 c10Var);

                /* JADX INFO: renamed from: execute-gIAlu-s, reason: not valid java name */
                Object mo10487executegIAlus(RecaptchaAction recaptchaAction, c10 c10Var);
            }
