            package io.sentry.android.core.internal.tombstone;

            import android.os.Bundle;
            import io.sentry.android.core.C1268s;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.DebugImage;
            import p000.do3;
            import p000.ij3;
            import p000.ki3;
            import p000.lm3;
            import p000.lo3;
            import p000.sl3;
            import p000.uh3;
            import p000.up3;
            import p000.vg3;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.tombstone.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1212b {

                /* JADX INFO: renamed from: a */
                public long f10127a;

                /* JADX INFO: renamed from: b */
                public long f10128b;

                /* JADX INFO: renamed from: c */
                public Object f10129c;

                /* JADX INFO: renamed from: d */
                public Object f10130d;

                /* JADX INFO: renamed from: a */
                public DebugImage m4821a() {
/* 1 */             long j = this.f10127a;
/* 5 */             String str = (String) this.f10130d;
/* 11 */            if (str.isEmpty()) {
/* 13 */                return null;
                    }
/* 17 */            DebugImage debugImage = new DebugImage();
/* 20 */            debugImage.setCodeId(str);
/* 27 */            debugImage.setCodeFile((String) this.f10129c);
/* 30 */            String strM5163a = AbstractC1417a.m5163a(str);
/* 34 */            if (strM5163a != null) {
/* 36 */                str = strM5163a;
                    }
/* 37 */            debugImage.setDebugId(str);
/* 54 */            debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
/* 60 */            debugImage.setImageSize(this.f10128b - j);
/* 65 */            debugImage.setType("elf");
/* 68 */            return debugImage;
                }

                /* JADX INFO: renamed from: b */
                public boolean m4822b(long j, boolean z, boolean z2) {
/* 3 */             lo3 lo3Var = (lo3) this.f10130d;
/* 5 */             lo3Var.mo1375y();
/* 8 */             lo3Var.m9576A();
/* 13 */            ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 15 */            boolean zM4560d = ij3Var.m4560d();
/* 19 */            uh3 uh3Var = ij3Var.f9655f;
/* 21 */            if (zM4560d) {
/* 23 */                ki3 ki3Var = ij3Var.f9653e;
/* 25 */                ij3.m4553j(ki3Var);
/* 28 */                C1268s c1268s = ki3Var.f12801a0;
/* 32 */                ij3Var.f9640V.getClass();
/* 39 */                c1268s.m4933b(System.currentTimeMillis());
                    }
/* 44 */            long j2 = j - this.f10127a;
/* 46 */            if (!z && j2 < 1000) {
/* 55 */                ij3.m4555l(uh3Var);
/* 66 */                uh3Var.f17534Y.m8511b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
/* 69 */                return false;
                    }
/* 71 */            if (!z2) {
/* 75 */                j2 = j - this.f10128b;
/* 77 */                this.f10128b = j;
                    }
/* 79 */            ij3.m4555l(uh3Var);
/* 90 */            uh3Var.f17534Y.m8511b(Long.valueOf(j2), "Recording user engagement, ms");
/* 95 */            Bundle bundle = new Bundle();
/* 100 */           bundle.putLong("_et", j2);
/* 110 */           boolean z3 = !ij3Var.f9651d.m7410N();
/* 111 */           lm3 lm3Var = ij3Var.f9641W;
/* 113 */           ij3.m4554k(lm3Var);
/* 120 */           up3.m9072q0(lm3Var.m6503F(z3), bundle, true);
/* 123 */           if (!z2) {
/* 125 */               sl3 sl3Var = ij3Var.f9642X;
/* 127 */               ij3.m4554k(sl3Var);
/* 134 */               sl3Var.m8556G("auto", "_e", bundle);
                    }
/* 137 */           this.f10127a = j;
/* 141 */           do3 do3Var = (do3) this.f10129c;
/* 143 */           do3Var.m1349c();
/* 159 */           do3Var.m1348b(((Long) vg3.f18158q0.m9011a(null)).longValue());
/* 109 */           return true;
                }
            }
