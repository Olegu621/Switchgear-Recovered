            package p000;

            import android.content.Context;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.view.Display;
            import android.view.Gravity;
            import android.view.View;
            import android.view.WindowManager;
            import android.widget.PopupWindow;
            import androidx.appcompat.R$dimen;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zg1 {

                /* JADX INFO: renamed from: a */
                public final Context f20136a;

                /* JADX INFO: renamed from: b */
                public final jg1 f20137b;

                /* JADX INFO: renamed from: c */
                public final boolean f20138c;

                /* JADX INFO: renamed from: d */
                public final int f20139d;

                /* JADX INFO: renamed from: e */
                public View f20140e;

                /* JADX INFO: renamed from: g */
                public boolean f20142g;

                /* JADX INFO: renamed from: h */
                public dh1 f20143h;

                /* JADX INFO: renamed from: i */
                public xg1 f20144i;

                /* JADX INFO: renamed from: j */
                public PopupWindow.OnDismissListener f20145j;

                /* JADX INFO: renamed from: f */
                public int f20141f = 8388611;

                /* JADX INFO: renamed from: k */
                public final yg1 f20146k = new yg1(this);

                public zg1(Context context, jg1 jg1Var, View view, boolean z, int i, int i2) {
/* 16 */            this.f20136a = context;
/* 18 */            this.f20137b = jg1Var;
/* 20 */            this.f20140e = view;
/* 22 */            this.f20138c = z;
/* 24 */            this.f20139d = i;
                }

                /* JADX INFO: renamed from: a */
                public final xg1 m10350a() {
                    xg1 jg2Var;
/* 3 */             if (this.f20144i == null) {
/* 7 */                 Context context = this.f20136a;
/* 15 */                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
/* 21 */                Point point = new Point();
/* 24 */                defaultDisplay.getRealSize(point);
/* 45 */                if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R$dimen.abc_cascading_menus_min_smallest_width)) {
/* 55 */                    jg2Var = new ViewOnKeyListenerC2341wr(context, this.f20140e, this.f20139d, this.f20138c);
                        } else {
/* 71 */                    jg2Var = new jg2(this.f20136a, this.f20137b, this.f20140e, this.f20139d, this.f20138c);
                        }
/* 77 */                jg2Var.mo5818m(this.f20137b);
/* 82 */                jg2Var.mo5823s(this.f20146k);
/* 87 */                jg2Var.mo5819o(this.f20140e);
/* 92 */                jg2Var.mo3431h(this.f20143h);
/* 97 */                jg2Var.mo5820p(this.f20142g);
/* 102 */               jg2Var.mo5821q(this.f20141f);
/* 105 */               this.f20144i = jg2Var;
                    }
/* 107 */           return this.f20144i;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m10351b() {
/* 1 */             xg1 xg1Var = this.f20144i;
                    return xg1Var != null && xg1Var.mo365a();
                }

                /* JADX INFO: renamed from: c */
                public void mo2910c() {
/* 2 */             this.f20144i = null;
/* 4 */             PopupWindow.OnDismissListener onDismissListener = this.f20145j;
/* 6 */             if (onDismissListener != null) {
/* 8 */                 onDismissListener.onDismiss();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m10352d(int i, int i2, boolean z, boolean z2) {
/* 1 */             xg1 xg1VarM10350a = m10350a();
/* 5 */             xg1VarM10350a.mo5824t(z2);
/* 8 */             if (z) {
/* 25 */                if ((Gravity.getAbsoluteGravity(this.f20141f, this.f20140e.getLayoutDirection()) & 7) == 5) {
/* 33 */                    i -= this.f20140e.getWidth();
                        }
/* 34 */                xg1VarM10350a.mo5822r(i);
/* 37 */                xg1VarM10350a.mo5825u(i2);
/* 58 */                int i3 = (int) ((this.f20136a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
/* 70 */                xg1VarM10350a.f19082a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
                    }
/* 72 */            xg1VarM10350a.show();
                }
            }
