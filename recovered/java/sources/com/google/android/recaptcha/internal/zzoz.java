            package com.google.android.recaptcha.internal;

            import java.nio.charset.Charset;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzoz implements zzpd {
                @Override // com.google.android.recaptcha.internal.zzpd
                public final zzpc zza(CharSequence charSequence, Charset charset) {
/* 1 */             zzpe zzpeVarZzb = zzb();
/* 9 */             byte[] bytes = charSequence.toString().getBytes(charset);
/* 13 */            bytes.getClass();
/* 21 */            ((zzoy) zzpeVarZzb).zza(bytes, 0, bytes.length);
/* 24 */            return zzpeVarZzb.zzb();
                }
            }
