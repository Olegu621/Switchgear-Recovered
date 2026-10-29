            package com.google.android.gms.internal.auth;

            import io.sentry.android.core.AbstractC1245n0;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcw extends zzdc {
                public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
/* 7 */             super(zzczVar, str, bool, true, null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.auth.zzdc
                public final /* bridge */ /* synthetic */ Object zza(Object obj) {
/* 11 */            if (zzcb.zzc.matcher(obj).matches()) {
/* 13 */                return Boolean.TRUE;
                    }
/* 26 */            if (zzcb.zzd.matcher(obj).matches()) {
/* 28 */                return Boolean.FALSE;
                    }
/* 39 */            StringBuilder sbM3513q = AbstractC0886en.m3513q("Invalid boolean value for ", zzc(), ": ");
/* 45 */            sbM3513q.append((String) obj);
/* 54 */            AbstractC1245n0.m4876d("PhenotypeFlag", sbM3513q.toString());
/* 57 */            return null;
                }
            }
