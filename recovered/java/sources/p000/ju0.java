            package p000;

            import com.supercell.titan.GameApp;
            import com.supercell.titan.HelpshiftTitan;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ju0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12484a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ HashMap f12485b;

                public /* synthetic */ ju0(int i, HashMap map) {
/* 1 */             this.f12484a = i;
/* 3 */             this.f12485b = map;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f12484a;
/* 5 */             HashMap map = this.f12485b;
                    switch (i) {
                        case 0:
                            try {
/* 28 */                        HelpshiftTitan.f5803j = true;
/* 34 */                        hu0.m4349z0(GameApp.getInstance(), map);
                            } catch (Exception e) {
/* 41 */                        AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.showConversation", e);
                            }
                            break;
                        default:
                            try {
/* 11 */                        HelpshiftTitan.f5803j = true;
/* 17 */                        hu0.m4307B0(GameApp.getInstance(), map);
                            } catch (Exception e2) {
/* 24 */                        AbstractC1245n0.m4877e("HelpshiftTitan", "HelpshiftTitan.showFAQ", e2);
/* 27 */                        return;
                            }
                            break;
                    }
                }
            }
