            package p000;

            import com.supercell.titan.TitanWebView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class pp2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15231a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TitanWebView.TitanWebViewClient f15232b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f15233c;

                public /* synthetic */ pp2(TitanWebView.TitanWebViewClient titanWebViewClient, String str, int i) {
/* 1 */             this.f15231a = i;
/* 3 */             this.f15232b = titanWebViewClient;
/* 5 */             this.f15233c = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f15231a;
/* 3 */             String str = this.f15233c;
/* 5 */             TitanWebView.TitanWebViewClient titanWebViewClient = this.f15232b;
                    switch (i) {
                        case 0:
/* 18 */                    titanWebViewClient.f5973a.onPageFinished(str);
                            break;
                        default:
/* 12 */                    titanWebViewClient.f5973a.onPageStarted(str);
                            break;
                    }
                }
            }
