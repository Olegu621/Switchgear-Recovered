            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import java.util.Objects;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzad implements Iterator {
                final /* synthetic */ zzae zza;
                private int zzb;

                public zzad(zzae zzaeVar) {
/* 1 */             Objects.requireNonNull(zzaeVar);
/* 4 */             this.zza = zzaeVar;
/* 10 */            this.zzb = 0;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.zzb < this.zza.zzh();
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 1 */             zzae zzaeVar = this.zza;
/* 3 */             int i = this.zzb;
/* 5 */             int iZzh = zzaeVar.zzh();
/* 9 */             int i2 = this.zzb;
/* 11 */            if (i >= iZzh) {
/* 48 */                throw new NoSuchElementException(fm0.m3788n(new StringBuilder(String.valueOf(i2).length() + 21), "Out of bounds index: ", i2));
                    }
/* 15 */            this.zzb = i2 + 1;
/* 17 */            return zzaeVar.zzl(i2);
                }
            }
