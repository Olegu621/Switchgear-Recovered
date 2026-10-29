            package com.google.android.gms.internal.play_billing;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdo extends zzco {
                private final transient Object[] zza;
                private final transient int zzb;
                private final transient int zzc;

                public zzdo(Object[] objArr, int i, int i2) {
/* 4 */             this.zza = objArr;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = i2;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 5 */             zzbe.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
/* 14 */            Object obj = this.zza[i + i + this.zzb];
/* 16 */            Objects.requireNonNull(obj);
/* 19 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 1 */             return true;
                }
            }
