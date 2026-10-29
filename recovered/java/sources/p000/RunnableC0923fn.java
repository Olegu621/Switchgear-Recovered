            package p000;

            import android.view.ViewGroup;
            import android.webkit.WebView;
            import androidx.recyclerview.widget.RecyclerView;
            import com.supercell.titan.TitanWebView;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: renamed from: fn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0923fn implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8286a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f8287b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f8288c;

                public /* synthetic */ RunnableC0923fn(Object obj, int i, int i2) {
/* 1 */             this.f8286a = i2;
/* 3 */             this.f8288c = obj;
/* 5 */             this.f8287b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f8286a) {
                        case 0:
/* 177 */                   ((AbstractC1934mo) this.f8288c).mo3974a(this.f8287b);
/* 180 */                   return;
                        case 1:
/* 99 */                    LinkedHashSet<gk2> linkedHashSet = (LinkedHashSet) this.f8288c;
/* 101 */                   int i = this.f8287b;
/* 111 */                   for (gk2 gk2Var : linkedHashSet) {
/* 120 */                       if (i == 5) {
                                    synchronized (gk2Var.f8679p) {
                                        try {
/* 129 */                                   if (gk2Var.m3959m() && gk2Var.f8680q != null) {
/* 135 */                                       gk2.m3955l();
/* 140 */                                       Iterator it = gk2Var.f8680q.iterator();
/* 148 */                                       while (it.hasNext()) {
/* 156 */                                           ((d70) it.next()).mo2951a();
                                                }
                                            }
                                        } catch (Throwable th) {
/* 165 */                                   throw th;
                                        }
                                    }
                                } else {
/* 166 */                           gk2Var.getClass();
                                }
                            }
/* 170 */                   return;
                        case 2:
/* 93 */                    ((de3) this.f8288c).mo1400A(this.f8287b);
/* 96 */                    return;
                        case 3:
/* 70 */                    TitanWebView titanWebView = (TitanWebView) this.f8288c;
/* 72 */                    int i2 = this.f8287b;
/* 74 */                    WebView webView = titanWebView.f5959o;
/* 76 */                    if (webView == null) {
/* 86 */                        return;
                            }
/* 83 */                    webView.getSettings().setTextZoom(i2);
/* 86 */                    return;
                        case 4:
/* 18 */                    TitanWebView.TitanWebViewClient titanWebViewClient = (TitanWebView.TitanWebViewClient) this.f8288c;
/* 20 */                    int i3 = this.f8287b;
/* 22 */                    TitanWebView titanWebView2 = TitanWebView.this;
/* 24 */                    String str = titanWebView2.f5955k;
/* 30 */                    titanWebView2.f5953i.removeView(titanWebView2.f5959o);
/* 35 */                    titanWebView2.f5959o.destroy();
/* 39 */                    titanWebView2.f5959o = null;
/* 41 */                    titanWebView2.m2748b();
/* 44 */                    ViewGroup.MarginLayoutParams marginLayoutParams = titanWebView2.f5956l;
/* 46 */                    if (marginLayoutParams != null) {
/* 50 */                        titanWebView2.f5953i.setLayoutParams(marginLayoutParams);
                            }
/* 53 */                    String str2 = titanWebView2.f5955k;
/* 55 */                    if (str2 != null) {
/* 59 */                        titanWebView2.f5959o.loadUrl(str2);
                            }
/* 64 */                    titanWebView2.f5959o.setVisibility(i3);
/* 67 */                    return;
                        default:
/* 12 */                    ((RecyclerView) this.f8288c).m875c0(this.f8287b);
/* 15 */                    return;
                    }
                }
            }
