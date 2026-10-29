            package com.google.android.gms.internal.play_billing;

            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzba {
                private final String zza;
                private final zzaz zzb;
                private zzaz zzc;

                public /* synthetic */ zzba(String str, zzbb zzbbVar) {
/* 6 */             zzaz zzazVar = new zzaz();
/* 9 */             this.zzb = zzazVar;
/* 11 */            this.zzc = zzazVar;
/* 13 */            str.getClass();
/* 16 */            this.zza = str;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(32);
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append('{');
/* 20 */            zzaz zzazVar = this.zzb.zzb;
/* 22 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 24 */            while (zzazVar != null) {
/* 26 */                Object obj = zzazVar.zza;
/* 28 */                sb.append(str);
/* 31 */                if (obj == null || !obj.getClass().isArray()) {
/* 62 */                    sb.append(obj);
                        } else {
/* 47 */                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
/* 58 */                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
/* 65 */                zzazVar = zzazVar.zzb;
/* 67 */                str = ", ";
                    }
/* 72 */            sb.append('}');
/* 75 */            return sb.toString();
                }

                public final zzba zza(Object obj) {
/* 3 */             zzaz zzazVar = new zzaz();
/* 8 */             this.zzc.zzb = zzazVar;
/* 10 */            this.zzc = zzazVar;
/* 12 */            zzazVar.zza = obj;
/* 14 */            return this;
                }
            }
