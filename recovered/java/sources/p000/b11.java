            package p000;

            import kotlinx.serialization.KSerializer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class b11 {

                /* JADX INFO: renamed from: d */
                public static final a11 f2161d = new a11(new wl0(false, false, false), oa2.f14694a);

                /* JADX INFO: renamed from: a */
                public final wl0 f2162a;

                /* JADX INFO: renamed from: b */
                public final C0168b5 f2163b;

                /* JADX INFO: renamed from: c */
                public final C2515yy f2164c = new C2515yy(1);

                public b11(wl0 wl0Var, C0168b5 c0168b5) {
/* 4 */             this.f2162a = wl0Var;
/* 6 */             this.f2163b = c0168b5;
                }

                /* JADX INFO: renamed from: a */
                public final Object m1198a(String str, KSerializer kSerializer) {
/* 1 */             kSerializer.getClass();
/* 4 */             str.getClass();
/* 9 */             C1837kn c1837kn = new C1837kn(str);
/* 24 */            Object objMo4375u = new oh2(this, 1, c1837kn, kSerializer.getDescriptor(), null).mo4375u(kSerializer);
/* 34 */            if (c1837kn.m6127e() == 10) {
/* 36 */                return objMo4375u;
                    }
/* 66 */            C1837kn.m6122m(c1837kn, "Expected EOF after parsing, but had " + str.charAt(c1837kn.f12882b - 1) + " instead", 0, 6);
/* 70 */            throw null;
                }

                /* JADX INFO: renamed from: b */
                public final String m1199b(KSerializer kSerializer, Object obj) {
                    char[] cArr;
/* 1 */             kSerializer.getClass();
/* 7 */             C1954n7 c1954n7 = new C1954n7(5);
                    synchronized (C1003ht.f9226a) {
/* 13 */                C0840dd c0840dd = C1003ht.f9227b;
/* 19 */                cArr = null;
/* 28 */                char[] cArr2 = (char[]) (c0840dd.isEmpty() ? null : c0840dd.removeLast());
/* 30 */                if (cArr2 != null) {
/* 36 */                    C1003ht.f9228c -= cArr2.length;
/* 38 */                    cArr = cArr2;
                        }
                    }
/* 43 */            if (cArr == null) {
/* 47 */                cArr = new char[128];
                    }
/* 49 */            c1954n7.f14152c = cArr;
                    try {
/* 70 */                new ph2(new zr3(c1954n7), this, 1, new p11[AbstractC0886en.m3496E(4).length]).mo1484A(kSerializer, obj);
/* 73 */                return c1954n7.toString();
                    } finally {
/* 82 */                c1954n7.m6903h();
                    }
                }
            }
