            package com.google.android.gms.internal.fido;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbd extends zzba {
                static final zzbd zza;
                private static final Object[] zzd;
                final transient Object[] zzb;
                final transient Object[] zzc;
                private final transient int zze;
                private final transient int zzf;
                private final transient int zzg;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             zzd = objArr;
/* 15 */            zza = new zzbd(objArr, 0, objArr, 0, 0);
                }

                public zzbd(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zze = i;
/* 8 */             this.zzc = objArr2;
/* 10 */            this.zzf = i2;
/* 12 */            this.zzg = i3;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 1 */             Object[] objArr = this.zzc;
/* 4 */             if (obj == null || objArr.length == 0) {
/* 3 */                 return false;
                    }
/* 14 */            int iZza = zzav.zza(obj.hashCode());
                    while (true) {
/* 20 */                int i = iZza & this.zzf;
/* 21 */                Object obj2 = objArr[i];
/* 23 */                if (obj2 == null) {
/* 3 */                     return false;
                        }
/* 30 */                if (obj2.equals(obj)) {
/* 32 */                    return true;
                        }
/* 34 */                iZza = i + 1;
                    }
                }

                @Override // com.google.android.gms.internal.fido.zzba, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 1 */             return this.zze;
                }

                @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 6 */             return zzg().listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.zzg;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final int zza(Object[] objArr, int i) {
/* 6 */             System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
/* 9 */             return this.zzg;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final int zzb() {
/* 1 */             return this.zzg;
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw
                /* JADX INFO: renamed from: zzd */
                public final zzbf iterator() {
/* 6 */             return zzg().listIterator(0);
                }

                @Override // com.google.android.gms.internal.fido.zzaw
                public final Object[] zze() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.gms.internal.fido.zzba
                public final zzaz zzh() {
/* 5 */             return zzaz.zzh(this.zzb, this.zzg);
                }

                @Override // com.google.android.gms.internal.fido.zzba
                public final boolean zzj() {
/* 1 */             return true;
                }
            }
