            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzmp extends zzmk {
                final /* synthetic */ Iterable zza;
                final /* synthetic */ int zzb;

                public zzmp(Iterable iterable, int i) {
/* 1 */             this.zza = iterable;
/* 3 */             this.zzb = i;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             Iterable iterable = this.zza;
/* 5 */             if (iterable instanceof List) {
/* 7 */                 List list = (List) iterable;
/* 27 */                return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
                    }
/* 32 */            int i = this.zzb;
/* 34 */            Iterator it = iterable.iterator();
/* 38 */            it.getClass();
/* 49 */            zzmd.zzb(i >= 0, "numberToAdvance must be nonnegative");
/* 52 */            for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
/* 60 */                it.next();
                    }
/* 68 */            return new zzmo(this, it);
                }
            }
