            package p000;

            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yg0 extends e62 {

                /* JADX INFO: renamed from: e */
                public final HashMap f19603e = new HashMap();

                @Override // p000.e62
                /* JADX INFO: renamed from: a */
                public final b62 mo3333a(Object obj) {
/* 7 */             return (b62) this.f19603e.get(obj);
                }

                @Override // p000.e62
                /* JADX INFO: renamed from: b */
                public final Object mo3334b(Object obj) {
/* 1 */             Object objMo3334b = super.mo3334b(obj);
/* 7 */             this.f19603e.remove(obj);
/* 10 */            return objMo3334b;
                }
            }
