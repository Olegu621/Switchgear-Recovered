            package p000;

            import android.graphics.Typeface;
            import android.view.View;
            import androidx.viewpager.widget.ViewPager;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class mm2 implements em2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13857a = 0;

                /* JADX INFO: renamed from: b */
                public final Object f13858b;

                public mm2(ew2 ew2Var) {
/* 4 */             ew2Var.getClass();
/* 10 */            this.f13858b = ew2Var;
                }

                /* JADX INFO: renamed from: c */
                private final void m6676c(im2 im2Var) {
                }

                @Override // p000.dm2
                /* JADX INFO: renamed from: a */
                public final void mo3155a(im2 im2Var) {
                    switch (this.f13857a) {
                        case 0:
                            break;
                        default:
/* 12 */                    View view = im2Var != null ? im2Var.f9722e : null;
/* 18 */                    UCTextView uCTextView = view instanceof UCTextView ? (UCTextView) view : null;
/* 20 */                    if (uCTextView != null) {
/* 27 */                        ((ew2) this.f13858b).getClass();
/* 32 */                        uCTextView.setTypeface(Typeface.DEFAULT);
                                break;
                            }
                            break;
                    }
                }

                @Override // p000.dm2
                /* JADX INFO: renamed from: b */
                public final void mo3156b(im2 im2Var) {
/* 1 */             int i = this.f13857a;
/* 3 */             Object obj = this.f13858b;
                    switch (i) {
                        case 0:
/* 41 */                    ((ViewPager) obj).setCurrentItem(im2Var.f9721d);
                            break;
                        default:
/* 14 */                    View view = im2Var != null ? im2Var.f9722e : null;
/* 20 */                    UCTextView uCTextView = view instanceof UCTextView ? (UCTextView) view : null;
/* 22 */                    if (uCTextView != null) {
/* 27 */                        ((ew2) obj).getClass();
/* 33 */                        uCTextView.setTypeface(Typeface.DEFAULT, 1);
                                break;
                            }
                            break;
                    }
                }

/* 12 */        public mm2(ViewPager viewPager) {
/* 14 */            this.f13858b = viewPager;
                }
            }
