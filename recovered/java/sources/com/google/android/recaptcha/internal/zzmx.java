            package com.google.android.recaptcha.internal;

            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class zzmx {
                private final String zza;
                private final Class zzb;
                private final boolean zzc;

                private zzmx(String str, Class cls, boolean z, boolean z2) {
/* 4 */             zzot.zzb(str);
/* 7 */             this.zza = str;
/* 9 */             this.zzb = cls;
/* 11 */            this.zzc = z;
/* 13 */            System.identityHashCode(this);
/* 18 */            for (int i = 0; i < 5; i++) {
                    }
                }

                public static zzmx zza(String str, Class cls) {
/* 4 */             return new zzmx(str, cls, false, false);
                }

                public final String toString() {
/* 1 */             Class cls = this.zzb;
/* 7 */             String name = getClass().getName();
/* 27 */            return fm0.m3791q(fm0.m3794t(name, "/"), this.zza, "[", cls.getName(), "]");
                }

                public final boolean zzb() {
/* 1 */             return this.zzc;
                }

/* 23 */        public zzmx(String str, Class cls, boolean z) {
/* 24 */            this(str, cls, z, true);
                }
            }
