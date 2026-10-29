            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcm extends zzco {
                private final transient zzco zza;

                public zzcm(zzco zzcoVar) {
/* 4 */             this.zza = zzcoVar;
                }

                private final int zzp(int i) {
/* 9 */             return (this.zza.size() - 1) - i;
                }

                @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
/* 3 */             return this.zza.contains(obj);
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 9 */             zzbe.zza(i, this.zza.size(), FirebaseAnalytics.Param.INDEX);
/* 18 */            return this.zza.get(zzp(i));
                }

                @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
                public final int indexOf(Object obj) {
/* 3 */             int iLastIndexOf = this.zza.lastIndexOf(obj);
/* 7 */             if (iLastIndexOf >= 0) {
/* 9 */                 return zzp(iLastIndexOf);
                    }
/* 14 */            return -1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
                public final int lastIndexOf(Object obj) {
/* 3 */             int iIndexOf = this.zza.indexOf(obj);
/* 7 */             if (iIndexOf >= 0) {
/* 9 */                 return zzp(iIndexOf);
                    }
/* 14 */            return -1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.zza.size();
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 3 */             return this.zza.zzf();
                }

                @Override // com.google.android.gms.internal.play_billing.zzco
                public final zzco zzh() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
                /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
                public final zzco subList(int i, int i2) {
/* 7 */             zzbe.zze(i, i2, this.zza.size());
/* 10 */            zzco zzcoVar = this.zza;
/* 28 */            return zzcoVar.subList(zzcoVar.size() - i2, this.zza.size() - i).zzh();
                }
            }
