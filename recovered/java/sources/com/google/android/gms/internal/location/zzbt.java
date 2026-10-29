            package com.google.android.gms.internal.location;

            import com.google.firebase.analytics.FirebaseAnalytics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbt<E> extends zzbs<E> {
                static final zzbs<Object> zza = new zzbt(new Object[0], 0);
                final transient Object[] zzb;
                private final transient int zzc;

                public zzbt(Object[] objArr, int i) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zzc = i;
                }

                @Override // java.util.List
                public final E get(int i) {
/* 5 */             zzbm.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
/* 10 */            return (E) this.zzb[i];
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.location.zzbp
                public final Object[] zzb() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.location.zzbp
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.location.zzbp
                public final int zzd() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.gms.internal.location.zzbp
                public final boolean zzf() {
/* 1 */             return false;
                }

                @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
                public final int zzg(Object[] objArr, int i) {
/* 6 */             System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
/* 9 */             return this.zzc;
                }
            }
