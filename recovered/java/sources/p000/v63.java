            package p000;

            import android.net.Uri;
            import android.webkit.WebResourceResponse;
            import java.util.ArrayList;
            import java.util.Iterator;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v63 {

                /* JADX INFO: renamed from: a */
                public final ArrayList f17875a;

                public v63(ArrayList arrayList) {
/* 4 */             this.f17875a = arrayList;
                }

                /* JADX INFO: renamed from: a */
                public final WebResourceResponse m9225a(Uri uri) {
                    WebResourceResponse webResourceResponseHandle;
/* 3 */             Iterator it = this.f17875a.iterator();
                    while (true) {
/* 11 */                t63 t63Var = null;
/* 12 */                if (!it.hasNext()) {
/* 11 */                    return null;
                        }
/* 18 */                u63 u63Var = (u63) it.next();
/* 20 */                u63Var.getClass();
/* 23 */                String str = u63Var.f17383c;
/* 35 */                if ((!uri.getScheme().equals("http") || u63Var.f17381a) && ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(u63Var.f17382b) && uri.getPath().startsWith(str))) {
/* 89 */                    t63Var = u63Var.f17384d;
                        }
/* 91 */                if (t63Var != null && (webResourceResponseHandle = t63Var.handle(uri.getPath().replaceFirst(str, HttpUrl.FRAGMENT_ENCODE_SET))) != null) {
/* 111 */                   return webResourceResponseHandle;
                        }
                    }
                }
            }
