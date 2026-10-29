            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import p000.C1951n4;
            import p000.C2103qd;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzku {
                private List zza = nd0.f14189a;

                public final long zza(long[] jArr) {
/* 11 */            Iterator it = CollectionsKt.m6183B(this.zza, C2103qd.m7778m(jArr)).iterator();
/* 19 */            if (!it.hasNext()) {
/* 62 */                C1951n4.m6866q("Empty collection can't be reduced.");
/* 65 */                return 0L;
                    }
/* 21 */            Object next = it.next();
/* 29 */            while (it.hasNext()) {
/* 48 */                next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
                    }
/* 55 */            return ((Number) next).longValue();
                }

                public final void zzb(long[] jArr) {
/* 5 */             this.zza = C2103qd.m7778m(jArr);
                }
            }
