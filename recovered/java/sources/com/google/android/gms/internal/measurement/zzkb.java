            package com.google.android.gms.internal.measurement;

            import io.sentry.android.core.AbstractC1245n0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkb extends zzkl {
                public zzkb(zzkf zzkfVar, String str, Long l, boolean z) {
/* 7 */             super(zzkfVar, str, l, true, null);
                }

                @Override // com.google.android.gms.internal.measurement.zzkl
                public final /* synthetic */ Object zza(Object obj) {
/* 3 */             if (obj instanceof Long) {
/* 5 */                 return (Long) obj;
                    }
/* 10 */            if (obj instanceof String) {
                        try {
/* 19 */                    return Long.valueOf(Long.parseLong((String) obj));
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 24 */            String str = this.zzb;
/* 26 */            String string = obj.toString();
/* 56 */            AbstractC1245n0.m4876d("PhenotypeFlag", fm0.m3791q(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
/* 59 */            return null;
                }
            }
