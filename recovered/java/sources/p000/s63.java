            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.webkit.WebResourceResponse;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.zip.GZIPInputStream;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 73 */    public final class s63 implements t63 {

                /* JADX INFO: renamed from: c */
                public static final String[] f16454c = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16455a;

                /* JADX INFO: renamed from: b */
                public Object f16456b;

                public s63(Context context, File file) {
/* 2 */             this.f16455a = 2;
                    try {
/* 18 */                this.f16456b = new File(C2214td.m8781b(file));
/* 24 */                if (m8417a(context)) {
/* 26 */                    return;
                        }
/* 49 */                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
                    } catch (IOException e) {
/* 74 */                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
                    }
                }

                /* JADX INFO: renamed from: a */
                public boolean m8417a(Context context) throws IOException {
/* 5 */             String strM8781b = C2214td.m8781b((File) this.f16456b);
/* 13 */            String strM8781b2 = C2214td.m8781b(context.getCacheDir());
/* 21 */            String strM8781b3 = C2214td.m8781b(AbstractC2062p9.m7358e(context));
/* 30 */            if ((!strM8781b.startsWith(strM8781b2) && !strM8781b.startsWith(strM8781b3)) || strM8781b.equals(strM8781b2) || strM8781b.equals(strM8781b3)) {
/* 29 */                return false;
                    }
/* 54 */            for (int i = 0; i < 5; i++) {
/* 79 */                if (strM8781b.startsWith(strM8781b3 + f16454c[i])) {
/* 29 */                    return false;
                        }
                    }
/* 85 */            return true;
                }

                @Override // p000.t63
                public final WebResourceResponse handle(String str) {
                    switch (this.f16455a) {
                        case 0:
                            try {
/* 182 */                       C2214td c2214td = (C2214td) this.f16456b;
/* 184 */                       c2214td.getClass();
/* 208 */                       String strSubstring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
/* 216 */                       InputStream inputStreamOpen = c2214td.f17045a.getAssets().open(strSubstring, 2);
/* 224 */                       if (strSubstring.endsWith(".svgz")) {
/* 228 */                           inputStreamOpen = new GZIPInputStream(inputStreamOpen);
                                }
/* 238 */                       return new WebResourceResponse(C2214td.m8782c(str), null, inputStreamOpen);
                            } catch (IOException e) {
/* 257 */                       AbstractC1245n0.m4877e("WebViewAssetLoader", "Error opening asset path: " + str, e);
/* 262 */                       return new WebResourceResponse(null, null, null);
                            }
                        case 1:
                            try {
/* 131 */                       return new WebResourceResponse(C2214td.m8782c(str), null, ((C2214td) this.f16456b).m8783d(str));
                            } catch (Resources.NotFoundException e2) {
/* 171 */                       AbstractC1245n0.m4877e("WebViewAssetLoader", "Resource not found from the path: " + str, e2);
/* 176 */                       return new WebResourceResponse(null, null, null);
                            } catch (IOException e3) {
/* 153 */                       AbstractC1245n0.m4877e("WebViewAssetLoader", "Error opening resource from the path: " + str, e3);
/* 176 */                       return new WebResourceResponse(null, null, null);
                            }
                        default:
/* 13 */                    File file = (File) this.f16456b;
                            try {
/* 15 */                        String strM8781b = C2214td.m8781b(file);
/* 24 */                        String canonicalPath = new File(file, str).getCanonicalPath();
/* 40 */                        File file2 = canonicalPath.startsWith(strM8781b) ? new File(canonicalPath) : null;
/* 41 */                        if (file2 == null) {
/* 90 */                            AbstractC1245n0.m4876d("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, file));
/* 113 */                           return new WebResourceResponse(null, null, null);
                                }
/* 48 */                        InputStream inputStreamM5164b = AbstractC1417a.m5164b(file2, new FileInputStream(file2));
/* 60 */                        if (file2.getPath().endsWith(".svgz")) {
/* 64 */                            inputStreamM5164b = new GZIPInputStream(inputStreamM5164b);
                                }
/* 74 */                        return new WebResourceResponse(C2214td.m8782c(str), null, inputStreamM5164b);
                            } catch (IOException e4) {
/* 108 */                       AbstractC1245n0.m4877e("WebViewAssetLoader", "Error opening the requested path: " + str, e4);
                            }
                            break;
                    }
                }
            }
