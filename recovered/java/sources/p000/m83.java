            package p000;

            import android.os.Build;
            import android.view.View;
            import android.view.WindowInsets;
            import java.util.Objects;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 48 */    public final class m83 {

                /* JADX INFO: renamed from: b */
                public static final m83 f13659b;

                /* JADX INFO: renamed from: a */
                public final j83 f13660a;

                static {
/* 5 */             if (Build.VERSION.SDK_INT >= 30) {
/* 9 */                 f13659b = i83.f9498q;
                    } else {
/* 14 */                f13659b = j83.f12146b;
                    }
                }

                public m83(WindowInsets windowInsets) {
/* 4 */             int i = Build.VERSION.SDK_INT;
/* 8 */             if (i >= 30) {
/* 15 */                this.f13660a = new i83(this, windowInsets);
/* 17 */                return;
                    }
/* 20 */            if (i >= 29) {
/* 27 */                this.f13660a = new h83(this, windowInsets);
                    } else if (i >= 28) {
/* 39 */                this.f13660a = new f83(this, windowInsets);
                    } else {
/* 47 */                this.f13660a = new e83(this, windowInsets);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static ly0 m6619e(ly0 ly0Var, int i, int i2, int i3, int i4) {
/* 5 */             int iMax = Math.max(0, ly0Var.f13528a - i);
/* 12 */            int iMax2 = Math.max(0, ly0Var.f13529b - i2);
/* 19 */            int iMax3 = Math.max(0, ly0Var.f13530c - i3);
/* 26 */            int iMax4 = Math.max(0, ly0Var.f13531d - i4);
                    return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? ly0Var : ly0.m6573a(iMax, iMax2, iMax3, iMax4);
                }

                /* JADX INFO: renamed from: h */
                public static m83 m6620h(WindowInsets windowInsets, View view) {
/* 3 */             windowInsets.getClass();
/* 6 */             m83 m83Var = new m83(windowInsets);
/* 9 */             if (view != null && view.isAttachedToWindow()) {
/* 17 */                WeakHashMap weakHashMap = e33.f7494a;
/* 19 */                m83 m83VarM8681a = t23.m8681a(view);
/* 23 */                j83 j83Var = m83Var.f13660a;
/* 25 */                j83Var.mo2975p(m83VarM8681a);
/* 32 */                j83Var.mo2969d(view.getRootView());
                    }
/* 35 */            return m83Var;
                }

                /* JADX INFO: renamed from: a */
                public final int m6621a() {
/* 7 */             return this.f13660a.mo2971j().f13531d;
                }

                /* JADX INFO: renamed from: b */
                public final int m6622b() {
/* 7 */             return this.f13660a.mo2971j().f13528a;
                }

                /* JADX INFO: renamed from: c */
                public final int m6623c() {
/* 7 */             return this.f13660a.mo2971j().f13530c;
                }

                /* JADX INFO: renamed from: d */
                public final int m6624d() {
/* 7 */             return this.f13660a.mo2971j().f13529b;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof m83) {
/* 17 */                return Objects.equals(this.f13660a, ((m83) obj).f13660a);
                    }
/* 9 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final m83 m6625f(int i, int i2, int i3, int i4) {
                    c83 a83Var;
/* 1 */             int i5 = Build.VERSION.SDK_INT;
/* 5 */             if (i5 >= 30) {
/* 9 */                 a83Var = new b83(this);
                    } else {
/* 25 */                a83Var = i5 >= 29 ? new a83(this) : new z73(this);
                    }
/* 32 */            a83Var.mo108d(ly0.m6573a(i, i2, i3, i4));
/* 35 */            return a83Var.mo106b();
                }

                /* JADX INFO: renamed from: g */
                public final WindowInsets m6626g() {
/* 1 */             j83 j83Var = this.f13660a;
/* 5 */             if (j83Var instanceof d83) {
/* 9 */                 return ((d83) j83Var).f7059c;
                    }
/* 12 */            return null;
                }

                public final int hashCode() {
/* 1 */             j83 j83Var = this.f13660a;
/* 3 */             if (j83Var == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return j83Var.hashCode();
                }

/* 49 */        public m83() {
/* 51 */            this.f13660a = new j83(this);
                }
            }
