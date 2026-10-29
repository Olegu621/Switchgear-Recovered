            package com.google.android.gms.internal.tasks;

            import android.os.Handler;
            import android.os.Looper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class zza extends Handler {
                private final Looper zza;

                public zza() {
/* 8 */             this.zza = Looper.getMainLooper();
                }

/* 10 */        public zza(Looper looper) {
/* 11 */            super(looper);
/* 12 */            this.zza = Looper.getMainLooper();
                }
            }
