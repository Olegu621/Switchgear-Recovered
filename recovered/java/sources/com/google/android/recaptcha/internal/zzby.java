            package com.google.android.recaptcha.internal;

            import java.util.LinkedHashMap;
            import java.util.Map;
            import p000.nc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzby {
                public static final /* synthetic */ int zza = 0;
                private static zzby zzb;
                private static final Map zzc = new LinkedHashMap();
                private final Map zzd;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Map zzf() {
/* 1 */             Map map = zzc;
/* 13 */            LinkedHashMap linkedHashMap = new LinkedHashMap(nc1.m6962c(map.size()));
/* 28 */            for (Map.Entry entry : map.entrySet()) {
/* 50 */                linkedHashMap.put(entry.getKey(), ((zzbz) entry.getValue()).zzb());
                    }
/* 54 */            return linkedHashMap;
                }

                public final Object zzb(int i) {
/* 7 */             return this.zzd.get(Integer.valueOf(i));
                }
            }
