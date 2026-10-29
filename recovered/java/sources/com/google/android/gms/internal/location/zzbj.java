            package com.google.android.gms.internal.location;

            import android.os.Looper;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbj {
                public static Looper zza(Looper looper) {
                    return looper != null ? looper : zzb();
                }

                public static Looper zzb() {
/* 12 */            kb1.m6063p("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
/* 15 */            return Looper.myLooper();
                }
            }
