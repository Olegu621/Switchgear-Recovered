            package com.google.android.gms.internal.cloudmessaging;

            import android.os.Handler;
            import android.os.Looper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class zzf extends Handler {
                private final Looper zza;

                public zzf() {
/* 8 */             this.zza = Looper.getMainLooper();
                }

/* 10 */        public zzf(Looper looper) {
/* 11 */            super(looper);
/* 12 */            this.zza = Looper.getMainLooper();
                }

/* 12 */        public zzf(Looper looper, Handler.Callback callback) {
/* 13 */            super(looper, callback);
/* 14 */            this.zza = Looper.getMainLooper();
                }
            }
