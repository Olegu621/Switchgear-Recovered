            package com.google.android.gms.internal.auth;

            import android.net.Uri;
            import okhttp3.HttpUrl;
            import p000.le2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzci {
                private final le2 zza;

                public zzci(le2 le2Var) {
/* 4 */             this.zza = le2Var;
                }

                public final String zza(Uri uri, String str, String str2, String str3) {
/* 2 */             if (uri == null) {
/* 1 */                 return null;
                    }
/* 14 */            le2 le2Var = (le2) this.zza.getOrDefault(uri.toString(), null);
/* 16 */            if (le2Var == null) {
/* 1 */                 return null;
                    }
/* 33 */            return (String) le2Var.getOrDefault(HttpUrl.FRAGMENT_ENCODE_SET.concat(String.valueOf(str3)), null);
                }
            }
