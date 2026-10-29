            package com.google.android.recaptcha.internal;

            import kotlin.text.StringsKt;
            import p000.AbstractC0886en;
            import p000.C1772ix;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcn implements Comparable {
                private int zza;
                private long zzb;
                private long zzc;

                public final String toString() {
/* 13 */            String strM6231G = StringsKt.m6231G(10, String.valueOf(this.zzb / ((long) this.zza)));
/* 23 */            String strM6231G2 = StringsKt.m6231G(10, String.valueOf(this.zzc));
/* 60 */            return fm0.m3790p(AbstractC0886en.m3514r("avgExecutionTime: ", strM6231G, " us| maxExecutionTime: ", strM6231G2, " us| totalTime: "), StringsKt.m6231G(10, String.valueOf(this.zzb)), " us| #Usages: ", StringsKt.m6231G(5, String.valueOf(this.zza)));
                }

                @Override // java.lang.Comparable
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public final int compareTo(zzcn zzcnVar) {
/* 13 */            return C1772ix.m5609a(Long.valueOf(this.zzb), Long.valueOf(zzcnVar.zzb));
                }

                public final int zzb() {
/* 1 */             return this.zza;
                }

                public final long zzc() {
/* 1 */             return this.zzc;
                }

                public final long zzd() {
/* 1 */             return this.zzb;
                }

                public final void zze(long j) {
/* 1 */             this.zzc = j;
                }

                public final void zzf(long j) {
/* 1 */             this.zzb = j;
                }

                public final void zzg(int i) {
/* 1 */             this.zza = i;
                }
            }
