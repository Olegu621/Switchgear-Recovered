            package com.google.android.gms.internal.games_v2;

            import android.os.Handler;
            import android.os.Looper;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzaj {
                private final Handler zza;
                private boolean zzc;
                final Object zzb = new Object();
                private final HashMap zzd = new HashMap();

                public zzaj(Looper looper, int i) {
/* 16 */            this.zza = new zzfa(looper);
                }

                public static /* bridge */ /* synthetic */ void zzb(zzaj zzajVar) {
                    synchronized (zzajVar.zzb) {
/* 5 */                 zzajVar.zzc = false;
/* 7 */                 zzajVar.zzd();
                    }
                }

                public abstract void zza(String str, int i);

                public final void zzc(String str, int i) {
                    synchronized (this.zzb) {
                        try {
/* 6 */                     if (!this.zzc) {
/* 9 */                         this.zzc = true;
/* 20 */                        this.zza.postDelayed(new zzai(this), 1000L);
                            }
/* 32 */                    AtomicInteger atomicInteger = (AtomicInteger) this.zzd.get(str);
/* 34 */                    if (atomicInteger == null) {
/* 38 */                        atomicInteger = new AtomicInteger();
/* 43 */                        this.zzd.put(str, atomicInteger);
                            }
/* 46 */                    atomicInteger.addAndGet(i);
                        } catch (Throwable th) {
/* 52 */                    throw th;
                        }
                    }
                }

                public final void zzd() {
                    synchronized (this.zzb) {
                        try {
/* 18 */                    for (Map.Entry entry : this.zzd.entrySet()) {
/* 42 */                        zza((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
                            }
/* 50 */                    this.zzd.clear();
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
                }
            }
