            package com.google.android.recaptcha.internal;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzry {
                static final zzry zza = new zzry(true);
                public static final /* synthetic */ int zzb = 0;
                private static volatile boolean zzc;
                private final Map zzd;

                public zzry() {
/* 9 */             this.zzd = new HashMap();
                }

                public final zzsm zza(zzts zztsVar, int i) {
/* 12 */            return (zzsm) this.zzd.get(new zzrx(zztsVar, i));
                }

/* 11 */        public zzry(boolean z) {
                    this.zzd = Collections.EMPTY_MAP;
                }
            }
