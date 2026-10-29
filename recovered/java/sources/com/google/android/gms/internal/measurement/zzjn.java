            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import p000.fm0;
            import p000.qi2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjn extends zzkg {
                private final Context zza;
                private final qi2 zzb;

                public zzjn(Context context, qi2 qi2Var) {
/* 4 */             this.zza = context;
/* 6 */             this.zzb = qi2Var;
                }

                public final boolean equals(Object obj) {
                    qi2 qi2Var;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zzkg) {
/* 10 */                zzkg zzkgVar = (zzkg) obj;
/* 22 */                if (this.zza.equals(zzkgVar.zza()) && ((qi2Var = this.zzb) != null ? qi2Var.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.zza.hashCode() ^ 1000003;
/* 11 */            qi2 qi2Var = this.zzb;
/* 22 */            return (qi2Var == null ? 0 : qi2Var.hashCode()) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 3 */             String string = this.zza.toString();
/* 7 */             int length = string.length();
/* 13 */            String strValueOf = String.valueOf(this.zzb);
/* 28 */            StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
/* 35 */            fm0.m3796v(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.measurement.zzkg
                public final Context zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.measurement.zzkg
                public final qi2 zzb() {
/* 1 */             return this.zzb;
                }
            }
