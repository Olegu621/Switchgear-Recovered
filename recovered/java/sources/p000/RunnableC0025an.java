            package p000;

            import android.webkit.WebView;
            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: renamed from: an */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC0025an implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f337a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f338b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f339c;

                public /* synthetic */ RunnableC0025an(int i, Object obj, boolean z) {
/* 1 */             this.f337a = i;
/* 3 */             this.f339c = obj;
/* 5 */             this.f338b = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f337a) {
                        case 0:
/* 55 */                    C0222cn c0222cn = (C0222cn) this.f339c;
/* 57 */                    boolean z = this.f338b;
/* 61 */                    if (c0222cn.f3004a != z) {
/* 64 */                        c0222cn.f3004a = z;
/* 66 */                        if (!z) {
/* 96 */                            C1898lp c1898lp = new C1898lp("The camera control has became inactive.", 0);
/* 99 */                            C2260um c2260um = c0222cn.f3010g;
/* 101 */                           if (c2260um != null) {
/* 103 */                               c2260um.m9041b(c1898lp);
/* 106 */                               c0222cn.f3010g = null;
                                    }
                                } else if (c0222cn.f3005b) {
/* 86 */                            c0222cn.f3006c.m5860o().mo3676a(new RunnableC2166s2(c0222cn, 1), c0222cn.f3007d);
/* 89 */                            c0222cn.f3005b = false;
                                }
                                break;
                            }
                            break;
                        case 1:
/* 36 */                    C2467xn c2467xn = (C2467xn) this.f339c;
/* 38 */                    boolean z2 = this.f338b;
/* 40 */                    c2467xn.f19279n0 = z2;
/* 42 */                    if (z2 && c2467xn.f19284s0 == 4) {
/* 49 */                        c2467xn.m9988H(false);
                                break;
                            }
                            break;
                        default:
/* 10 */                    TitanWebView titanWebView = (TitanWebView) this.f339c;
/* 12 */                    boolean z3 = this.f338b;
/* 14 */                    WebView webView = titanWebView.f5959o;
/* 16 */                    if (webView != null) {
/* 19 */                        if (!z3) {
/* 30 */                            webView.setOnTouchListener(null);
                                } else {
/* 26 */                            webView.setOnTouchListener(new jp2());
                                }
                                break;
                            }
                            break;
                    }
                }
            }
