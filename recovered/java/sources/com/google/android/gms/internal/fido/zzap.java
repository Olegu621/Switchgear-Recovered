            package com.google.android.gms.internal.fido;

            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzap {
                private final String zza;
                private final zzao zzb;
                private zzao zzc;

                public /* synthetic */ zzap(String str, zzam zzamVar) {
/* 7 */             zzao zzaoVar = new zzao(null);
/* 10 */            this.zzb = zzaoVar;
/* 12 */            this.zzc = zzaoVar;
/* 14 */            str.getClass();
/* 17 */            this.zza = str;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(32);
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append('{');
/* 20 */            zzao zzaoVar = this.zzb.zzc;
/* 22 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 24 */            while (zzaoVar != null) {
/* 26 */                Object obj = zzaoVar.zzb;
/* 28 */                sb.append(str);
/* 31 */                String str2 = zzaoVar.zza;
/* 33 */                if (str2 != null) {
/* 35 */                    sb.append(str2);
/* 40 */                    sb.append('=');
                        }
/* 43 */                if (obj == null || !obj.getClass().isArray()) {
/* 74 */                    sb.append(obj);
                        } else {
/* 59 */                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
/* 70 */                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
/* 77 */                zzaoVar = zzaoVar.zzc;
/* 79 */                str = ", ";
                    }
/* 84 */            sb.append('}');
/* 87 */            return sb.toString();
                }

                public final zzap zza(String str, int i) {
/* 1 */             String strValueOf = String.valueOf(i);
/* 8 */             zzan zzanVar = new zzan(null);
/* 13 */            this.zzc.zzc = zzanVar;
/* 15 */            this.zzc = zzanVar;
/* 17 */            zzanVar.zzb = strValueOf;
/* 21 */            zzanVar.zza = "errorCode";
/* 23 */            return this;
                }

                public final zzap zzb(String str, Object obj) {
/* 4 */             zzao zzaoVar = new zzao(null);
/* 9 */             this.zzc.zzc = zzaoVar;
/* 11 */            this.zzc = zzaoVar;
/* 13 */            zzaoVar.zzb = obj;
/* 15 */            zzaoVar.zza = str;
/* 17 */            return this;
                }
            }
