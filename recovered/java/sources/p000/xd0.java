            package p000;

            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xd0 implements InterfaceC0203c4 {

                /* JADX INFO: renamed from: a */
                public final C0979h5 f19036a;

                /* JADX INFO: renamed from: b */
                public final wa1 f19037b;

                /* JADX INFO: renamed from: c */
                public final int f19038c;

                public xd0(C0979h5 c0979h5, wa1 wa1Var, int i) {
/* 4 */             this.f19036a = c0979h5;
/* 6 */             this.f19037b = wa1Var;
/* 8 */             this.f19038c = i;
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: a */
                public final byte[] mo1524a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             C0979h5 c0979h5 = this.f19036a;
/* 3 */             c0979h5.getClass();
/* 6 */             int length = bArr.length;
/* 7 */             int i = c0979h5.f8894b;
/* 12 */            int i2 = AbstractC0208c9.API_PRIORITY_OTHER - i;
/* 13 */            if (length > i2) {
/* 97 */                throw new GeneralSecurityException(fm0.m3781g(i2, "plaintext length can not exceed "));
                    }
/* 17 */            byte[] bArr3 = new byte[bArr.length + i];
/* 19 */            byte[] bArrM7088a = o02.m7088a(i);
/* 24 */            System.arraycopy(bArrM7088a, 0, bArr3, 0, i);
/* 33 */            c0979h5.m4112a(bArr, 0, bArr.length, bArr3, c0979h5.f8894b, bArrM7088a, true);
/* 36 */            if (bArr2 == null) {
/* 38 */                bArr2 = new byte[0];
                    }
/* 81 */            return k50.m5965b(bArr3, this.f19037b.mo1179b(k50.m5965b(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: b */
                public final byte[] mo1525b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int length = bArr.length;
/* 5 */             int i = this.f19038c;
/* 7 */             if (length < i) {
/* 97 */                ds0.m3203t("ciphertext too short");
/* 2 */                 return null;
                    }
/* 12 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
/* 19 */            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
/* 23 */            if (bArr2 == null) {
/* 25 */                bArr2 = new byte[0];
                    }
/* 60 */            this.f19037b.mo1178a(bArrCopyOfRange2, k50.m5965b(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
/* 63 */            C0979h5 c0979h5 = this.f19036a;
/* 65 */            c0979h5.getClass();
/* 68 */            int length2 = bArrCopyOfRange.length;
/* 69 */            int i2 = c0979h5.f8894b;
/* 71 */            if (length2 < i2) {
/* 93 */                ds0.m3203t("ciphertext too short");
/* 2 */                 return null;
                    }
/* 73 */            byte[] bArr3 = new byte[i2];
/* 75 */            System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
/* 78 */            int length3 = bArrCopyOfRange.length;
/* 79 */            int i3 = c0979h5.f8894b;
/* 82 */            byte[] bArr4 = new byte[length3 - i3];
/* 89 */            c0979h5.m4112a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
/* 92 */            return bArr4;
                }
            }
