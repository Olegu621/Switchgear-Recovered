            package p000;

            import java.nio.BufferUnderflowException;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s41 implements InterfaceC0203c4 {

                /* JADX INFO: renamed from: c */
                public static final byte[] f16422c = new byte[0];

                /* JADX INFO: renamed from: a */
                public final w31 f16423a;

                /* JADX INFO: renamed from: b */
                public final C2486y5 f16424b;

                public s41(w31 w31Var, C2486y5 c2486y5) {
/* 4 */             this.f16423a = w31Var;
/* 6 */             this.f16424b = c2486y5;
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: a */
                public final byte[] mo1524a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
                    AbstractC2313w abstractC2313wMo7325h;
/* 1 */             w31 w31Var = this.f16423a;
/* 3 */             AtomicReference atomicReference = r22.f15833a;
                    synchronized (r22.class) {
                        try {
/* 26 */                    kx0 kx0Var = ((o31) r22.f15833a.get()).m7094a(w31Var.m9464B()).f14110a;
/* 30 */                    Class cls = (Class) kx0Var.f13035c;
/* 44 */                    if (!((Map) kx0Var.f13034b).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 90 */                        throw new IllegalArgumentException("Given internalKeyMananger " + kx0Var.toString() + " does not support primitive class " + cls.getName());
                            }
/* 107 */                   if (!((Boolean) r22.f15835c.get(w31Var.m9464B())).booleanValue()) {
/* 232 */                       throw new GeneralSecurityException("newKey-operation not permitted for key type " + w31Var.m9464B());
                            }
/* 109 */                   AbstractC2298vl abstractC2298vlM9465C = w31Var.m9465C();
                            try {
/* 113 */                       sq3 sq3VarMo6296o = kx0Var.mo6296o();
/* 117 */                       AbstractC2313w abstractC2313wMo7327k = sq3VarMo6296o.mo7327k(abstractC2298vlM9465C);
/* 121 */                       sq3VarMo6296o.mo7328m(abstractC2313wMo7327k);
/* 124 */                       abstractC2313wMo7325h = sq3VarMo6296o.mo7325h(abstractC2313wMo7327k);
                            } catch (pz0 e) {
/* 208 */                       throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) kx0Var.mo6296o().f16749a).getName()), e);
                            }
                        } catch (Throwable th) {
/* 234 */                   throw th;
                        }
                    }
/* 129 */           byte[] bArrM9359e = abstractC2313wMo7325h.m9359e();
/* 137 */           byte[] bArrMo1524a = this.f16424b.mo1524a(bArrM9359e, f16422c);
/* 153 */           byte[] bArrMo1524a2 = ((InterfaceC0203c4) r22.m8055d(this.f16423a.m9464B(), bArrM9359e)).mo1524a(bArr, bArr2);
/* 179 */           return ByteBuffer.allocate(bArrMo1524a.length + 4 + bArrMo1524a2.length).putInt(bArrMo1524a.length).put(bArrMo1524a).put(bArrMo1524a2).array();
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: b */
                public final byte[] mo1525b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
                    try {
/* 3 */                 ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
/* 7 */                 int i = byteBufferWrap.getInt();
/* 11 */                if (i <= 0 || i > bArr.length - 4) {
/* 73 */                    throw new GeneralSecurityException("invalid ciphertext");
                        }
/* 18 */                byte[] bArr3 = new byte[i];
/* 21 */                byteBufferWrap.get(bArr3, 0, i);
/* 28 */                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
/* 34 */                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
/* 57 */                return ((InterfaceC0203c4) r22.m8055d(this.f16423a.m9464B(), this.f16424b.mo1525b(bArr3, f16422c))).mo1525b(bArr4, bArr2);
                    } catch (IndexOutOfBoundsException e) {
/* 66 */                e = e;
/* 79 */                throw new GeneralSecurityException("invalid ciphertext", e);
                    } catch (NegativeArraySizeException e2) {
/* 62 */                e = e2;
/* 79 */                throw new GeneralSecurityException("invalid ciphertext", e);
                    } catch (BufferUnderflowException e3) {
/* 64 */                e = e3;
/* 79 */                throw new GeneralSecurityException("invalid ciphertext", e);
                    }
                }
            }
