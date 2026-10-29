            package com.google.android.gms.internal.playcore_age_signals;

            import android.os.Process;
            import android.text.TextUtils;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.IllegalFormatException;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzd {
                private final String zza;

                public zzd(String str) {
/* 43 */            this.zza = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
                }

                private static String zze(String str, String str2, Object... objArr) {
/* 2 */             if (objArr.length > 0) {
                        try {
/* 6 */                     str2 = String.format(Locale.US, str2, objArr);
                        } catch (IllegalFormatException e) {
/* 24 */                    AbstractC1245n0.m4877e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
/* 37 */                    str2 = pm2.m7489l(str2, " [", TextUtils.join(", ", objArr), "]");
                        }
                    }
/* 43 */            return AbstractC0886en.m3508l(str, " : ", str2);
                }

                public final int zza(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 6)) {
/* 18 */                return AbstractC1245n0.m4876d("PlayCore", zze(this.zza, "onError(%d)", objArr));
                    }
/* 23 */            return 0;
                }

                public final int zzb(Throwable th, String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 6)) {
/* 16 */                return AbstractC1245n0.m4877e("PlayCore", zze(this.zza, str, objArr), th);
                    }
/* 21 */            return 0;
                }

                public final int zzc(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 4)) {
/* 16 */                return Log.i("PlayCore", zze(this.zza, str, objArr));
                    }
/* 21 */            return 0;
                }

                public final int zzd(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 5)) {
/* 16 */                return AbstractC1245n0.m4889q("PlayCore", zze(this.zza, str, objArr));
                    }
/* 21 */            return 0;
                }
            }
