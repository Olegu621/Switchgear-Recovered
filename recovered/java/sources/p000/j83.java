            package p000;

            import android.os.Build;
            import android.view.View;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class j83 {

                /* JADX INFO: renamed from: b */
                public static final m83 f12146b;

                /* JADX INFO: renamed from: a */
                public final m83 f12147a;

                static {
                    c83 a83Var;
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 30) {
/* 9 */                 a83Var = new b83();
                    } else {
/* 25 */                a83Var = i >= 29 ? new a83() : new z73();
                    }
/* 50 */            f12146b = a83Var.mo106b().f13660a.mo3677a().f13660a.mo3339b().f13660a.mo3340c();
                }

                public j83(m83 m83Var) {
/* 4 */             this.f12147a = m83Var;
                }

                /* JADX INFO: renamed from: a */
                public m83 mo3677a() {
/* 1 */             return this.f12147a;
                }

                /* JADX INFO: renamed from: b */
                public m83 mo3339b() {
/* 1 */             return this.f12147a;
                }

                /* JADX INFO: renamed from: c */
                public m83 mo3340c() {
/* 1 */             return this.f12147a;
                }

                /* JADX INFO: renamed from: d */
                public void mo2969d(View view) {
                }

                /* JADX INFO: renamed from: e */
                public b90 mo3678e() {
/* 1 */             return null;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof j83)) {
/* 7 */                 return false;
                    }
/* 11 */            j83 j83Var = (j83) obj;
                    return mo2973n() == j83Var.mo2973n() && mo3342m() == j83Var.mo3342m() && Objects.equals(mo2971j(), j83Var.mo2971j()) && Objects.equals(mo3341h(), j83Var.mo3341h()) && Objects.equals(mo3678e(), j83Var.mo3678e());
                }

                /* JADX INFO: renamed from: f */
                public ly0 mo2970f(int i) {
/* 1 */             return ly0.f13527e;
                }

                /* JADX INFO: renamed from: g */
                public ly0 mo4132g() {
/* 1 */             return mo2971j();
                }

                /* JADX INFO: renamed from: h */
                public ly0 mo3341h() {
/* 1 */             return ly0.f13527e;
                }

                public int hashCode() {
/* 33 */            return Objects.hash(Boolean.valueOf(mo2973n()), Boolean.valueOf(mo3342m()), mo2971j(), mo3341h(), mo3678e());
                }

                /* JADX INFO: renamed from: i */
                public ly0 mo4133i() {
/* 1 */             return mo2971j();
                }

                /* JADX INFO: renamed from: j */
                public ly0 mo2971j() {
/* 1 */             return ly0.f13527e;
                }

                /* JADX INFO: renamed from: k */
                public ly0 mo4134k() {
/* 1 */             return mo2971j();
                }

                /* JADX INFO: renamed from: l */
                public m83 mo2972l(int i, int i2, int i3, int i4) {
/* 1 */             return f12146b;
                }

                /* JADX INFO: renamed from: m */
                public boolean mo3342m() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: n */
                public boolean mo2973n() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: o */
                public void mo2974o(ly0[] ly0VarArr) {
                }

                /* JADX INFO: renamed from: p */
                public void mo2975p(m83 m83Var) {
                }

                /* JADX INFO: renamed from: q */
                public void mo3343q(ly0 ly0Var) {
                }
            }
