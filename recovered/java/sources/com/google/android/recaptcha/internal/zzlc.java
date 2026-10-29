            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import io.sentry.C1697u2;
            import java.util.Map;
            import kotlin.Pair;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzlc implements zzlb {
                private final Context zza;
                private final Map zzb = oc1.m7131e(new Pair(2, "activity"), new Pair(3, "phone"), new Pair(4, "input_method"), new Pair(5, "audio"));

                public zzlc(Context context) {
/* 4 */             this.zza = context;
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                /* JADX INFO: renamed from: cs */
                public final /* synthetic */ Object mo2512cs(Object[] objArr) {
/* 1 */             return zzla.zza(this, objArr);
                }

                @Override // com.google.android.recaptcha.internal.zzlb
                public final Object zza(Object... objArr) throws zzdm {
/* 2 */             Object obj = objArr[0];
/* 8 */             if (true != (obj instanceof Integer)) {
/* 10 */                obj = null;
                    }
/* 11 */            Integer num = (Integer) obj;
/* 14 */            if (num == null) {
/* 48 */                C1697u2.m5433i(4, 5, null);
/* 7 */                 return null;
                    }
/* 26 */            Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
/* 30 */            if (obj2 != null) {
/* 36 */                return this.zza.getSystemService((String) obj2);
                    }
/* 46 */            throw new zzdm(4, 4, null);
                }
            }
