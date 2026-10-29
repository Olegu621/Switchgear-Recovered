            package io.flutter.plugins.sharedpreferences;

            import android.util.Log;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import okhttp3.HttpUrl;
            import p000.C2085pw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m6176d2 = {"wrapResult", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "result", "wrapError", "exception", HttpUrl.FRAGMENT_ENCODE_SET, "shared_preferences_android_release"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class MessagesAsync_gKt {
                /* JADX INFO: Access modifiers changed from: private */
                public static final List<Object> wrapError(Throwable th) {
/* 3 */             if (th instanceof SharedPreferencesError) {
/* 5 */                 SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) th;
/* 23 */                return C2085pw.m7566e(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
                    }
/* 74 */            return C2085pw.m7566e(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                }

                private static final List<Object> wrapResult(Object obj) {
/* 1 */             return C1839a.m6210b(obj);
                }
            }
