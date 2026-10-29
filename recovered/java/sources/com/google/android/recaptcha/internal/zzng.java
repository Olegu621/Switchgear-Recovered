            package com.google.android.recaptcha.internal;

            import java.util.HashMap;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzng {
                private static final zznj zza = new zzne();
                private static final zzni zzb = new zznf();
                private final Map zzc = new HashMap();
                private final Map zzd = new HashMap();

                public /* synthetic */ zzng(zznj zznjVar, zznk zznkVar) {
                }

                public final zznl zza() {
/* 4 */             return new zznh(this, null);
                }

                public final void zzd(zzmx zzmxVar) {
/* 3 */             zzot.zza(zzmxVar, "key");
/* 10 */            if (!zzmxVar.zzb()) {
/* 40 */                zznj zznjVar = zza;
/* 42 */                zzot.zza(zzmxVar, "key");
/* 47 */                this.zzd.remove(zzmxVar);
/* 52 */                this.zzc.put(zzmxVar, zznjVar);
/* 55 */                return;
                    }
/* 12 */            zzni zzniVar = zzb;
/* 14 */            zzot.zza(zzmxVar, "key");
/* 21 */            if (!zzmxVar.zzb()) {
/* 36 */                C1951n4.m6859j("key must be repeating");
                    } else {
/* 25 */                this.zzc.remove(zzmxVar);
/* 30 */                this.zzd.put(zzmxVar, zzniVar);
                    }
                }
            }
