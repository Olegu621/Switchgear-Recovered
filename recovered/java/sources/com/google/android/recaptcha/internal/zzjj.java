            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.C2103qd;
            import p000.C2122qw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjj implements zzjt {
                public static final zzjj zza = new zzjj();

                private zzjj() {
                }

                private static final boolean zzb(List list) {
/* 9 */             ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 12 */            Iterator it = list.iterator();
/* 20 */            while (it.hasNext()) {
/* 36 */                arrayList.add(Boolean.valueOf(((zzzt) it.next()).zzR()));
                    }
                    return !arrayList.contains(Boolean.FALSE);
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 9 */             if (!zzb(C2103qd.m7779n(zzztVarArr))) {
/* 35 */                C1697u2.m5433i(4, 5, null);
/* 38 */                return;
                    }
/* 13 */            for (zzzt zzztVar : zzztVarArr) {
/* 25 */                zzizVar.zzc().zzb(zzztVar.zzi());
                    }
                }
            }
