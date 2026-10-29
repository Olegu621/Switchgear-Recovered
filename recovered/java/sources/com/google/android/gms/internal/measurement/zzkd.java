            package com.google.android.gms.internal.measurement;

            import io.sentry.android.core.AbstractC1245n0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkd extends zzkl {
                public zzkd(zzkf zzkfVar, String str, Double d, boolean z) {
/* 8 */             super(zzkfVar, "measurement.test.double_flag", d, true, null);
                }

                @Override // com.google.android.gms.internal.measurement.zzkl
                public final /* synthetic */ Object zza(Object obj) {
/* 3 */             if (obj instanceof Double) {
/* 5 */                 return (Double) obj;
                    }
/* 10 */            if (obj instanceof Float) {
/* 18 */                return Double.valueOf(((Float) obj).doubleValue());
                    }
/* 25 */            if (obj instanceof String) {
                        try {
/* 34 */                    return Double.valueOf(Double.parseDouble((String) obj));
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 39 */            String str = this.zzb;
/* 41 */            String string = obj.toString();
/* 71 */            AbstractC1245n0.m4876d("PhenotypeFlag", fm0.m3791q(new StringBuilder(str.length() + 27 + string.length()), "Invalid double value for ", str, ": ", string));
/* 74 */            return null;
                }
            }
