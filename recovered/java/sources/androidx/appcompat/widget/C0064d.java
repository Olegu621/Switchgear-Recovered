            package androidx.appcompat.widget;

            import android.content.Context;
            import android.os.Build;
            import android.view.MenuItem;
            import android.widget.PopupWindow;
            import java.lang.reflect.Method;
            import p000.ch1;
            import p000.jg1;
            import p000.qc3;
            import p000.ra0;
            import p000.rg1;
            import p000.sg1;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0064d extends ListPopupWindow implements rg1 {

                /* JADX INFO: renamed from: n0 */
                public static final Method f754n0;

                /* JADX INFO: renamed from: m0 */
                public qc3 f755m0;

                static {
                    try {
/* 5 */                 if (Build.VERSION.SDK_INT <= 28) {
/* 23 */                    f754n0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }

                @Override // p000.rg1
                /* JADX INFO: renamed from: c */
                public final void mo429c(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             qc3 qc3Var = this.f755m0;
/* 3 */             if (qc3Var != null) {
/* 5 */                 qc3Var.mo429c(jg1Var, menuItem);
                    }
                }

                @Override // p000.rg1
                /* JADX INFO: renamed from: i */
                public final void mo430i(jg1 jg1Var, sg1 sg1Var) {
/* 1 */             qc3 qc3Var = this.f755m0;
/* 3 */             if (qc3Var != null) {
/* 5 */                 qc3Var.mo430i(jg1Var, sg1Var);
                    }
                }

                @Override // androidx.appcompat.widget.ListPopupWindow
                /* JADX INFO: renamed from: p */
                public final ra0 mo374p(Context context, boolean z) {
/* 3 */             ch1 ch1Var = new ch1(context, z);
/* 6 */             ch1Var.setHoverListener(this);
/* 9 */             return ch1Var;
                }
            }
