            package p000;

            import java.util.Arrays;
            import java.util.List;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class n72 {

                /* JADX INFO: renamed from: a */
                public static final Class f14156a;

                /* JADX INFO: renamed from: b */
                public static final ux2 f14157b;

                /* JADX INFO: renamed from: c */
                public static final ux2 f14158c;

                static {
                    Class<?> cls;
                    Class<?> cls2;
/* 1 */             cz1 cz1Var = cz1.f6940c;
/* 3 */             ux2 ux2Var = null;
                    try {
/* 6 */                 cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 11 */                cls = null;
                    }
/* 12 */            f14156a = cls;
                    try {
/* 14 */                cz1 cz1Var2 = cz1.f6940c;
                        try {
/* 18 */                    cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
                        } catch (Throwable unused2) {
/* 23 */                    cls2 = null;
                        }
/* 24 */                if (cls2 != null) {
/* 35 */                    ux2Var = (ux2) cls2.getConstructor(null).newInstance(null);
                        }
                    } catch (Throwable unused3) {
                    }
/* 38 */            f14157b = ux2Var;
/* 45 */            f14158c = new ux2();
                }

                /* JADX INFO: renamed from: a */
                public static int m6917a(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6543j = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 27 */                iM6543j += C1905lw.m6543j(((Integer) list.get(i)).intValue());
                    }
/* 31 */            return iM6543j;
                }

                /* JADX INFO: renamed from: b */
                public static int m6918b(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return (C1905lw.m6541h(i) + 4) * size;
                }

                /* JADX INFO: renamed from: c */
                public static int m6919c(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 15 */            return (C1905lw.m6541h(i) + 8) * size;
                }

                /* JADX INFO: renamed from: d */
                public static int m6920d(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6543j = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 27 */                iM6543j += C1905lw.m6543j(((Integer) list.get(i)).intValue());
                    }
/* 31 */            return iM6543j;
                }

                /* JADX INFO: renamed from: e */
                public static int m6921e(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6543j = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6543j += C1905lw.m6543j(((Long) list.get(i)).longValue());
                    }
/* 30 */            return iM6543j;
                }

                /* JADX INFO: renamed from: f */
                public static int m6922f(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6542i = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 18 */                int iIntValue = ((Integer) list.get(i)).intValue();
/* 31 */                iM6542i += C1905lw.m6542i((iIntValue >> 31) ^ (iIntValue << 1));
                    }
/* 35 */            return iM6542i;
                }

                /* JADX INFO: renamed from: g */
                public static int m6923g(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6543j = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 18 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 33 */                iM6543j += C1905lw.m6543j((jLongValue >> 63) ^ (jLongValue << 1));
                    }
/* 37 */            return iM6543j;
                }

                /* JADX INFO: renamed from: h */
                public static int m6924h(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6542i = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6542i += C1905lw.m6542i(((Integer) list.get(i)).intValue());
                    }
/* 30 */            return iM6542i;
                }

                /* JADX INFO: renamed from: i */
                public static int m6925i(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6543j = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6543j += C1905lw.m6543j(((Long) list.get(i)).longValue());
                    }
