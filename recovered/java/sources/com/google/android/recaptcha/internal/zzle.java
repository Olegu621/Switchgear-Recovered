            package com.google.android.recaptcha.internal;

            import android.net.Uri;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import java.io.ByteArrayInputStream;
            import java.util.concurrent.TimeUnit;
            import p000.C1869kx;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzle extends WebViewClient {
                final /* synthetic */ zzly zza;

                public zzle(zzly zzlyVar) {
/* 1 */             this.zza = zzlyVar;
                }

                @Override // android.webkit.WebViewClient
                public final void onLoadResource(WebView webView, String str) {
/* 1 */             System.currentTimeMillis();
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
/* 9 */             long jZza = this.zza.zzg.zza(TimeUnit.MICROSECONDS);
/* 13 */            int i = zzco.zza;
/* 21 */            zzco.zza(zzcp.zzb.zza(), jZza);
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
/* 1 */             super.onReceivedError(webView, i, str, str2);
/* 4 */             zzly zzlyVar = this.zza;
/* 8 */             zzce zzceVar = zzce.zzc;
/* 22 */            zzcd zzcdVar = (zzcd) zzlyVar.zzc.get(Integer.valueOf(i));
/* 24 */            if (zzcdVar == null) {
/* 26 */                zzcdVar = zzcd.zzM;
                    }
/* 34 */            zzcg zzcgVar = new zzcg(zzceVar, zzcdVar, null, null, 12, null);
/* 41 */            zzlyVar.zzz().hashCode();
/* 44 */            zzcgVar.getMessage();
/* 53 */            ((C1869kx) zzlyVar.zzz()).m6289U(zzcgVar);
                }

                @Override // android.webkit.WebViewClient
                public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
/* 1 */             zzly zzlyVar = this.zza;
/* 3 */             Uri uri = Uri.parse(str);
/* 7 */             zzly.zzq(zzlyVar);
/* 10 */            uri.getClass();
/* 17 */            if (!zzig.zzc(uri) || zzly.zzq(zzlyVar).zza(uri)) {
/* 80 */                return super.shouldInterceptRequest(webView, str);
                    }
/* 40 */            zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzQ, null, null, 12, null);
/* 47 */            zzlyVar.zzz().hashCode();
/* 50 */            uri.toString();
/* 59 */            ((C1869kx) zzlyVar.zzz()).m6289U(zzcgVar);
/* 76 */            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
            }
