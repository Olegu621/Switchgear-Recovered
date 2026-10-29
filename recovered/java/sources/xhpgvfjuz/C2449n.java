            package xhpgvfjuz;

            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: xhpgvfjuz.n */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2449n extends C2425ao {
                public C2449n() {
                    super(EnumC2371C.f);
                    this.f19150a.put(1281, new ArrayList());
                }

                /* JADX INFO: renamed from: a */
                private void m9938a(String str, String str2, String str3, String str4, String str5) {
                    C2423am c2423am = new C2423am();
                    c2423am.f19145a = str;
                    c2423am.f19147c = str2;
                    c2423am.f19149e = str3;
                    c2423am.f19148d = str4;
                    c2423am.f19146b = str5;
                    m9939d().add(c2423am);
                }

                /* JADX INFO: renamed from: d */
                private List m9939d() {
                    return (List) this.f19150a.get(1281);
                }

                /* JADX INFO: renamed from: a */
                public String m9940a() {
                    return m9942b() ? m9945d(0) : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: b */
                public String m9941b(int i) {
                    return (i < 0 || i >= m9939d().size()) ? HttpUrl.FRAGMENT_ENCODE_SET : ((C2423am) m9939d().get(i)).f19149e;
                }

                /* JADX INFO: renamed from: b */
                public boolean m9942b() {
                    return !m9939d().isEmpty();
                }

                /* JADX INFO: renamed from: c */
                public String m9943c() {
                    return m9942b() ? m9947e(0) : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: c */
                public String m9944c(int i) {
                    return (i < 0 || i >= m9939d().size()) ? HttpUrl.FRAGMENT_ENCODE_SET : ((C2423am) m9939d().get(i)).f19148d;
                }

                /* JADX INFO: renamed from: d */
                public String m9945d(int i) {
                    return (i < 0 || i >= m9939d().size()) ? HttpUrl.FRAGMENT_ENCODE_SET : ((C2423am) m9939d().get(i)).f19145a;
                }

                /* JADX INFO: renamed from: e */
                public String m9946e() {
                    return m9942b() ? m9949g(0) : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: e */
                public String m9947e(int i) {
                    return (i < 0 || i >= m9939d().size()) ? HttpUrl.FRAGMENT_ENCODE_SET : ((C2423am) m9939d().get(i)).f19146b;
                }

                /* JADX INFO: renamed from: f */
                public String m9948f() {
                    return m9942b() ? m9941b(0) : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: g */
                public String m9949g(int i) {
                    return (i < 0 || i >= m9939d().size()) ? HttpUrl.FRAGMENT_ENCODE_SET : ((C2423am) m9939d().get(i)).f19147c;
                }

                /* JADX INFO: renamed from: h */
                public String m9950h() {
                    return m9942b() ? m9944c(0) : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: i */
                public int m9951i() {
                    return m9939d().size();
                }
            }
