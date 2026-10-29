            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.PopupWindow;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: la */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1883la extends jb1 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f13159f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Object f13160g;

                public /* synthetic */ C1883la(Object obj, int i) {
/* 1 */             this.f13159f = i;
/* 3 */             this.f13160g = obj;
                }

                @Override // p000.jb1, p000.r43
                /* JADX INFO: renamed from: b */
                public void mo1185b() {
/* 1 */             int i = this.f13159f;
/* 4 */             Object obj = this.f13160g;
                    switch (i) {
                        case 0:
/* 47 */                    ((RunnableC1786ja) obj).f12160b.f18521g0.setVisibility(0);
                            break;
                        case 1:
/* 10 */                    LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = (LayoutInflaterFactory2C2324wa) obj;
/* 14 */                    layoutInflaterFactory2C2324wa.f18521g0.setVisibility(0);
/* 25 */                    if (layoutInflaterFactory2C2324wa.f18521g0.getParent() instanceof View) {
/* 33 */                        View view = (View) layoutInflaterFactory2C2324wa.f18521g0.getParent();
/* 35 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 37 */                        q23.m7679c(view);
                            }
                            break;
                    }
                }

                @Override // p000.r43
                /* JADX INFO: renamed from: c */
                public final void mo1186c() {
/* 1 */             int i = this.f13159f;
/* 5 */             Object obj = this.f13160g;
                    switch (i) {
                        case 0:
/* 92 */                    LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa = ((RunnableC1786ja) obj).f12160b;
/* 96 */                    layoutInflaterFactory2C2324wa.f18521g0.setAlpha(1.0f);
/* 101 */                   layoutInflaterFactory2C2324wa.f18524j0.m7338d(null);
/* 104 */                   layoutInflaterFactory2C2324wa.f18524j0 = null;
                            break;
                        case 1:
/* 75 */                    LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa2 = (LayoutInflaterFactory2C2324wa) obj;
/* 79 */                    layoutInflaterFactory2C2324wa2.f18521g0.setAlpha(1.0f);
/* 84 */                    layoutInflaterFactory2C2324wa2.f18524j0.m7338d(null);
/* 87 */                    layoutInflaterFactory2C2324wa2.f18524j0 = null;
                            break;
                        default:
/* 15 */                    LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa3 = (LayoutInflaterFactory2C2324wa) ((C0210cb) obj).f2805c;
/* 21 */                    layoutInflaterFactory2C2324wa3.f18521g0.setVisibility(8);
/* 24 */                    PopupWindow popupWindow = layoutInflaterFactory2C2324wa3.f18522h0;
/* 26 */                    if (popupWindow != null) {
/* 28 */                        popupWindow.dismiss();
                            } else if (layoutInflaterFactory2C2324wa3.f18521g0.getParent() instanceof View) {
/* 48 */                        View view = (View) layoutInflaterFactory2C2324wa3.f18521g0.getParent();
/* 50 */                        WeakHashMap weakHashMap = e33.f7494a;
/* 52 */                        q23.m7679c(view);
                            }
/* 57 */                    layoutInflaterFactory2C2324wa3.f18521g0.m338e();
/* 62 */                    layoutInflaterFactory2C2324wa3.f18524j0.m7338d(null);
/* 65 */                    layoutInflaterFactory2C2324wa3.f18524j0 = null;
/* 67 */                    ViewGroup viewGroup = layoutInflaterFactory2C2324wa3.f18526l0;
/* 69 */                    WeakHashMap weakHashMap2 = e33.f7494a;
/* 71 */                    q23.m7679c(viewGroup);
                            break;
                    }
                }
            }
