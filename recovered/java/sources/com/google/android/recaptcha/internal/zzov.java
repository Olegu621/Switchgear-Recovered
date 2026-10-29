            package com.google.android.recaptcha.internal;

            import java.io.Closeable;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzov implements Closeable {
                private static final ThreadLocal zza = new zzou();
                private int zzb = 0;

                public static int zza() {
/* 9 */             return ((zzov) zza.get()).zzb;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             int i = this.zzb;
/* 3 */             if (i > 0) {
/* 7 */                 this.zzb = i - 1;
                    } else {
/* 12 */                C1951n4.m6856g("Mismatched calls to RecursionDepth (possible error in core library)");
                    }
                }
            }
