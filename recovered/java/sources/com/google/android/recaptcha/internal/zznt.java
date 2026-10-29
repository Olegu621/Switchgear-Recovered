            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zznt implements zznu {
                private final String zza = HttpUrl.FRAGMENT_ENCODE_SET;
                private final int zzb = 2;

                @Override // com.google.android.recaptcha.internal.zznu
                public final zznb zza(String str) {
/* 10 */            return new zzoc(this.zza, str, true, 2, true, true);
                }
            }
