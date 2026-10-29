            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.URLConnection;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzii {
                private final p51 zza;

                public zzii() {
/* 4 */             int i = zzby.zza;
/* 12 */            this.zza = r51.m8065b(zzih.zza);
                }

                public final HttpURLConnection zza(String str) throws IOException, zzcg {
/* 13 */            if (!((zzig) this.zza.getValue()).zzb(str)) {
/* 44 */                throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
                    }
/* 20 */            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
/* 24 */            uRLConnectionOpenConnection.getClass();
/* 27 */            return (HttpURLConnection) uRLConnectionOpenConnection;
                }
            }
