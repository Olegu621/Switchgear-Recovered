            package p000;

            import android.util.Property;
            
            /* JADX INFO: renamed from: yu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2511yu extends Property {

                /* JADX INFO: renamed from: a */
                public static final C2511yu f19812a = new C2511yu(Integer.class, "circularRevealScrimColor");

                @Override // android.util.Property
                public final Object get(Object obj) {
/* 7 */             return Integer.valueOf(((InterfaceC0157av) obj).getCircularRevealScrimColor());
                }

                @Override // android.util.Property
                public final void set(Object obj, Object obj2) {
/* 9 */             ((InterfaceC0157av) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
                }
            }
