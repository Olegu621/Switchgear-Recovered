            package com.google.android.gms.internal.measurement;

            import java.util.Arrays;
            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaz implements Comparator {
                final /* synthetic */ zzai zza;
                final /* synthetic */ zzg zzb;

                public zzaz(zzai zzaiVar, zzg zzgVar) {
/* 1 */             this.zza = zzaiVar;
/* 3 */             this.zzb = zzgVar;
                }

                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
/* 1 */             zzao zzaoVar = (zzao) obj;
/* 5 */             zzao zzaoVar2 = (zzao) obj2;
/* 9 */             if (zzaoVar instanceof zzat) {
                        return !(zzaoVar2 instanceof zzat) ? 1 : 0;
                    }
/* 19 */            if (zzaoVar2 instanceof zzat) {
/* 21 */                return -1;
                    }
/* 23 */            zzai zzaiVar = this.zza;
                    return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.zzi(zzaiVar.zza(this.zzb, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
                }
            }
