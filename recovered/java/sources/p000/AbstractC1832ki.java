            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.content.Context;
            import android.view.View;
            import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: ki */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1832ki {

                /* JADX INFO: renamed from: a */
                public final Context f12778a;

                /* JADX INFO: renamed from: b */
                public final ExtendedFloatingActionButton f12779b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f12780c = new ArrayList();

                /* JADX INFO: renamed from: d */
                public final d52 f12781d;

                /* JADX INFO: renamed from: e */
                public mk1 f12782e;

                /* JADX INFO: renamed from: f */
                public mk1 f12783f;

                public AbstractC1832ki(ExtendedFloatingActionButton extendedFloatingActionButton, d52 d52Var) {
/* 11 */            this.f12779b = extendedFloatingActionButton;
/* 17 */            this.f12778a = extendedFloatingActionButton.getContext();
/* 19 */            this.f12781d = d52Var;
                }

                /* JADX INFO: renamed from: a */
                public AnimatorSet mo6104a() {
/* 1 */             mk1 mk1Var = this.f12783f;
/* 3 */             if (mk1Var == null) {
/* 8 */                 if (this.f12782e == null) {
/* 20 */                    this.f12782e = mk1.m6668b(this.f12778a, mo6106c());
                        }
/* 22 */                mk1Var = this.f12782e;
/* 24 */                mk1Var.getClass();
                    }
/* 27 */            return m6105b(mk1Var);
                }

                /* JADX INFO: renamed from: b */
                public final AnimatorSet m6105b(mk1 mk1Var) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             boolean zM6673g = mk1Var.m6673g("opacity");
/* 12 */            ExtendedFloatingActionButton extendedFloatingActionButton = this.f12779b;
/* 14 */            if (zM6673g) {
/* 22 */                arrayList.add(mk1Var.m6670d("opacity", extendedFloatingActionButton, View.ALPHA));
                    }
/* 31 */            if (mk1Var.m6673g("scale")) {
/* 39 */                arrayList.add(mk1Var.m6670d("scale", extendedFloatingActionButton, View.SCALE_Y));
/* 48 */                arrayList.add(mk1Var.m6670d("scale", extendedFloatingActionButton, View.SCALE_X));
                    }
/* 57 */            if (mk1Var.m6673g("width")) {
/* 65 */                arrayList.add(mk1Var.m6670d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f4722v0));
                    }
/* 74 */            if (mk1Var.m6673g("height")) {
/* 82 */                arrayList.add(mk1Var.m6670d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f4723w0));
                    }
/* 91 */            if (mk1Var.m6673g("paddingStart")) {
/* 99 */                arrayList.add(mk1Var.m6670d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f4724x0));
                    }
/* 108 */           if (mk1Var.m6673g("paddingEnd")) {
/* 116 */               arrayList.add(mk1Var.m6670d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f4725y0));
                    }
/* 125 */           if (mk1Var.m6673g("labelOpacity")) {
/* 136 */               arrayList.add(mk1Var.m6670d("labelOpacity", extendedFloatingActionButton, new C1794ji(this)));
                    }
/* 141 */           AnimatorSet animatorSet = new AnimatorSet();
/* 144 */           w11.m9455y(animatorSet, arrayList);
/* 147 */           return animatorSet;
                }

                /* JADX INFO: renamed from: c */
                public abstract int mo6106c();

                /* JADX INFO: renamed from: d */
                public void mo6107d() {
/* 4 */             this.f12781d.f7001a = null;
                }

                /* JADX INFO: renamed from: e */
                public abstract void mo6108e();

                /* JADX INFO: renamed from: f */
                public abstract void mo6109f(Animator animator);

                /* JADX INFO: renamed from: g */
                public abstract void mo6110g();

                /* JADX INFO: renamed from: h */
                public abstract boolean mo6111h();
            }
