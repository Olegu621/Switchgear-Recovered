            package com.google.android.recaptcha.internal;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgp {
                private final String zza;
                private final long zzb;
                private final int zzc;

                public zzgp(String str, long j, int i) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = j;
/* 8 */             this.zzc = i;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof zzgp)) {
/* 33 */                return false;
                    }
/* 5 */             zzgp zzgpVar = (zzgp) obj;
                    return Intrinsics.m6216a(zzgpVar.zza, this.zza) && zzgpVar.zzb == this.zzb && zzgpVar.zzc == this.zzc;
                }

                public final int zza() {
/* 1 */             return this.zzc;
                }

                public final long zzb() {
/* 1 */             return this.zzb;
                }

                public final String zzc() {
/* 1 */             return this.zza;
                }
            }
