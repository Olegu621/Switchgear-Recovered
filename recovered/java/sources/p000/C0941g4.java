            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: g4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0941g4 implements InterfaceC0203c4 {

                /* JADX INFO: renamed from: a */
                public final ra2 f8458a;

                /* JADX INFO: renamed from: b */
                public final ec0 f8459b;

                /* JADX INFO: renamed from: c */
                public final ec0 f8460c;

                public C0941g4(ra2 ra2Var) {
/* 1 */             ec0 ec0Var = hu0.f9294b;
/* 6 */             this.f8458a = ra2Var;
/* 18 */            if (((tj1) ra2Var.f15958d).f17128a.isEmpty()) {
/* 45 */                this.f8459b = ec0Var;
/* 47 */                this.f8460c = ec0Var;
/* 49 */                return;
                    }
/* 28 */            sk1 sk1Var = (sk1) tk1.f17133b.f17135a.get();
/* 32 */            sk1Var = sk1Var == null ? tk1.f17134c : sk1Var;
/* 34 */            hu0.m4336e0(ra2Var);
/* 37 */            sk1Var.getClass();
/* 40 */            this.f8459b = ec0Var;
/* 42 */            this.f8460c = ec0Var;
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: a */
                public final byte[] mo1524a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             ec0 ec0Var = this.f8459b;
/* 7 */             lx1 lx1Var = (lx1) this.f8458a.f15957c;
                    try {
/* 9 */                 byte[] bArr3 = lx1Var.f13520c;
/* 32 */                byte[] bArrM5965b = k50.m5965b(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((InterfaceC0203c4) lx1Var.f13519b).mo1524a(bArr, bArr2));
/* 36 */                int i = lx1Var.f13523f;
/* 38 */                int length = bArr.length;
/* 39 */                ec0Var.getClass();
/* 42 */                return bArrM5965b;
                    } catch (GeneralSecurityException e) {
/* 44 */                ec0Var.getClass();
/* 47 */                throw e;
                    }
                }

                @Override // p000.InterfaceC0203c4
                /* JADX INFO: renamed from: b */
                public final byte[] mo1525b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int length = bArr.length;
/* 2 */             ra2 ra2Var = this.f8458a;
/* 4 */             ec0 ec0Var = this.f8460c;
/* 7 */             if (length > 5) {
/* 9 */                 byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
/* 14 */                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
/* 22 */                Iterator it = ra2Var.m8108m(bArrCopyOf).iterator();
/* 30 */                while (it.hasNext()) {
                            try {
/* 42 */                        byte[] bArrMo1525b = ((InterfaceC0203c4) ((lx1) it.next()).f13519b).mo1525b(bArrCopyOfRange, bArr2);
/* 46 */                        ec0Var.getClass();
/* 49 */                        return bArrMo1525b;
                            } catch (GeneralSecurityException e) {
/* 67 */                        C0978h4.f8890a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                            }
                        }
                    }
/* 77 */            Iterator it2 = ra2Var.m8108m(jb1.f12170b).iterator();
/* 85 */            while (it2.hasNext()) {
                        try {
/* 97 */                    byte[] bArrMo1525b2 = ((InterfaceC0203c4) ((lx1) it2.next()).f13519b).mo1525b(bArr, bArr2);
/* 101 */                   ec0Var.getClass();
/* 104 */                   return bArrMo1525b2;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
/* 105 */           ec0Var.getClass();
/* 110 */           ds0.m3203t("decryption failed");
/* 113 */           return null;
                }
            }
