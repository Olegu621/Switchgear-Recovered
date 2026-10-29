            package com.google.android.gms.internal.play_billing;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdq extends zzcv {
                static final zzdq zza;
                private static final Object[] zzd;
                final transient Object[] zzb;
                final transient Object[] zzc;
                private final transient int zze;
                private final transient int zzf;
                private final transient int zzg;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             zzd = objArr;
/* 15 */            zza = new zzdq(objArr, 0, objArr, 0, 0);
                }

                public zzdq(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zze = i;
/* 8 */             this.zzc = objArr2;
/* 10 */            this.zzf = i2;
/* 12 */            this.zzg = i3;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
/* 4 */                 Object[] objArr = this.zzc;
/* 7 */                 if (objArr.length != 0) {
/* 14 */                    int iZza = zzcg.zza(obj.hashCode());
                            while (true) {
/* 20 */                        int i = iZza & this.zzf;
/* 21 */                        Object obj2 = objArr[i];
/* 23 */                        if (obj2 == null) {
/* 1 */                             return false;
                                }
/* 30 */                        if (obj2.equals(obj)) {
/* 32 */                            return true;
                                }
/* 34 */                        iZza = i + 1;
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 1 */             return this.zze;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 6 */             return zzd().listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.zzg;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zza(Object[] objArr, int i) {
/* 6 */             System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
/* 9 */             return this.zzg;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zzb() {
/* 1 */             return this.zzg;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
                /* JADX INFO: renamed from: zze */
                public final zzdw iterator() {
/* 6 */             return zzd().listIterator(0);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final boolean zzf() {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcj
                public final Object[] zzg() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv
                public final zzco zzi() {
/* 5 */             return zzco.zzj(this.zzb, this.zzg);
                }

                @Override // com.google.android.gms.internal.play_billing.zzcv
                public final boolean zzk() {
/* 1 */             return true;
                }
            }
