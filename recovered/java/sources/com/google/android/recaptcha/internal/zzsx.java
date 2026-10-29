            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public class zzsx extends IOException {
                private boolean zza;

                public zzsx(IOException iOException) {
/* 5 */             super(iOException.getMessage(), iOException);
                }

                public final void zza() {
/* 2 */             this.zza = true;
                }

                public final boolean zzb() {
/* 1 */             return this.zza;
                }

/* 8 */         public zzsx(String str) {
/* 9 */             super(str);
                }
            }
