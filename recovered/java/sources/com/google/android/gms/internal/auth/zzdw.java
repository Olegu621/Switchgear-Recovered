            package com.google.android.gms.internal.auth;

            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdw implements Comparator {
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
/* 1 */             zzee zzeeVar = (zzee) obj;
/* 3 */             zzee zzeeVar2 = (zzee) obj2;
/* 7 */             zzdv zzdvVar = new zzdv(zzeeVar);
/* 12 */            zzdv zzdvVar2 = new zzdv(zzeeVar2);
/* 19 */            while (zzdvVar.hasNext() && zzdvVar2.hasNext()) {
/* 47 */                int iCompareTo = Integer.valueOf(zzdvVar.zza() & 255).compareTo(Integer.valueOf(zzdvVar2.zza() & 255));
/* 51 */                if (iCompareTo != 0) {
/* 53 */                    return iCompareTo;
                        }
                    }
/* 70 */            return Integer.valueOf(zzeeVar.zzd()).compareTo(Integer.valueOf(zzeeVar2.zzd()));
                }
            }
