            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c80 implements a80 {

                /* JADX INFO: renamed from: a */
                public final ra2 f2759a;

                /* JADX INFO: renamed from: b */
                public final ec0 f2760b;

                /* JADX INFO: renamed from: c */
                public final ec0 f2761c;

                public c80(ra2 ra2Var) {
/* 1 */             ec0 ec0Var = hu0.f9294b;
/* 6 */             this.f2759a = ra2Var;
/* 18 */            if (((tj1) ra2Var.f15958d).f17128a.isEmpty()) {
/* 45 */                this.f2760b = ec0Var;
/* 47 */                this.f2761c = ec0Var;
/* 49 */                return;
                    }
/* 28 */            sk1 sk1Var = (sk1) tk1.f17133b.f17135a.get();
/* 32 */            sk1Var = sk1Var == null ? tk1.f17134c : sk1Var;
/* 34 */            hu0.m4336e0(ra2Var);
/* 37 */            sk1Var.getClass();
/* 40 */            this.f2760b = ec0Var;
/* 42 */            this.f2761c = ec0Var;
                }

                @Override // p000.a80
                /* JADX INFO: renamed from: a */
                public final byte[] mo98a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             ec0 ec0Var = this.f2760b;
/* 7 */             lx1 lx1Var = (lx1) this.f2759a.f15957c;
                    try {
/* 9 */                 byte[] bArr3 = lx1Var.f13520c;
/* 32 */                byte[] bArrM5965b = k50.m5965b(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((a80) lx1Var.f13519b).mo98a(bArr, bArr2));
/* 36 */                int i = lx1Var.f13523f;
/* 38 */                ec0Var.getClass();
/* 41 */                return bArrM5965b;
                    } catch (GeneralSecurityException e) {
/* 43 */                ec0Var.getClass();
/* 46 */                throw e;
                    }
                }

                @Override // p000.a80
                /* JADX INFO: renamed from: b */
                public final byte[] mo99b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int length = bArr.length;
/* 2 */             ra2 ra2Var = this.f2759a;
/* 4 */             ec0 ec0Var = this.f2761c;
/* 7 */             if (length > 5) {
/* 9 */                 byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
/* 14 */                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
/* 22 */                Iterator it = ra2Var.m8108m(bArrCopyOf).iterator();
/* 30 */                while (it.hasNext()) {
                            try {
/* 42 */                        byte[] bArrMo99b = ((a80) ((lx1) it.next()).f13519b).mo99b(bArrCopyOfRange, bArr2);
/* 46 */                        ec0Var.getClass();
/* 49 */                        return bArrMo99b;
                            } catch (GeneralSecurityException e) {
/* 67 */                        d80.f7040a.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                            }
                        }
                    }
/* 77 */            Iterator it2 = ra2Var.m8108m(jb1.f12170b).iterator();
/* 85 */            while (it2.hasNext()) {
                        try {
/* 97 */                    byte[] bArrMo99b2 = ((a80) ((lx1) it2.next()).f13519b).mo99b(bArr, bArr2);
/* 101 */                   ec0Var.getClass();
/* 104 */                   return bArrMo99b2;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
/* 105 */           ec0Var.getClass();
/* 110 */           ds0.m3203t("decryption failed");
/* 113 */           return null;
                }
            }
