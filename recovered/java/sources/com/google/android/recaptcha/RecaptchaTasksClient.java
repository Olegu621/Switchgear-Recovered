            package com.google.android.recaptcha;

            import com.google.android.gms.tasks.Task;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m6176d2 = {"Lcom/google/android/recaptcha/RecaptchaTasksClient;", HttpUrl.FRAGMENT_ENCODE_SET, "executeTask", "Lcom/google/android/gms/tasks/Task;", HttpUrl.FRAGMENT_ENCODE_SET, "recaptchaAction", "Lcom/google/android/recaptcha/RecaptchaAction;", "timeout", HttpUrl.FRAGMENT_ENCODE_SET, "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public interface RecaptchaTasksClient {
                Task<String> executeTask(RecaptchaAction recaptchaAction);

                Task<String> executeTask(RecaptchaAction recaptchaAction, long timeout);
            }
