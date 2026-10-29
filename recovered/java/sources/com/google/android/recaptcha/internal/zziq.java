            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.Set;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zziq {
                private Set zza;
                private Set zzb;
                private Long zzc;
                private int zzd;

                private static final boolean zzc(String str, Set set) {
/* 13 */            Iterator it = StringsKt.m6235K(str, new char[]{'.'}).iterator();
/* 17 */            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
/* 23 */            while (it.hasNext()) {
/* 35 */                String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
/* 43 */                if (set.contains(strConcat2)) {
/* 1 */                     return true;
                        }
/* 48 */                strConcat = strConcat2.concat(".");
                    }
/* 4 */             return false;
                }

                public final void zza(zzxg zzxgVar) {
/* 13 */            this.zza = CollectionsKt.m6195N(zzxgVar.zzf().zzi());
/* 27 */            this.zzb = CollectionsKt.m6195N(zzxgVar.zzg().zzi());
                }

                public final boolean zzb(String str) {
/* 1 */             Set set = this.zza;
/* 4 */             if (set == null || this.zzb == null) {
/* 38 */                if (this.zzc == null) {
/* 48 */                    this.zzc = Long.valueOf(System.currentTimeMillis());
                        }
/* 53 */                this.zzd++;
/* 3 */                 return true;
                    }
/* 15 */            if (set.isEmpty()) {
/* 3 */                 return true;
                    }
/* 18 */            Set set2 = this.zzb;
/* 20 */            set2.getClass();
/* 27 */            if (zzc(str, set2)) {
/* 29 */                return false;
                    }
/* 31 */            return zzc(str, set);
                }
            }
