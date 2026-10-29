            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            import java.util.Objects;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzac implements Iterator {
                final /* synthetic */ Iterator zza;
                final /* synthetic */ Iterator zzb;

                public zzac(zzae zzaeVar, Iterator it, Iterator it2) {
/* 1 */             this.zza = it;
/* 3 */             this.zzb = it2;
/* 5 */             Objects.requireNonNull(zzaeVar);
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 7 */             if (this.zza.hasNext()) {
/* 9 */                 return true;
                    }
/* 13 */            return this.zzb.hasNext();
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 1 */             Iterator it = this.zza;
/* 7 */             if (it.hasNext()) {
/* 21 */                return new zzas(((Integer) it.next()).toString());
                    }
/* 25 */            Iterator it2 = this.zzb;
/* 31 */            if (it2.hasNext()) {
/* 41 */                return new zzas((String) it2.next());
                    }
/* 45 */            C1951n4.m6864o();
/* 48 */            return null;
                }
            }
