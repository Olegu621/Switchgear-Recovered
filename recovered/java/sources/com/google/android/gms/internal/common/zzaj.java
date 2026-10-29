            package com.google.android.gms.internal.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaj extends zzah {
                static final zzah zza = new zzaj(new Object[0], 0);
                final transient Object[] zzb;
                private final transient int zzc;

                public zzaj(Object[] objArr, int i) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zzc = i;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 5 */             zzr.zzb(i, this.zzc, FirebaseAnalytics.Param.INDEX);
/* 10 */            Object obj = this.zzb[i];
/* 12 */            Objects.requireNonNull(obj);
/* 15 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final Object[] zzb() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final int zzd() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.common.zzac
                public final boolean zzf() {
/* 1 */             return false;
                }

                @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
                public final int zzg(Object[] objArr, int i) {
/* 1 */             Object[] objArr2 = this.zzb;
/* 3 */             int i2 = this.zzc;
/* 6 */             System.arraycopy(objArr2, 0, objArr, 0, i2);
/* 9 */             return i2;
                }
            }
