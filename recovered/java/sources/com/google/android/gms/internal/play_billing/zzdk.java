            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdk extends zzco {
                static final zzco zza = new zzdk(new Object[0], 0);
                final transient Object[] zzb;
                private final transient int zzc;

                public zzdk(Object[] objArr, int i) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zzc = i;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 5 */             zzbe.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
/* 10 */            Object obj = this.zzb[i];
/* 12 */            Objects.requireNonNull(obj);
/* 15 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj
                public final int zza(Object[] objArr, int i) {
/* 6 */             System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
/* 9 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zzb() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 1 */             return false;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final Object[] zzg() {
/* 1 */             return this.zzb;
                }
            }
