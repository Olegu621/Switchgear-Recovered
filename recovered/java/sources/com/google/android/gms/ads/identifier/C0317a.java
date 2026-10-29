            package com.google.android.gms.ads.identifier;

            import android.net.Uri;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: com.google.android.gms.ads.identifier.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0317a extends Thread {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ HashMap f3222a;

                public C0317a(HashMap map) {
/* 1 */             this.f3222a = map;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
/* 7 */             Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
/* 11 */            HashMap map = this.f3222a;
/* 25 */            for (String str : map.keySet()) {
/* 39 */                builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                    }
/* 51 */            zzc.zza(builderBuildUpon.build().toString());
                }
            }
