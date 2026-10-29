            package p000;

            import java.util.Iterator;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.encoding.Decoder;
            
            /* JADX INFO: renamed from: h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC0973h implements KSerializer {
                /* JADX INFO: renamed from: a */
                public abstract Object mo3274a();

                /* JADX INFO: renamed from: b */
                public abstract int mo3275b(Object obj);

                /* JADX INFO: renamed from: c */
                public abstract Iterator mo3276c(Object obj);

                /* JADX INFO: renamed from: d */
                public abstract int mo1376d(Object obj);

                @Override // kotlinx.serialization.KSerializer
                public Object deserialize(Decoder decoder) {
/* 1 */             return m4054e(decoder);
                }

                /* JADX INFO: renamed from: e */
                public final Object m4054e(Decoder decoder) {
/* 1 */             Object objMo3274a = mo3274a();
/* 5 */             int iMo3275b = mo3275b(objMo3274a);
/* 13 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(getDescriptor());
                    while (true) {
/* 21 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(getDescriptor());
/* 26 */                if (iMo3299x == -1) {
/* 37 */                    interfaceC1870kyMo3297c.mo3296b(getDescriptor());
/* 40 */                    return mo3277h(objMo3274a);
                        }
/* 29 */                mo1377f(interfaceC1870kyMo3297c, iMo3299x + iMo3275b, objMo3274a);
                    }
                }

                /* JADX INFO: renamed from: f */
                public abstract void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj);

                /* JADX INFO: renamed from: g */
                public abstract Object mo1378g(Object obj);

                /* JADX INFO: renamed from: h */
                public abstract Object mo3277h(Object obj);
            }
