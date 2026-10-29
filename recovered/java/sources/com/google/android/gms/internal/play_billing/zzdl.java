            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.AbstractMap;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdl extends zzco {
                final /* synthetic */ zzdm zza;

                public zzdl(zzdm zzdmVar) {
/* 1 */             this.zza = zzdmVar;
                }

                @Override // java.util.List
                public final /* bridge */ /* synthetic */ Object get(int i) {
/* 9 */             zzbe.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
/* 18 */            int i2 = i + i;
/* 19 */            Object obj = this.zza.zzb[i2];
/* 21 */            Objects.requireNonNull(obj);
/* 32 */            Object obj2 = this.zza.zzb[i2 + 1];
/* 34 */            Objects.requireNonNull(obj2);
/* 39 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zza.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 1 */             return true;
                }
            }
