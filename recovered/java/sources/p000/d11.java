            package p000;

            import java.util.Iterator;
            import java.util.List;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.C1857a;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class d11 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final d11 f6955a = new d11();

                /* JADX INFO: renamed from: b */
                public static final c11 f6956b = c11.f2647b;

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             jb1.m5746f(decoder);
/* 20 */            return new C1857a((List) new C0950gd(n11.f14092a, 0).m4054e(decoder));
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f6956b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             C1857a c1857a = (C1857a) obj;
/* 3 */             c1857a.getClass();
/* 6 */             jb1.m5747g(encoder);
/* 9 */             n11 n11Var = n11.f14092a;
/* 13 */            SerialDescriptor descriptor = n11Var.getDescriptor();
/* 17 */            descriptor.getClass();
/* 21 */            C0015ad c0015ad = new C0015ad(descriptor, 1);
/* 24 */            int size = c1857a.size();
/* 28 */            InterfaceC1907ly interfaceC1907lyMo1517u = encoder.mo1517u(c0015ad, size);
/* 32 */            Iterator<E> it = c1857a.iterator();
/* 37 */            for (int i = 0; i < size; i++) {
/* 43 */                interfaceC1907lyMo1517u.mo1505i(c0015ad, i, n11Var, it.next());
                    }
/* 49 */            interfaceC1907lyMo1517u.mo1498b(c0015ad);
                }
            }
