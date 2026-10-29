            package com.google.android.gms.internal.fido;

            import java.util.Arrays;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbp extends zzbq {
                private final String zza;

                public zzbp(String str) {
/* 4 */             this.zza = str;
                }

                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
/* 1 */             zzbq zzbqVar = (zzbq) obj;
/* 3 */             zzbqVar.zza();
/* 8 */             String str = this.zza;
/* 10 */            int length = str.length();
/* 14 */            String str2 = ((zzbp) zzbqVar).zza;
                    return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj != null && zzbp.class == obj.getClass()) {
/* 24 */                return this.zza.equals(((zzbp) obj).zza);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 12 */            return Arrays.hashCode(new Object[]{3, this.zza});
                }

                public final String toString() {
/* 5 */             return fm0.m3784j("\"", this.zza, "\"");
                }

                @Override // com.google.android.gms.internal.fido.zzbq
                public final int zza() {
/* 1 */             return 3;
                }
            }
