            package p000;

            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.List;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: renamed from: ev */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0894ev {

                /* JADX INFO: renamed from: a */
                public List f7886a = nd0.f14189a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f7887b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final HashSet f7888c = new HashSet();

                /* JADX INFO: renamed from: d */
                public final ArrayList f7889d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public final ArrayList f7890e = new ArrayList();

                /* JADX INFO: renamed from: f */
                public final ArrayList f7891f = new ArrayList();

                public C0894ev(String str) {
                }

                /* JADX INFO: renamed from: a */
                public static void m3601a(C0894ev c0894ev, String str, SerialDescriptor serialDescriptor) {
/* 1 */             nd0 nd0Var = nd0.f14189a;
/* 3 */             c0894ev.getClass();
/* 6 */             serialDescriptor.getClass();
/* 9 */             nd0Var.getClass();
/* 18 */            if (!c0894ev.f7888c.add(str)) {
/* 54 */                ds0.m3200q(fm0.m3784j("Element with name '", str, "' is already registered"));
/* 57 */                return;
                    }
/* 22 */            c0894ev.f7887b.add(str);
/* 27 */            c0894ev.f7889d.add(serialDescriptor);
/* 32 */            c0894ev.f7890e.add(nd0Var);
/* 42 */            c0894ev.f7891f.add(false);
                }
            }
