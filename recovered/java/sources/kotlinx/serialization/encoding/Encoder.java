            package kotlinx.serialization.encoding;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import p000.C0168b5;
            import p000.InterfaceC1907ly;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface Encoder {
                /* JADX INFO: renamed from: A */
                void mo1484A(KSerializer kSerializer, Object obj);

                /* JADX INFO: renamed from: B */
                void mo1485B(long j);

                /* JADX INFO: renamed from: F */
                void mo1489F(String str);

                /* JADX INFO: renamed from: a */
                C0168b5 mo1497a();

                /* JADX INFO: renamed from: c */
                InterfaceC1907ly mo1499c(SerialDescriptor serialDescriptor);

                /* JADX INFO: renamed from: f */
                void mo1502f();

                /* JADX INFO: renamed from: g */
                void mo1503g(double d);

                /* JADX INFO: renamed from: h */
                void mo1504h(short s);

                /* JADX INFO: renamed from: j */
                void mo1506j(byte b);

                /* JADX INFO: renamed from: k */
                void mo1507k(boolean z);

                /* JADX INFO: renamed from: m */
                void mo1509m(float f);

                /* JADX INFO: renamed from: o */
                void mo1511o(char c);

                /* JADX INFO: renamed from: u */
                InterfaceC1907ly mo1517u(SerialDescriptor serialDescriptor, int i);

                /* JADX INFO: renamed from: v */
                void mo1518v(SerialDescriptor serialDescriptor, int i);

                /* JADX INFO: renamed from: y */
                void mo1521y(int i);

                /* JADX INFO: renamed from: z */
                Encoder mo1522z(SerialDescriptor serialDescriptor);
            }
