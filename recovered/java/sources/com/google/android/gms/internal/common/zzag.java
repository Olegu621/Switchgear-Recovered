            package com.google.android.gms.internal.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzag extends zzah {
                final transient int zza;
                final transient int zzb;
                final /* synthetic */ zzah zzc;

                public zzag(zzah zzahVar, int i, int i2) {
/* 1 */             Objects.requireNonNull(zzahVar);
/* 4 */             this.zzc = zzahVar;
/* 9 */             this.zza = i;
/* 11 */            this.zzb = i2;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 5 */             zzr.zzb(i, this.zzb, FirebaseAnalytics.Param.INDEX);
/* 13 */            return this.zzc.get(i + this.zza);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final Object[] zzb() {
/* 3 */             return this.zzc.zzb();
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final int zzc() {
/* 9 */             return this.zzc.zzc() + this.zza;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final int zzd() {
/* 12 */            return this.zzc.zzc() + this.zza + this.zzb;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final boolean zzf() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.internal.common.zzah, java.util.List
                /* JADX INFO: renamed from: zzi */
                public final zzah subList(int i, int i2) {
/* 3 */             zzr.zzd(i, i2, this.zzb);
/* 6 */             int i3 = this.zza;
/* 12 */            return this.zzc.subList(i + i3, i2 + i3);
                }
            }
