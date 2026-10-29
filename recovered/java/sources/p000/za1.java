            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Arrays;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class za1 implements wa1 {

                /* JADX INFO: renamed from: a */
                public final ra2 f20034a;

                /* JADX INFO: renamed from: b */
                public final ec0 f20035b;

                /* JADX INFO: renamed from: c */
                public final ec0 f20036c;

                public za1(ra2 ra2Var) {
/* 1 */             ec0 ec0Var = hu0.f9294b;
/* 6 */             this.f20034a = ra2Var;
/* 18 */            if (((tj1) ra2Var.f15958d).f17128a.isEmpty()) {
/* 45 */                this.f20035b = ec0Var;
/* 47 */                this.f20036c = ec0Var;
/* 49 */                return;
                    }
/* 28 */            sk1 sk1Var = (sk1) tk1.f17133b.f17135a.get();
/* 32 */            sk1Var = sk1Var == null ? tk1.f17134c : sk1Var;
/* 34 */            hu0.m4336e0(ra2Var);
/* 37 */            sk1Var.getClass();
/* 40 */            this.f20035b = ec0Var;
/* 42 */            this.f20036c = ec0Var;
                }

                @Override // p000.wa1
                /* JADX INFO: renamed from: a */
                public final void mo1178a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 1 */             int length = bArr.length;
/* 2 */             ec0 ec0Var = this.f20036c;
/* 5 */             if (length <= 5) {
/* 134 */               ec0Var.getClass();
/* 139 */               ds0.m3203t("tag too short");
/* 142 */               return;
                    }
/* 7 */             byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
/* 12 */            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
/* 16 */            ra2 ra2Var = this.f20034a;
/* 30 */            for (lx1 lx1Var : ra2Var.m8108m(bArrCopyOf)) {
                        try {
/* 64 */                    ((wa1) lx1Var.f13519b).mo1178a(bArrCopyOfRange, lx1Var.f13522e.equals(wq1.LEGACY) ? k50.m5965b(bArr2, ab1.f161b) : bArr2);
/* 67 */                    ec0Var.getClass();
/* 124 */                   return;
                        } catch (GeneralSecurityException e) {
/* 88 */                    ab1.f160a.info("tag prefix matches a key, but cannot verify: " + e);
                        }
                    }
/* 98 */            Iterator it = ra2Var.m8108m(jb1.f12170b).iterator();
/* 106 */           while (it.hasNext()) {
                        try {
/* 118 */                   ((wa1) ((lx1) it.next()).f13519b).mo1178a(bArr, bArr2);
/* 121 */                   ec0Var.getClass();
/* 124 */                   return;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
/* 125 */           ec0Var.getClass();
/* 130 */           ds0.m3203t("invalid MAC");
                }

                @Override // p000.wa1
                /* JADX INFO: renamed from: b */
                public final byte[] mo1179b(byte[] bArr) throws GeneralSecurityException {
/* 1 */             ec0 ec0Var = this.f20035b;
/* 7 */             lx1 lx1Var = (lx1) this.f20034a.f15957c;
/* 17 */            if (lx1Var.f13522e.equals(wq1.LEGACY)) {
/* 25 */                bArr = k50.m5965b(bArr, ab1.f161b);
                    }
                    try {
/* 29 */                byte[] bArr2 = lx1Var.f13520c;
/* 52 */                byte[] bArrM5965b = k50.m5965b(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((wa1) lx1Var.f13519b).mo1179b(bArr));
/* 56 */                int i = lx1Var.f13523f;
/* 58 */                ec0Var.getClass();
/* 61 */                return bArrM5965b;
                    } catch (GeneralSecurityException e) {
/* 63 */                ec0Var.getClass();
/* 66 */                throw e;
                    }
                }
            }
