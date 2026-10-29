            package p000;

            import java.util.Iterator;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: renamed from: ow */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC2048ow extends AbstractC0973h {

                /* JADX INFO: renamed from: a */
                public final KSerializer f14908a;

                public AbstractC2048ow(KSerializer kSerializer) {
/* 4 */             this.f14908a = kSerializer;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: f */
                public void mo1377f(InterfaceC1870ky interfaceC1870ky, int i, Object obj) {
/* 12 */            mo3278i(i, obj, interfaceC1870ky.mo4350A(getDescriptor(), i, this.f14908a, null));
                }

                /* JADX INFO: renamed from: i */
                public abstract void mo3278i(int i, Object obj, Object obj2);

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, Object obj) {
/* 1 */             int iMo1376d = mo1376d(obj);
/* 5 */             SerialDescriptor descriptor = getDescriptor();
/* 9 */             InterfaceC1907ly interfaceC1907lyMo1517u = encoder.mo1517u(descriptor, iMo1376d);
/* 13 */            Iterator itMo3276c = mo3276c(obj);
/* 18 */            for (int i = 0; i < iMo1376d; i++) {
/* 30 */                interfaceC1907lyMo1517u.mo1505i(getDescriptor(), i, this.f14908a, itMo3276c.next());
                    }
/* 36 */            interfaceC1907lyMo1517u.mo1498b(descriptor);
                }
            }
