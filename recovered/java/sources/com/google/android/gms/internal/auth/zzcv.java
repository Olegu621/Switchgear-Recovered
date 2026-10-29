            package com.google.android.gms.internal.auth;

            import io.sentry.android.core.AbstractC1245n0;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcv extends zzdc {
                public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
/* 7 */             super(zzczVar, str, l, true, null);
                }

                @Override // com.google.android.gms.internal.auth.zzdc
                public final /* bridge */ /* synthetic */ Object zza(Object obj) {
                    try {
/* 8 */                 return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
/* 21 */                StringBuilder sbM3513q = AbstractC0886en.m3513q("Invalid long value for ", zzc(), ": ");
/* 27 */                sbM3513q.append((String) obj);
/* 36 */                AbstractC1245n0.m4876d("PhenotypeFlag", sbM3513q.toString());
/* 39 */                return null;
                    }
                }
            }
