            package p000;

            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class hb0 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final hb0 f8996a = new hb0();

                /* JADX INFO: renamed from: b */
                public static final kx1 f8997b = new kx1("kotlin.time.Duration", gx1.f8844s);

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             eb0 eb0Var = fb0.f8059b;
/* 3 */             String strMo4372r = decoder.mo4372r();
/* 7 */             eb0Var.getClass();
/* 10 */            strMo4372r.getClass();
                    try {
/* 19 */                return new fb0(mn0.m6686b(strMo4372r));
                    } catch (IllegalArgumentException e) {
/* 37 */                throw new IllegalArgumentException(fm0.m3784j("Invalid ISO duration string format: '", strMo4372r, "'."), e);
                    }
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f8997b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
                    long j;
/* 5 */             long j2 = ((fb0) obj).f8062a;
/* 7 */             eb0 eb0Var = fb0.f8059b;
/* 11 */            StringBuilder sb = new StringBuilder();
/* 18 */            if (j2 < 0) {
/* 22 */                sb.append('-');
                    }
/* 27 */            sb.append("PT");
/* 30 */            boolean z = true;
/* 31 */            if (j2 < 0) {
/* 40 */                j = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
/* 41 */                int i = gb0.f8530a;
                    } else {
/* 44 */                j = j2;
                    }
/* 47 */            long jM3694j = fb0.m3694j(j, ib0.HOURS);
/* 69 */            int iM3694j = fb0.m3690f(j) ? 0 : (int) (fb0.m3694j(j, ib0.MINUTES) % 60);
/* 85 */            int iM3694j2 = fb0.m3690f(j) ? 0 : (int) (fb0.m3694j(j, ib0.SECONDS) % 60);
/* 86 */            int iM3688d = fb0.m3688d(j);
/* 94 */            if (fb0.m3690f(j2)) {
/* 96 */                jM3694j = 9999999999999L;
                    }
/* 107 */           boolean z2 = jM3694j != 0;
/* 115 */           boolean z3 = (iM3694j2 == 0 && iM3688d == 0) ? false : true;
/* 116 */           if (iM3694j == 0 && (!z3 || !z2)) {
/* 123 */               z = false;
                    }
/* 124 */           if (z2) {
/* 126 */               sb.append(jM3694j);
/* 131 */               sb.append('H');
                    }
/* 134 */           if (z) {
/* 136 */               sb.append(iM3694j);
/* 141 */               sb.append('M');
                    }
/* 144 */           if (z3 || (!z2 && !z)) {
/* 157 */               fb0.m3686b(sb, iM3694j2, iM3688d, 9, "S", true);
                    }
/* 166 */           encoder.mo1489F(sb.toString());
                }
            }
