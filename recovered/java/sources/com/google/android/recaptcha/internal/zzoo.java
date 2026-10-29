            package com.google.android.recaptcha.internal;

            import java.util.AbstractSet;
            import java.util.Arrays;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzoo extends AbstractSet {
                final int zza = -1;
                final /* synthetic */ zzop zzb;

                public zzoo(zzop zzopVar, int i) {
/* 1 */             this.zzb = zzopVar;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return Arrays.binarySearch(this.zzb.zzb, zzb(), zza(), obj, this.zza == -1 ? zzop.zza : zzor.zza) >= 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 3 */             return new zzon(this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 9 */             return zza() - zzb();
                }

                public final int zza() {
/* 11 */            return this.zzb.zzc[this.zza + 1];
                }

                public final int zzb() {
/* 5 */             if (this.zza == -1) {
/* 4 */                 return 0;
                    }
/* 14 */            return this.zzb.zzc[0];
                }
            }
