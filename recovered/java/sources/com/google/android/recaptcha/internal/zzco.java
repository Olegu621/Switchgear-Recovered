            package com.google.android.recaptcha.internal;

            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzco {
                public static final /* synthetic */ int zza = 0;
                private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

                public static final void zza(int i, long j) {
/* 1 */             ConcurrentHashMap concurrentHashMap = zzb;
/* 3 */             Integer numValueOf = Integer.valueOf(i);
/* 7 */             Object zzcnVar = concurrentHashMap.get(numValueOf);
/* 11 */            if (zzcnVar == null) {
/* 15 */                zzcnVar = new zzcn();
                    }
/* 18 */            zzcn zzcnVar2 = (zzcn) zzcnVar;
/* 26 */            zzcnVar2.zzg(zzcnVar2.zzb() + 1);
/* 34 */            zzcnVar2.zzf(zzcnVar2.zzd() + j);
/* 45 */            zzcnVar2.zze(Math.max(j, zzcnVar2.zzc()));
/* 48 */            concurrentHashMap.put(numValueOf, zzcnVar2);
                }
            }
