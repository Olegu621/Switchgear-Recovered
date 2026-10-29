            package com.google.android.gms.internal.auth;

            import android.net.Uri;
            import p000.C1024id;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcr {
                private static final C1024id zza = new C1024id();

                public static synchronized Uri zza(String str) {
/* 6 */             C1024id c1024id = zza;
/* 13 */            Uri uri = (Uri) c1024id.getOrDefault("com.google.android.gms.auth_account", null);
/* 15 */            if (uri != null) {
/* 43 */                return uri;
                    }
/* 31 */            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
/* 35 */            c1024id.put("com.google.android.gms.auth_account", uri2);
/* 39 */            return uri2;
                }
            }
