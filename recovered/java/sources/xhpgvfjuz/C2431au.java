            package xhpgvfjuz;

            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: renamed from: xhpgvfjuz.au */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2431au extends C2425ao {
                public C2431au() {
                    super(EnumC2371C.s);
                    this.f19150a.put(16640, new ArrayList());
                }

                /* JADX INFO: renamed from: a */
                private void m9913a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    C2374F c2374f = new C2374F();
                    c2374f.f19126g = str;
                    c2374f.f19122c = str2;
                    c2374f.f19124e = str3;
                    c2374f.f19123d = str4;
                    c2374f.f19127h = str5;
                    c2374f.f19121b = str6;
                    c2374f.f19120a = str7;
                    c2374f.f19125f = str8;
                    m9914b().add(c2374f);
                }

                /* JADX INFO: renamed from: b */
                private List m9914b() {
                    return (List) this.f19150a.get(16640);
                }

                /* JADX INFO: renamed from: a */
                public boolean m9915a() {
                    return !m9914b().isEmpty();
                }

                /* JADX INFO: renamed from: b */
                public String m9916b(int i) {
                    return ((C2374F) m9914b().get(i)).f19127h;
                }

                /* JADX INFO: renamed from: c */
                public int m9917c() {
                    return m9914b().size();
                }

                /* JADX INFO: renamed from: c */
                public String m9918c(int i) {
                    return ((C2374F) m9914b().get(i)).f19124e;
                }

                /* JADX INFO: renamed from: d */
                public String m9919d(int i) {
                    return ((C2374F) m9914b().get(i)).f19125f;
                }

                /* JADX INFO: renamed from: e */
                public String m9920e(int i) {
                    return ((C2374F) m9914b().get(i)).f19121b;
                }

                /* JADX INFO: renamed from: g */
                public String m9921g(int i) {
                    return ((C2374F) m9914b().get(i)).f19120a;
                }

                /* JADX INFO: renamed from: i */
                public String m9922i(int i) {
                    return ((C2374F) m9914b().get(i)).f19123d;
                }

                /* JADX INFO: renamed from: j */
                public String m9923j(int i) {
                    return ((C2374F) m9914b().get(i)).f19122c;
                }

                /* JADX INFO: renamed from: k */
                public String m9924k(int i) {
                    return ((C2374F) m9914b().get(i)).f19126g;
                }
            }
