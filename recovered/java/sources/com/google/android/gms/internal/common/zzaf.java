            package com.google.android.gms.internal.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaf extends zzah {
                private final transient zzah zza;

                public zzaf(zzah zzahVar) {
/* 4 */             this.zza = zzahVar;
                }

                private final int zzs(int i) {
/* 9 */             return (this.zza.size() - 1) - i;
                }

                @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
/* 3 */             return this.zza.contains(obj);
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 1 */             zzah zzahVar = this.zza;
/* 9 */             zzr.zzb(i, zzahVar.size(), FirebaseAnalytics.Param.INDEX);
/* 16 */            return zzahVar.get(zzs(i));
                }

                @Override // com.google.android.gms.internal.common.zzah, java.util.List
                public final int indexOf(Object obj) {
/* 3 */             int iLastIndexOf = this.zza.lastIndexOf(obj);
/* 7 */             if (iLastIndexOf >= 0) {
/* 9 */                 return zzs(iLastIndexOf);
                    }
/* 14 */            return -1;
                }

                @Override // com.google.android.gms.internal.common.zzah, java.util.List
                public final int lastIndexOf(Object obj) {
/* 3 */             int iIndexOf = this.zza.indexOf(obj);
/* 7 */             if (iIndexOf >= 0) {
/* 9 */                 return zzs(iIndexOf);
                    }
/* 14 */            return -1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.zza.size();
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final boolean zzf() {
/* 3 */             return this.zza.zzf();
                }

                @Override // com.google.android.gms.internal.common.zzah
                public final zzah zzh() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.common.zzah, java.util.List
                /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
                public final zzah subList(int i, int i2) {
/* 1 */             zzah zzahVar = this.zza;
/* 7 */             zzr.zzd(i, i2, zzahVar.size());
/* 24 */            return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).zzh();
                }
            }