/* 30 */            return iM6543j;
                }

                /* JADX INFO: renamed from: j */
                public static Object m6926j(Object obj, int i, dz0 dz0Var, Object obj2, ux2 ux2Var) {
/* 1 */             return obj2;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: k */
                public static void m6927k(ux2 ux2Var, Object obj, Object obj2) {
/* 1 */             ux2Var.getClass();
/* 4 */             tq0 tq0Var = (tq0) obj;
/* 6 */             sx2 sx2Var = tq0Var.unknownFields;
/* 10 */            sx2 sx2Var2 = ((tq0) obj2).unknownFields;
/* 12 */            sx2 sx2Var3 = sx2.f16858f;
/* 18 */            if (!sx2Var3.equals(sx2Var2)) {
/* 26 */                if (sx2Var3.equals(sx2Var)) {
/* 32 */                    int i = sx2Var.f16859a + sx2Var2.f16859a;
/* 35 */                    int[] iArrCopyOf = Arrays.copyOf(sx2Var.f16860b, i);
/* 45 */                    System.arraycopy(sx2Var2.f16860b, 0, iArrCopyOf, sx2Var.f16859a, sx2Var2.f16859a);
/* 50 */                    Object[] objArrCopyOf = Arrays.copyOf(sx2Var.f16861c, i);
/* 60 */                    System.arraycopy(sx2Var2.f16861c, 0, objArrCopyOf, sx2Var.f16859a, sx2Var2.f16859a);
/* 66 */                    sx2Var = new sx2(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 70 */                    sx2Var.getClass();
/* 77 */                    if (!sx2Var2.equals(sx2Var3)) {
/* 82 */                        if (!sx2Var.f16863e) {
/* 119 */                           f42.m3660p();
/* 122 */                           return;
                                }
/* 88 */                        int i2 = sx2Var.f16859a + sx2Var2.f16859a;
/* 89 */                        sx2Var.m8657a(i2);
/* 100 */                       System.arraycopy(sx2Var2.f16860b, 0, sx2Var.f16860b, sx2Var.f16859a, sx2Var2.f16859a);
/* 111 */                       System.arraycopy(sx2Var2.f16861c, 0, sx2Var.f16861c, sx2Var.f16859a, sx2Var2.f16859a);
/* 114 */                       sx2Var.f16859a = i2;
                            }
                        }
                    }
/* 116 */           tq0Var.unknownFields = sx2Var;
                }

                /* JADX INFO: renamed from: l */
                public static boolean m6928l(Object obj, Object obj2) {
/* 1 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 14 */            return true;
                }

                /* JADX INFO: renamed from: m */
                public static void m6929m(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 92 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 74 */                while (i2 < list.size()) {
/* 86 */                    c1905lw.m6559o(i, ((Boolean) list.get(i2)).booleanValue());
/* 89 */                    i2++;
                        }
/* 92 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Boolean) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3++;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 64 */                c1905lw.m6557m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 67 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: n */
                public static void m6930n(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 102 */               return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 77 */                while (i2 < list.size()) {
/* 85 */                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
/* 89 */                    c1905lw.getClass();
/* 96 */                    c1905lw.m6564t(i, Double.doubleToRawLongBits(dDoubleValue));
/* 99 */                    i2++;
                        }
/* 102 */               return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Double) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3 += 8;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 67 */                c1905lw.m6565u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 70 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: o */
                public static void m6931o(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 94 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 76 */                while (i2 < list.size()) {
/* 88 */                    c1905lw.m6566v(i, ((Integer) list.get(i2)).intValue());
/* 91 */                    i2++;
                        }
/* 94 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int iM6543j = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 43 */                iM6543j += C1905lw.m6543j(((Integer) list.get(i3)).intValue());
                    }
/* 47 */            c1905lw.m6547D(iM6543j);
/* 54 */            while (i2 < list.size()) {
/* 66 */                c1905lw.m6567w(((Integer) list.get(i2)).intValue());
/* 69 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: p */
                public static void m6932p(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1905lw.m6562r(i, ((Integer) list.get(i2)).intValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3 += 4;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1905lw.m6563s(((Integer) list.get(i2)).intValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: q */
                public static void m6933q(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1905lw.m6564t(i, ((Long) list.get(i2)).longValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3 += 8;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1905lw.m6565u(((Long) list.get(i2)).longValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static void m6934r(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 102 */               return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 77 */                while (i2 < list.size()) {
/* 85 */                    float fFloatValue = ((Float) list.get(i2)).floatValue();
/* 89 */                    c1905lw.getClass();
/* 96 */                    c1905lw.m6562r(i, Float.floatToRawIntBits(fFloatValue));
/* 99 */                    i2++;
                        }
/* 102 */               return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Float) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3 += 4;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 67 */                c1905lw.m6563s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 70 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: s */
                public static void m6935s(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 94 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 76 */                while (i2 < list.size()) {
/* 88 */                    c1905lw.m6566v(i, ((Integer) list.get(i2)).intValue());
/* 91 */                    i2++;
                        }
/* 94 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int iM6543j = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 43 */                iM6543j += C1905lw.m6543j(((Integer) list.get(i3)).intValue());
                    }
/* 47 */            c1905lw.m6547D(iM6543j);
/* 54 */            while (i2 < list.size()) {
/* 66 */                c1905lw.m6567w(((Integer) list.get(i2)).intValue());
/* 69 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: t */
                public static void m6936t(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    c1905lw.m6548E(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int iM6543j = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6543j += C1905lw.m6543j(((Long) list.get(i3)).longValue());
                    }
/* 46 */            c1905lw.m6547D(iM6543j);
/* 53 */            while (i2 < list.size()) {
/* 65 */                c1905lw.m6549F(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: u */
                public static void m6937u(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1905lw.m6562r(i, ((Integer) list.get(i2)).intValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3 += 4;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1905lw.m6563s(((Integer) list.get(i2)).intValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: v */
                public static void m6938v(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 91 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 73 */                while (i2 < list.size()) {
/* 85 */                    c1905lw.m6564t(i, ((Long) list.get(i2)).longValue());
/* 88 */                    i2++;
                        }
/* 91 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                Logger logger = C1905lw.f13504f;
/* 39 */                i3 += 8;
                    }
/* 44 */            c1905lw.m6547D(i3);
/* 51 */            while (i2 < list.size()) {
/* 63 */                c1905lw.m6565u(((Long) list.get(i2)).longValue());
/* 66 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: w */
                public static void m6939w(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 108 */               return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 85 */                while (i2 < list.size()) {
/* 93 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 102 */                   c1905lw.m6546C(i, (iIntValue >> 31) ^ (iIntValue << 1));
/* 105 */                   i2++;
                        }
/* 108 */               return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int iM6542i = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 34 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 47 */                iM6542i += C1905lw.m6542i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                    }
/* 51 */            c1905lw.m6547D(iM6542i);
/* 58 */            while (i2 < list.size()) {
/* 66 */                int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 75 */                c1905lw.m6547D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
/* 78 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: x */
                public static void m6940x(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 108 */               return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 16 */            int i2 = 0;
/* 17 */            if (!z) {
/* 86 */                while (i2 < list.size()) {
/* 94 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 102 */                   c1905lw.m6548E(i, (jLongValue >> 63) ^ (jLongValue << 1));
/* 105 */                   i2++;
                        }
/* 108 */               return;
                    }
/* 20 */            c1905lw.m6545B(i, 2);
/* 24 */            int iM6543j = 0;
/* 29 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 37 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 49 */                iM6543j += C1905lw.m6543j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    }
/* 53 */            c1905lw.m6547D(iM6543j);
/* 60 */            while (i2 < list.size()) {
/* 68 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 76 */                c1905lw.m6549F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
/* 79 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: y */
                public static void m6941y(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    c1905lw.m6546C(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int iM6542i = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6542i += C1905lw.m6542i(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            c1905lw.m6547D(iM6542i);
/* 53 */            while (i2 < list.size()) {
/* 65 */                c1905lw.m6547D(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: z */
                public static void m6942z(int i, List list, gr0 gr0Var, boolean z) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            C1905lw c1905lw = (C1905lw) gr0Var.f8789a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    c1905lw.m6548E(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            c1905lw.m6545B(i, 2);
/* 21 */            int iM6543j = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6543j += C1905lw.m6543j(((Long) list.get(i3)).longValue());
                    }
/* 46 */            c1905lw.m6547D(iM6543j);
/* 53 */            while (i2 < list.size()) {
/* 65 */                c1905lw.m6549F(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }
            }
