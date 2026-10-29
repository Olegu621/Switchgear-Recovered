            package com.google.android.gms.internal.measurement;

            import io.sentry.android.core.AbstractC1245n0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkc extends zzkl {
                public zzkc(zzkf zzkfVar, String str, Boolean bool, boolean z) {
/* 7 */             super(zzkfVar, str, bool, true, null);
                }

                @Override // com.google.android.gms.internal.measurement.zzkl
                public final /* synthetic */ Object zza(Object obj) {
/* 3 */             if (obj instanceof Boolean) {
/* 5 */                 return (Boolean) obj;
                    }
/* 10 */            if (obj instanceof String) {
/* 13 */                String str = (String) obj;
/* 25 */                if (zzjg.zzc.matcher(str).matches()) {
/* 27 */                    return Boolean.TRUE;
                        }
/* 40 */                if (zzjg.zzd.matcher(str).matches()) {
/* 42 */                    return Boolean.FALSE;
                        }
                    }
/* 45 */            String str2 = this.zzb;
/* 47 */            String string = obj.toString();
/* 77 */            AbstractC1245n0.m4876d("PhenotypeFlag", fm0.m3791q(new StringBuilder(str2.length() + 28 + string.length()), "Invalid boolean value for ", str2, ": ", string));
/* 80 */            return null;
                }
            }
