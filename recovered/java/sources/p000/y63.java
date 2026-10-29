            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.net.Uri;
            import android.os.Build;
            import android.webkit.ValueCallback;
            import android.webkit.WebView;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Set;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y63 {

                /* JADX INFO: renamed from: a */
                public static final Uri f19511a = Uri.parse("*");

                /* JADX INFO: renamed from: b */
                public static final Uri f19512b = Uri.parse(HttpUrl.FRAGMENT_ENCODE_SET);

                /* JADX INFO: renamed from: a */
                public static z72 m10116a(WebView webView, String str, Set set) {
/* 7 */             if (!b73.f2294J.mo97b()) {
/* 48 */                throw b73.m1295a();
                    }
/* 9 */             fs0 fs0VarM10119d = m10119d(webView);
/* 40 */            return new z72((ScriptHandlerBoundaryInterface) j13.m5642b(ScriptHandlerBoundaryInterface.class, ((WebViewProviderBoundaryInterface) fs0VarM10119d.f8339b).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))));
                }

                /* JADX INFO: renamed from: b */
                public static PackageInfo m10117b(Context context) {
                    PackageInfo packageInfoM10118c;
/* 6 */             if (Build.VERSION.SDK_INT >= 26) {
/* 8 */                 packageInfoM10118c = AbstractC2099q9.m7736a();
                    } else {
                        try {
/* 13 */                    packageInfoM10118c = m10118c();
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 18 */                    packageInfoM10118c = null;
                        }
                    }
/* 19 */            if (packageInfoM10118c != null) {
/* 21 */                return packageInfoM10118c;
                    }
                    try {
/* 38 */                String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
/* 40 */                if (str != null) {
/* 48 */                    return context.getPackageManager().getPackageInfo(str, 0);
                        }
                    } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    }
/* 5 */             return null;
                }

                /* JADX INFO: renamed from: c */
                public static PackageInfo m10118c() {
/* 18 */            return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
                }

                /* JADX INFO: renamed from: d */
                public static fs0 m10119d(WebView webView) {
/* 5 */             WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceCreateWebView = d73.f7038a.createWebView(webView);
/* 12 */            fs0 fs0Var = new fs0(23, false);
/* 15 */            fs0Var.f8339b = webViewProviderBoundaryInterfaceCreateWebView;
/* 17 */            return fs0Var;
                }

                /* JADX INFO: renamed from: e */
                public static void m10120e(WebView webView, i63 i63Var, Uri uri) {
/* 1 */             int i = i63Var.f9475d;
/* 9 */             if (f19511a.equals(uri)) {
/* 11 */                uri = f19512b;
                    }
/* 13 */            C1823k9 c1823k9 = b73.f2323x;
/* 15 */            c1823k9.getClass();
/* 18 */            if (i == 0) {
/* 24 */                AbstractC1993o9.m7123j(webView, AbstractC1993o9.m7115b(i63Var), uri);
                    } else {
/* 32 */                if (!c1823k9.mo97b() || (i != 0 && (i != 1 || !b73.f2320u.mo97b()))) {
/* 73 */                    throw b73.m1295a();
                        }
/* 65 */                ((WebViewProviderBoundaryInterface) m10119d(webView).f8339b).postMessageToMainFrame(new C2297vk(new h63(i63Var)), uri);
                    }
                }

                /* JADX INFO: renamed from: f */
                public static void m10121f(HashSet hashSet, ValueCallback valueCallback) {
/* 1 */             C1823k9 c1823k9 = b73.f2305f;
/* 3 */             C1823k9 c1823k10 = b73.f2304e;
/* 9 */             if (c1823k9.mo97b()) {
/* 17 */                d73.f7038a.getStatics().setSafeBrowsingAllowlist(hashSet, valueCallback);
/* 20 */                return;
                    }
/* 23 */            ArrayList arrayList = new ArrayList(hashSet);
/* 30 */            if (c1823k10.mo6026a()) {
/* 32 */                AbstractC2173s9.m8438d(arrayList, valueCallback);
                    } else {
/* 40 */                if (!c1823k10.mo97b()) {
/* 56 */                    throw b73.m1295a();
                        }
/* 48 */                d73.f7038a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
                    }
                }

                /* JADX INFO: renamed from: g */
                public static void m10122g(InAppWebView inAppWebView, InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
/* 1 */             C1823k9 c1823k9 = b73.f2287C;
/* 7 */             if (c1823k9.mo6026a()) {
/* 9 */                 AbstractC2247u9.m8978e(inAppWebView, inAppWebViewRenderProcessClient);
                    } else {
/* 17 */                if (!c1823k9.mo97b()) {
/* 50 */                    throw b73.m1295a();
                        }
/* 42 */                ((WebViewProviderBoundaryInterface) m10119d(inAppWebView).f8339b).setWebViewRendererClient(inAppWebViewRenderProcessClient != null ? new C2297vk(new qc3(inAppWebViewRenderProcessClient, 2)) : null);
                    }
                }
            }
