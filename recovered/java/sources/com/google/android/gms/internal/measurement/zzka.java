            package com.google.android.gms.internal.measurement;

            import android.net.Uri;
            import p000.C1024id;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzka {
                public static final /* synthetic */ int zza = 0;
                private static final C1024id zzb = new C1024id();

                public static synchronized Uri zza(String str) {
/* 4 */             C1024id c1024id = zzb;
/* 13 */            Uri uri = (Uri) c1024id.getOrDefault("com.google.android.gms.measurement", null);
/* 15 */            if (uri != null) {
/* 43 */                return uri;
                    }
/* 31 */            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
/* 35 */            c1024id.put("com.google.android.gms.measurement", uri2);
/* 39 */            return uri2;
                }
            }
