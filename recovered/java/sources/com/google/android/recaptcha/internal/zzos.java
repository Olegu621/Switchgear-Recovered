            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzos {
                private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
                private static final zzow zzb;

                static {
                    zzow zzoxVar;
/* 13 */            for (int i = 0; i < 2; i++) {
/* 19 */                zzoxVar = null;
                        try {
/* 38 */                    zzoxVar = (zzow) Class.forName(zza[i]).asSubclass(zzow.class).getDeclaredConstructor(null).newInstance(null);
                        } catch (Throwable unused) {
                        }
/* 41 */                if (zzoxVar != null) {
/* 52 */                    zzb = zzoxVar;
                        }
                    }
/* 49 */            zzoxVar = new zzox();
/* 52 */            zzb = zzoxVar;
                }

                public static StackTraceElement zza(Class cls, int i) {
/* 3 */             zzot.zza(cls, "target");
/* 9 */             return zzb.zza(cls, 2);
                }
            }
