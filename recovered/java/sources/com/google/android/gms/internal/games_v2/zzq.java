            package com.google.android.gms.internal.games_v2;

            import java.util.Arrays;
            import p000.InterfaceC0172b9;
            import p000.de3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzq implements InterfaceC0172b9 {
                public final int zza;
                public final String zzb;

                public /* synthetic */ zzq(int i, String str, zzp zzpVar) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = str;
                }

                public static zzo zza() {
/* 4 */             return new zzo(null);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return false;
                    }
/* 6 */             if (obj == this) {
/* 5 */                 return true;
                    }
/* 11 */            if (!(obj instanceof zzq)) {
/* 1 */                 return false;
                    }
/* 14 */            zzq zzqVar = (zzq) obj;
                    return this.zza == zzqVar.zza && de3.m3029k(this.zzb, zzqVar.zzb);
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
                }
            }
