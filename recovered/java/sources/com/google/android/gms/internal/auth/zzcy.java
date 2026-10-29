            package com.google.android.gms.internal.auth;

            import android.util.Base64;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcy extends zzdc {
                final /* synthetic */ zzhu zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcy(zzcz zzczVar, String str, Object obj, boolean z, zzhu zzhuVar, byte[] bArr) {
/* 7 */             super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
/* 1 */             this.zza = zzhuVar;
                }

                @Override // com.google.android.gms.internal.auth.zzdc
                public final Object zza(Object obj) {
                    try {
/* 9 */                 return zzhr.zzk(Base64.decode((String) obj, 3));
                    } catch (IOException | IllegalArgumentException unused) {
/* 22 */                StringBuilder sbM3513q = AbstractC0886en.m3513q("Invalid byte[] value for ", zzc(), ": ");
/* 28 */                sbM3513q.append((String) obj);
/* 37 */                AbstractC1245n0.m4876d("PhenotypeFlag", sbM3513q.toString());
/* 40 */                return null;
                    }
                }
            }
