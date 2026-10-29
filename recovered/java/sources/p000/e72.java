            package p000;

            import android.os.Bundle;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.ScExternalWebView;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e72 extends w20 {

                /* JADX INFO: renamed from: a */
                public String f7564a;

                /* JADX INFO: renamed from: b */
                public boolean f7565b = false;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ScExternalWebView f7566c;

                public e72(ScExternalWebView scExternalWebView) {
/* 4 */             this.f7566c = scExternalWebView;
                }

                @Override // p000.w20
                public final void onNavigationEvent(int i, Bundle bundle) {
/* 2 */             final int i2 = 1;
/* 3 */             ScExternalWebView scExternalWebView = this.f7566c;
/* 5 */             if (i != 2 || this.f7565b) {
/* 31 */                if (i == 3) {
/* 33 */                    scExternalWebView.m2743a();
/* 45 */                    GameApp.getInstance().runOnView(new Runnable(this) { // from class: d72

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ e72 f7037b;

                                {
/* 3 */                             this.f7037b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
/* 1 */                             int i3 = i2;
/* 3 */                             String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 5 */                             e72 e72Var = this.f7037b;
                                    switch (i3) {
                                        case 0:
/* 21 */                                    ScExternalWebView scExternalWebView2 = e72Var.f7566c;
/* 23 */                                    String str2 = e72Var.f7564a;
/* 25 */                                    if (str2 != null) {
/* 27 */                                        str = str2;
                                            }
/* 28 */                                    scExternalWebView2.onPageFinished(str);
                                            break;
                                        default:
/* 10 */                                    ScExternalWebView scExternalWebView3 = e72Var.f7566c;
/* 12 */                                    String str3 = e72Var.f7564a;
/* 14 */                                    if (str3 != null) {
/* 16 */                                        str = str3;
                                            }
/* 17 */                                    scExternalWebView3.onPageFailed(str);
                                            break;
                                    }
                                }
                            });
/* 48 */                    return;
                        }
/* 48 */                return;
                    }
/* 11 */            this.f7565b = true;
/* 13 */            scExternalWebView.m2743a();
/* 22 */            final int i3 = 0;
/* 26 */            GameApp.getInstance().runOnView(new Runnable(this) { // from class: d72

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ e72 f7037b;

                        {
/* 3 */                     this.f7037b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     int i4 = i3;
/* 3 */                     String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 5 */                     e72 e72Var = this.f7037b;
                            switch (i4) {
                                case 0:
/* 21 */                            ScExternalWebView scExternalWebView2 = e72Var.f7566c;
/* 23 */                            String str2 = e72Var.f7564a;
/* 25 */                            if (str2 != null) {
/* 27 */                                str = str2;
                                    }
/* 28 */                            scExternalWebView2.onPageFinished(str);
                                    break;
                                default:
/* 10 */                            ScExternalWebView scExternalWebView3 = e72Var.f7566c;
/* 12 */                            String str3 = e72Var.f7564a;
/* 14 */                            if (str3 != null) {
/* 16 */                                str = str3;
                                    }
/* 17 */                            scExternalWebView3.onPageFailed(str);
                                    break;
                            }
                        }
                    });
                }
            }
