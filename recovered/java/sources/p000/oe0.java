            package p000;

            import java.util.Arrays;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oe0 implements KSerializer {

                /* JADX INFO: renamed from: a */
                public final Enum[] f14719a;

                /* JADX INFO: renamed from: b */
                public final hk2 f14720b;

                public oe0(String str, Enum[] enumArr) {
/* 1 */             str.getClass();
/* 4 */             enumArr.getClass();
/* 10 */            this.f14719a = enumArr;
/* 22 */            this.f14720b = r51.m8065b(new C1908lz(2, this, str));
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 5 */             int iMo4362h = decoder.mo4362h(getDescriptor());
/* 9 */             Enum[] enumArr = this.f14719a;
/* 11 */            if (iMo4362h >= 0 && iMo4362h < enumArr.length) {
/* 16 */                return enumArr[iMo4362h];
                    }
/* 61 */            throw new ea2(iMo4362h + " is not among valid " + getDescriptor().mo130a() + " enum values, values size is " + enumArr.length);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 7 */             return (SerialDescriptor) this.f14720b.getValue();
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             Enum r5 = (Enum) obj;
/* 3 */             r5.getClass();
/* 6 */             Enum[] enumArr = this.f14719a;
/* 8 */             int iM7774i = C2103qd.m7774i(enumArr, r5);
/* 13 */            if (iM7774i != -1) {
/* 19 */                encoder.mo1518v(getDescriptor(), iM7774i);
/* 22 */                return;
                    }
/* 27 */            StringBuilder sb = new StringBuilder();
/* 30 */            sb.append(r5);
/* 37 */            String strMo130a = getDescriptor().mo130a();
/* 41 */            String string = Arrays.toString(enumArr);
/* 45 */            string.getClass();
/* 50 */            sb.append(" is not a valid enum ");
/* 53 */            sb.append(strMo130a);
/* 58 */            sb.append(", must be one of ");
/* 61 */            sb.append(string);
/* 71 */            throw new ea2(sb.toString());
                }

                public final String toString() {
/* 24 */            return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo130a() + '>';
                }
            }
