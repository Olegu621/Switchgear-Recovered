            package com.google.android.gms.internal.fido;

            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzay extends zzaz {
                final transient int zza;
                final transient int zzb;
                final /* synthetic */ zzaz zzc;

                public zzay(zzaz zzazVar, int i, int i2) {
/* 1 */             this.zzc = zzazVar;
/* 6 */             this.zza = i;
/* 8 */             this.zzb = i2;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 5 */             zzas.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
/* 13 */            return this.zzc.get(i + this.zza);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final int zzb() {
/* 12 */            return this.zzc.zzc() + this.zza + this.zzb;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final int zzc() {
/* 9 */             return this.zzc.zzc() + this.zza;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final Object[] zze() {
/* 3 */             return this.zzc.zze();
                }

                @Override // com.google.android.gms.internal.fido.zzaz, java.util.List
                /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
                public final zzaz subList(int i, int i2) {
/* 3 */             zzas.zze(i, i2, this.zzb);
/* 6 */             zzaz zzazVar = this.zzc;
/* 8 */             int i3 = this.zza;
/* 12 */            return zzazVar.subList(i + i3, i2 + i3);
                }
            }
