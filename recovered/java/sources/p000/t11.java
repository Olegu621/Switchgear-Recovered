            package p000;

            import java.util.Iterator;
            import kotlin.text.AbstractC1856i;
            import kotlin.text.C1850c;
            import kotlin.text.C1851d;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class t11 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public static final t11 f16894a = new t11();

                /* JADX INFO: renamed from: b */
                public static final kx1 f16895b;

                static {
/* 8 */             gx1 gx1Var = gx1.f8844s;
/* 16 */            if (StringsKt.m6228D("kotlinx.serialization.json.JsonLiteral")) {
/* 121 */               C1951n4.m6859j("Blank serial names are prohibited");
/* 124 */               return;
                    }
/* 24 */            Iterator it = ox1.f14912a.keySet().iterator();
/* 32 */            while (it.hasNext()) {
/* 42 */                String strM3242b = ((C0857dv) ((o21) it.next())).m3242b();
/* 46 */                strM3242b.getClass();
/* 49 */                String strM7242a = ox1.m7242a(strM3242b);
/* 71 */                if ("kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase("kotlin." + strM7242a) || "kotlinx.serialization.json.JsonLiteral".equalsIgnoreCase(strM7242a)) {
/* 107 */                   C1951n4.m6859j(C1850c.m6253b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + ox1.m7242a(strM7242a) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
/* 110 */                   return;
                        }
                    }
/* 116 */           f16895b = new kx1("kotlinx.serialization.json.JsonLiteral", gx1Var);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 5 */             AbstractC1858b abstractC1858bMo5635m = jb1.m5746f(decoder).mo5635m();
/* 11 */            if (abstractC1858bMo5635m instanceof s11) {
/* 13 */                return (s11) abstractC1858bMo5635m;
                    }
/* 47 */            throw kb1.m6051d("Unexpected JSON element, expected JsonLiteral, had " + j22.m5667a(abstractC1858bMo5635m.getClass()), abstractC1858bMo5635m.toString(), -1);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 1 */             return f16895b;
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
                    Double dValueOf;
/* 1 */             s11 s11Var = (s11) obj;
/* 3 */             s11Var.getClass();
/* 6 */             jb1.m5747g(encoder);
/* 9 */             boolean z = s11Var.f16379a;
/* 11 */            String str = s11Var.f16380b;
/* 13 */            if (z) {
/* 15 */                encoder.mo1489F(str);
/* 18 */                return;
                    }
/* 19 */            Long lM6238N = StringsKt.m6238N(str);
/* 23 */            if (lM6238N != null) {
/* 29 */                encoder.mo1485B(lM6238N.longValue());
/* 32 */                return;
                    }
/* 33 */            sw2 sw2VarM6268e = AbstractC1856i.m6268e(str);
/* 37 */            if (sw2VarM6268e != null) {
/* 39 */                long j = sw2VarM6268e.f16830a;
/* 43 */                sw2.f16829b.getClass();
/* 52 */                encoder.mo1522z(ww2.f18848b).mo1485B(j);
/* 55 */                return;
                    }
/* 56 */            str.getClass();
                    try {
/* 74 */                dValueOf = C1851d.m6255d(str) ? Double.valueOf(Double.parseDouble(str)) : null;
                    } catch (NumberFormatException unused) {
                    }
/* 75 */            if (dValueOf != null) {
/* 81 */                encoder.mo1503g(dValueOf.doubleValue());
/* 102 */               return;
                    }
/* 85 */            Boolean boolM8508b = sh2.m8508b(str);
/* 89 */            if (boolM8508b != null) {
/* 95 */                encoder.mo1507k(boolM8508b.booleanValue());
                    } else {
/* 99 */                encoder.mo1489F(str);
                    }
                }
            }
