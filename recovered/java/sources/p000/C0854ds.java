            package p000;

            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            
            /* JADX INFO: renamed from: ds */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0854ds extends AbstractC0867e4 {
                /* JADX INFO: renamed from: J */
                public static C0854ds m3186J(C0204c5 c0204c5, fs0 fs0Var, Integer num) throws GeneralSecurityException {
/* 3 */             C2335wl c2335wl = (C2335wl) fs0Var.f8339b;
/* 5 */             C0204c5 c0204c6 = C0204c5.f2711m;
/* 8 */             if (c0204c5 != c0204c6 && num == null) {
/* 17 */                ds0.m3205v(c0204c5, "For given Variant ", " the value of idRequirement must be non-null");
/* 7 */                 return null;
                    }
/* 21 */            if (c0204c5 == c0204c6 && num != null) {
/* 28 */                ds0.m3203t("For given Variant NO_PREFIX the value of idRequirement must be null");
/* 7 */                 return null;
                    }
/* 37 */            if (c2335wl.f18678a.length != 32) {
/* 139 */               throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c2335wl.f18678a.length);
                    }
/* 42 */            if (c0204c5 == c0204c6) {
/* 46 */                C2335wl.m9584a(new byte[0]);
                    } else if (c0204c5 == C0204c5.f2710l) {
/* 75 */                C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                    } else {
/* 81 */                if (c0204c5 != C0204c5.f2709k) {
/* 113 */                   ds0.m3204u(c0204c5, "Unknown Variant: ");
/* 7 */                     return null;
                        }
/* 104 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                    }
/* 107 */           return new C0854ds();
                }
            }
