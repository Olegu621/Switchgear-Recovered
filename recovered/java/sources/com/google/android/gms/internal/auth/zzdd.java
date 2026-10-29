            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.StrictMode;
            import java.util.Iterator;
            import java.util.Map;
            import p000.C1024id;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdd implements zzcl {
                private static final Map zza = new C1024id();
                private final SharedPreferences zzb;
                private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

                public static zzdd zza(Context context, String str, Runnable runnable) {
                    zzdd zzddVar;
/* 6 */             if (zzcc.zzb()) {
/* 37 */                throw null;
                    }
                    synchronized (zzdd.class) {
                        try {
/* 17 */                    zzddVar = (zzdd) zza.get(null);
/* 19 */                    if (zzddVar == null) {
/* 25 */                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
/* 29 */                            throw null;
                                } catch (Throwable th) {
/* 31 */                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 34 */                            throw th;
                                }
                            }
                        } catch (Throwable th2) {
/* 36 */                    throw th2;
                        }
                    }
/* 22 */            return zzddVar;
                }

                public static synchronized void zzc() {
/* 4 */             Map map = zza;
/* 10 */            Iterator it = map.values().iterator();
/* 18 */            if (it.hasNext()) {
/* 33 */                SharedPreferences sharedPreferences = ((zzdd) it.next()).zzb;
/* 36 */                throw null;
                    }
/* 20 */            map.clear();
                }

                @Override // com.google.android.gms.internal.auth.zzcl
                public final Object zzb(String str) {
/* 2 */             throw null;
                }
            }
