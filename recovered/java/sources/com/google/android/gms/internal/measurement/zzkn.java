            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.StrictMode;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.C1024id;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkn implements zzju {
                private static final Map zza = new C1024id();
                private final SharedPreferences zzb;
                private SharedPreferences.OnSharedPreferenceChangeListener zzc;
                private volatile Map zze;
                private final Object zzd = new Object();
                private final List zzf = new ArrayList();

                private zzkn(SharedPreferences sharedPreferences, Runnable runnable) {
/* 18 */            this.zzb = sharedPreferences;
                }

                public static zzkn zza(Context context, String str, Runnable runnable) {
                    final zzkn zzknVar;
                    SharedPreferences sharedPreferencesZza;
/* 5 */             if (zzjm.zza() && !str.startsWith("direct_boot:") && !zzjm.zzc(context)) {
/* 22 */                return null;
                    }
                    synchronized (zzkn.class) {
/* 27 */                Map map = zza;
/* 33 */                zzknVar = (zzkn) map.get(str);
/* 35 */                if (zzknVar == null) {
/* 39 */                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
/* 50 */                        if (str.startsWith("direct_boot:")) {
/* 56 */                            if (zzjm.zza()) {
/* 58 */                                context = context.createDeviceProtectedStorageContext();
                                    }
/* 73 */                            sharedPreferencesZza = zzcf.zza(context, str.substring(12), 0, zzcb.zza);
                                } else {
/* 85 */                            sharedPreferencesZza = zzcf.zza(context, str, 0, zzcb.zza);
                                }
/* 77 */                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 90 */                        zzknVar = new zzkn(sharedPreferencesZza, runnable);
/* 95 */                        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzkm
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
/* 3 */                                 this.zza.zzc(sharedPreferences, str2);
                                    }
                                };
/* 98 */                        zzknVar.zzc = onSharedPreferenceChangeListener;
/* 102 */                       zzknVar.zzb.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
/* 105 */                       map.put(str, zzknVar);
                            } catch (Throwable th) {
/* 109 */                       StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 112 */                       throw th;
                            }
                        }
                    }
/* 114 */           return zzknVar;
                }

                public static synchronized void zzb() {
                    try {
/* 4 */                 Map map = zza;
/* 18 */                for (zzkn zzknVar : map.values()) {
/* 26 */                    SharedPreferences sharedPreferences = zzknVar.zzb;
/* 28 */                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = zzknVar.zzc;
/* 30 */                    onSharedPreferenceChangeListener.getClass();
/* 33 */                    sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                        }
/* 39 */                map.clear();
                    } catch (Throwable th) {
/* 45 */                throw th;
                    }
                }

                public final /* synthetic */ void zzc(SharedPreferences sharedPreferences, String str) {
                    synchronized (this.zzd) {
/* 5 */                 this.zze = null;
/* 7 */                 zzkl.zzc();
                    }
                    synchronized (this) {
                        try {
/* 14 */                    Iterator it = this.zzf.iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((zzjr) it.next()).zza();
                            }
                        } catch (Throwable th) {
/* 39 */                    throw th;
                        }
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzju
                public final Object zze(String str) {
/* 1 */             Map<String, ?> map = this.zze;
/* 3 */             if (map == null) {
                        synchronized (this.zzd) {
                            try {
/* 8 */                         map = this.zze;
/* 10 */                        if (map == null) {
/* 12 */                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
/* 18 */                                Map<String, ?> all = this.zzb.getAll();
/* 22 */                                this.zze = all;
/* 24 */                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 27 */                                map = all;
                                    } catch (Throwable th) {
/* 32 */                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 35 */                                throw th;
                                    }
                                }
                            } catch (Throwable th2) {
/* 39 */                        throw th2;
                            }
                        }
                    }
/* 40 */            if (map != null) {
/* 42 */                return map.get(str);
                    }
/* 47 */            return null;
                }
            }
