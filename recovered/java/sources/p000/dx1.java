            package p000;

            import java.util.Iterator;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class dx1 extends AbstractC2048ow {

                /* JADX INFO: renamed from: b */
                public final cx1 f7440b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dx1(KSerializer kSerializer) {
/* 4 */             super(kSerializer);
/* 1 */             kSerializer.getClass();
/* 16 */            this.f7440b = new cx1(kSerializer.getDescriptor());
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: a */
                public final Object mo3274a() {
/* 9 */             return (bx1) mo1378g(mo1379j());
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: b */
                public final int mo3275b(Object obj) {
/* 1 */             bx1 bx1Var = (bx1) obj;
/* 3 */             bx1Var.getClass();
/* 6 */             return bx1Var.mo1467d();
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: c */
                public final Iterator mo3276c(Object obj) {
/* 8 */             throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
                }

                @Override // p000.AbstractC0973h, kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             return m4054e(decoder);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return this.f7440b;
                }

                @Override // p000.AbstractC0973h
                /* JADX INFO: renamed from: h */
                public final Object mo3277h(Object obj) {
/* 1 */             bx1 bx1Var = (bx1) obj;
/* 3 */             bx1Var.getClass();
/* 6 */             return bx1Var.mo1465a();
                }

                @Override // p000.AbstractC2048ow
                /* JADX INFO: renamed from: i */
                public final void mo3278i(int i, Object obj, Object obj2) {
/* 3 */             ((bx1) obj).getClass();
/* 13 */            throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
                }

                /* JADX INFO: renamed from: j */
                public abstract Object mo1379j();

                /* JADX INFO: renamed from: k */
                public abstract void mo1380k(InterfaceC1907ly interfaceC1907ly, Object obj, int i);

                @Override // p000.AbstractC2048ow, kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             int iMo1376d = mo1376d(obj);
/* 5 */             cx1 cx1Var = this.f7440b;
/* 7 */             InterfaceC1907ly interfaceC1907lyMo1517u = encoder.mo1517u(cx1Var, iMo1376d);
/* 11 */            mo1380k(interfaceC1907lyMo1517u, obj, iMo1376d);
/* 14 */            interfaceC1907lyMo1517u.mo1498b(cx1Var);
                }
            }
