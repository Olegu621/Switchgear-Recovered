            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.net.ConnectException;
            import java.net.Socket;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzky implements zzlb {
                private static final boolean zzb(int i) throws IOException {
                    try {
/* 8 */                 new Socket("localhost", i).close();
/* 11 */                return true;
                    } catch (ConnectException unused) {
/* 13 */                return false;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                /* JADX INFO: renamed from: cs */
                public final /* synthetic */ Object mo2512cs(Object[] objArr) {
/* 1 */             return zzla.zza(this, objArr);
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                public final Object zza(Object... objArr) throws zzdm {
/* 4 */             ArrayList arrayList = new ArrayList(objArr.length);
/* 8 */             for (Object obj : objArr) {
/* 16 */                if (true != (obj instanceof Integer)) {
/* 18 */                    obj = null;
                        }
/* 19 */                Integer num = (Integer) obj;
/* 21 */                if (num == null) {
/* 39 */                    C1697u2.m5433i(4, 5, null);
/* 14 */                    return null;
                        }
/* 31 */                arrayList.add(Integer.valueOf(num.intValue()));
                    }
/* 45 */            ArrayList arrayList2 = new ArrayList();
/* 48 */            Iterator it = arrayList.iterator();
/* 56 */            while (it.hasNext()) {
/* 64 */                int iIntValue = ((Number) it.next()).intValue();
/* 72 */                if (zzb(iIntValue)) {
/* 78 */                    arrayList2.add(Integer.valueOf(iIntValue));
                        }
                    }
/* 82 */            return arrayList2;
                }
            }
