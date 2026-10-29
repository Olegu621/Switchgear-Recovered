            package com.google.android.gms.internal.games_v2;

            import android.app.Application;
            import android.content.Context;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.bh3;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbr {
                private static final AtomicReference zza = new AtomicReference();
                private final Application zzb;
                private final zzau zzc;
                private final bh3 zzd;

                private zzbr(Application application, zzau zzauVar, bh3 bh3Var) {
/* 4 */             this.zzb = application;
/* 6 */             this.zzc = zzauVar;
/* 8 */             this.zzd = bh3Var;
                }

                public static Application zza() {
/* 1 */             zzb();
/* 12 */            return ((zzbr) zza.get()).zzb;
                }

                public static void zzb() {
/* 14 */            kb1.m6063p("PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.", zza.get() != null);
                }

                public static void zzc(Context context) {
/* 7 */             kb1.m6054g(context != null);
/* 10 */            AtomicReference atomicReference = zza;
/* 18 */            if (((zzbr) atomicReference.get()) == null) {
/* 20 */                Context applicationContext = context.getApplicationContext();
/* 30 */                Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
/* 42 */                zzbr zzbrVar = new zzbr(application, zzau.zza(application), bh3.m1359b(application));
/* 50 */                while (!atomicReference.compareAndSet(null, zzbrVar)) {
/* 86 */                    if (atomicReference.get() != null && atomicReference.get() != null) {
/* 94 */                        return;
                            }
                        }
/* 54 */                zzbrVar.zzc.zzc();
/* 57 */                bh3 bh3Var = zzbrVar.zzd;
                        synchronized (bh3Var.f2429c) {
                            try {
/* 64 */                        if (!bh3Var.f2432f) {
/* 70 */                            bh3Var.f2427a.registerActivityLifecycleCallbacks(bh3Var.f2428b);
/* 73 */                            bh3Var.f2432f = true;
                                }
                            } catch (Throwable th) {
/* 81 */                        throw th;
                            }
                        }
                    }
                }
            }
