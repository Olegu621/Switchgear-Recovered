            package p000;

            import android.os.Process;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.util.Log;
            import java.util.IllegalFormatException;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qa3 {

                /* JADX INFO: renamed from: a */
                public final String f15477a;

                public qa3(String str) {
/* 43 */            this.f15477a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
                }

                /* JADX INFO: renamed from: d */
                public static String m7754d(String str, String str2, Object... objArr) {
/* 2 */             if (objArr.length > 0) {
                        try {
/* 6 */                     str2 = String.format(Locale.US, str2, objArr);
                        } catch (IllegalFormatException unused) {
/* 13 */                    "Unable to format ".concat(str2);
/* 26 */                    str2 = pm2.m7489l(str2, " [", TextUtils.join(", ", objArr), "]");
                        }
                    }
/* 32 */            return AbstractC0886en.m3508l(str, " : ", str2);
                }

                /* JADX INFO: renamed from: a */
                public final void m7755a(RemoteException remoteException, String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 6)) {
/* 12 */                m7754d(this.f15477a, str, objArr);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7756b(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 4)) {
/* 12 */                m7754d(this.f15477a, str, objArr);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m7757c(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 5)) {
/* 12 */                m7754d(this.f15477a, str, objArr);
                    }
                }
            }
