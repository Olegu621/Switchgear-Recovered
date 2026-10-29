            package p000;

            import java.util.Random;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class vg0 extends AbstractC0199c0 {

                /* JADX INFO: renamed from: c */
                public final C2293a f18052c = new C2293a();

                /* JADX INFO: renamed from: vg0$a */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class C2293a extends ThreadLocal {
                    @Override // java.lang.ThreadLocal
                    public final Object initialValue() {
/* 3 */                 return new Random();
                    }
                }

                @Override // p000.AbstractC0199c0
                /* JADX INFO: renamed from: d */
                public final Random mo1168d() {
/* 3 */             Object obj = this.f18052c.get();
/* 7 */             obj.getClass();
/* 10 */            return (Random) obj;
                }
            }
