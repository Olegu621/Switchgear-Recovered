            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.Fragment;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Objects;
            import okio.Path;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class fm0 {
                /* JADX INFO: renamed from: a */
                public static final void m3775a(int i, View view, ViewGroup viewGroup) {
/* 1 */             view.getClass();
/* 4 */             viewGroup.getClass();
/* 7 */             int iM3520y = AbstractC0886en.m3520y(i);
/* 13 */            if (iM3520y == 0) {
/* 95 */                ViewParent parent = view.getParent();
/* 104 */               ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
/* 106 */               if (viewGroup2 != null) {
/* 112 */                   if (AbstractC0111w.m674K(2)) {
/* 114 */                       view.toString();
/* 117 */                       viewGroup2.toString();
                            }
/* 120 */                   viewGroup2.removeView(view);
/* 123 */                   return;
                        }
/* 123 */               return;
                    }
/* 16 */            if (iM3520y == 1) {
/* 57 */                if (AbstractC0111w.m674K(2)) {
/* 59 */                    Objects.toString(view);
                        }
/* 62 */                ViewParent parent2 = view.getParent();
/* 73 */                if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
/* 79 */                    if (AbstractC0111w.m674K(2)) {
/* 81 */                        view.toString();
/* 84 */                        Objects.toString(viewGroup);
                            }
/* 87 */                    viewGroup.addView(view);
                        }
/* 91 */                view.setVisibility(0);
/* 94 */                return;
                    }
/* 18 */            if (iM3520y == 2) {
/* 42 */                if (AbstractC0111w.m674K(2)) {
/* 44 */                    Objects.toString(view);
                        }
/* 49 */                view.setVisibility(8);
                    } else {
/* 21 */                if (iM3520y != 3) {
/* 123 */                   return;
                        }
/* 28 */                if (AbstractC0111w.m674K(2)) {
/* 30 */                    Objects.toString(view);
                        }
/* 34 */                view.setVisibility(4);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static int m3776b(int i, int i2, int i3) {
/* 6 */             return C1808jw.m5908h(i) + i2 + i3;
                }

                /* JADX INFO: renamed from: c */
                public static int m3777c(int i, int i2, int i3, int i4) {
/* 7 */             return C1808jw.m5909i(i) + i2 + i3 + i4;
                }

                /* JADX INFO: renamed from: d */
                public static sy1 m3778d(k22 k22Var, Class cls, String str, String str2, int i) {
/* 1 */             k22Var.getClass();
/* 6 */             return new sy1(cls, str, str2, i);
                }

                /* JADX INFO: renamed from: e */
                public static dj2 m3779e(ArrayList arrayList, dj2 dj2Var) {
/* 1 */             arrayList.add(dj2Var);
/* 6 */             return new dj2();
                }

                /* JADX INFO: renamed from: f */
                public static ClassCastException m3780f(Iterator it) {
/* 5 */             it.next().getClass();
/* 10 */            return new ClassCastException();
                }

                /* JADX INFO: renamed from: g */
                public static String m3781g(int i, String str) {
/* 9 */             return str + i;
                }

                /* JADX INFO: renamed from: h */
                public static String m3782h(String str, Fragment fragment, String str2) {
/* 12 */            return str + fragment + str2;
                }

                /* JADX INFO: renamed from: i */
                public static String m3783i(String str, String str2) {
/* 12 */            return str + str2;
                }

                /* JADX INFO: renamed from: j */
                public static String m3784j(String str, String str2, String str3) {
/* 12 */            return str + str2 + str3;
                }

                /* JADX INFO: renamed from: k */
                public static String m3785k(String str, String str2, String str3, String str4, String str5) {
/* 18 */            return str + str2 + str3 + str4 + str5;
                }

                /* JADX INFO: renamed from: l */
                public static String m3786l(StringBuilder sb, int i, String str) {
/* 1 */             sb.append(i);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                /* JADX INFO: renamed from: m */
                public static String m3787m(StringBuilder sb, long j, String str) {
/* 1 */             sb.append(j);
/* 4 */             sb.append(str);
/* 7 */             return sb.toString();
                }

                /* JADX INFO: renamed from: n */
                public static String m3788n(StringBuilder sb, String str, int i) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(i);
/* 7 */             return sb.toString();
                }

                /* JADX INFO: renamed from: o */
                public static String m3789o(StringBuilder sb, String str, String str2) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             return sb.toString();
                }

                /* JADX INFO: renamed from: p */
                public static String m3790p(StringBuilder sb, String str, String str2, String str3) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             sb.append(str3);
/* 10 */            return sb.toString();
                }

                /* JADX INFO: renamed from: q */
                public static String m3791q(StringBuilder sb, String str, String str2, String str3, String str4) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             sb.append(str3);
/* 10 */            sb.append(str4);
/* 13 */            return sb.toString();
                }

                /* JADX INFO: renamed from: r */
                public static String m3792r(Path path, String str) {
/* 9 */             return str + path;
                }

                /* JADX INFO: renamed from: s */
                public static StringBuilder m3793s(int i, String str, String str2) {
/* 3 */             StringBuilder sb = new StringBuilder(str);
/* 6 */             sb.append(i);
/* 9 */             sb.append(str2);
/* 12 */            return sb;
                }

                /* JADX INFO: renamed from: t */
                public static StringBuilder m3794t(String str, String str2) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(str);
/* 9 */             sb.append(str2);
/* 12 */            return sb;
                }

                /* JADX INFO: renamed from: u */
                public static void m3795u(int i, ej2 ej2Var, long j, dj2 dj2Var) {
/* 6 */             dj2Var.m3140a(new C2143rg(i, ej2Var, j));
                }

                /* JADX INFO: renamed from: v */
                public static void m3796v(StringBuilder sb, String str, String str2, String str3, String str4) {
/* 1 */             sb.append(str);
/* 4 */             sb.append(str2);
/* 7 */             sb.append(str3);
/* 10 */            sb.append(str4);
                }

                /* JADX INFO: renamed from: w */
                public static int m3797w(int i, int i2, int i3, int i4) {
/* 3 */             return ((i * i2) / i3) + i4;
                }

                /* JADX INFO: renamed from: x */
                public static /* synthetic */ String m3798x(int i) {
/* 2 */             if (i == 1) {
/* 12 */                return "POST";
                    }
/* 5 */             if (i == 2) {
/* 7 */                 return "GET";
                    }
/* 11 */            throw null;
                }

                /* JADX INFO: renamed from: y */
                public static /* synthetic */ String m3799y(int i) {
/* 2 */             if (i != 1) {
                        return i != 2 ? "null" : "GET";
                    }
/* 13 */            return "POST";
                }
            }
