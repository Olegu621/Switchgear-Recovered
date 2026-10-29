            package p000;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cq3 {

                /* JADX INFO: renamed from: a */
                public static final Class f6887a;

                /* JADX INFO: renamed from: b */
                public static final nq3 f6888b;

                /* JADX INFO: renamed from: c */
                public static final nq3 f6889c;

                /* JADX INFO: renamed from: d */
                public static final nq3 f6890d;

                static {
                    Class<?> cls;
                    try {
/* 3 */                 cls = Class.forName("com.google.protobuf.GeneratedMessage");
                    } catch (Throwable unused) {
/* 8 */                 cls = null;
                    }
/* 9 */             f6887a = cls;
/* 16 */            f6888b = m2858o(false);
/* 23 */            f6889c = m2858o(true);
/* 30 */            f6890d = new nq3();
                }

                /* JADX INFO: renamed from: A */
                public static void m2835A(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 89 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    kn3Var.m6159d(i, ((Integer) list.get(i2)).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                kn3Var.m6166k(((Integer) list.get(i2)).intValue());
/* 64 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: B */
                public static void m2836B(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 98 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 89 */                    kn3Var.m6165j(i << 3);
/* 92 */                    kn3Var.m6164i(iIntValue);
/* 95 */                    i2++;
                        }
/* 98 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int iM6153o = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6153o += kn3.m6153o(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            kn3Var.m6165j(iM6153o);
/* 53 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6164i(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: C */
                public static void m2837C(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 94 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 79 */                    boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
/* 85 */                    kn3Var.m6165j(i << 3);
/* 88 */                    kn3Var.m6163h(zBooleanValue ? (byte) 1 : (byte) 0);
/* 91 */                    i2++;
                        }
/* 94 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Boolean) list.get(i4)).getClass();
/* 37 */                i3++;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                kn3Var.m6163h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 64 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: D */
                public static void m2838D(int i, List list, pi3 pi3Var) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 298 */               return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 15 */            int i2 = 0;
/* 16 */            if (!(list instanceof ap3)) {
/* 169 */               while (i2 < list.size()) {
/* 176 */                   String str = (String) list.get(i2);
/* 182 */                   kn3Var.m6165j((i << 3) | 2);
/* 185 */                   int i3 = kn3Var.f12899c;
/* 187 */                   byte[] bArr = kn3Var.f12898b;
/* 189 */                   int i4 = kn3Var.f12900d;
                            try {
/* 197 */                       int iM6154p = kn3.m6154p(str.length() * 3);
/* 205 */                       int iM6154p2 = kn3.m6154p(str.length());
/* 209 */                       if (iM6154p2 == iM6154p) {
/* 211 */                           int i5 = i4 + iM6154p2;
/* 213 */                           kn3Var.f12900d = i5;
/* 216 */                           int iM10425b = zq3.m10425b(str, bArr, i5, i3 - i5);
/* 220 */                           kn3Var.f12900d = i4;
/* 225 */                           kn3Var.m6165j((iM10425b - i4) - iM6154p2);
/* 228 */                           kn3Var.f12900d = iM10425b;
                                } else {
/* 238 */                           kn3Var.m6165j(zq3.m10424a(str));
/* 241 */                           int i6 = kn3Var.f12900d;
/* 248 */                           kn3Var.f12900d = zq3.m10425b(str, bArr, i6, i3 - i6);
                                }
                            } catch (IndexOutOfBoundsException e) {
/* 258 */                       throw new C1868kw(e);
                            } catch (uq3 e2) {
/* 259 */                       kn3Var.f12900d = i4;
/* 271 */                       kn3.f12895e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
/* 276 */                       byte[] bytes = str.getBytes(so3.f16726a);
                                try {
/* 280 */                           int length = bytes.length;
/* 281 */                           kn3Var.m6165j(length);
/* 284 */                           kn3Var.m6169n(bytes, length);
                                } catch (IndexOutOfBoundsException e3) {
/* 297 */                           throw new C1868kw(e3);
                                }
                            }
/* 287 */                   i2++;
                        }
/* 298 */               return;
                    }
/* 19 */            ap3 ap3Var = (ap3) list;
/* 25 */            while (i2 < list.size()) {
/* 27 */                Object objZzg = ap3Var.zzg(i2);
/* 33 */                if (objZzg instanceof String) {
/* 36 */                    String str2 = (String) objZzg;
/* 42 */                    kn3Var.m6165j((i << 3) | 2);
/* 45 */                    int i7 = kn3Var.f12899c;
/* 47 */                    byte[] bArr2 = kn3Var.f12898b;
/* 49 */                    int i8 = kn3Var.f12900d;
                            try {
/* 57 */                        int iM6154p3 = kn3.m6154p(str2.length() * 3);
/* 65 */                        int iM6154p4 = kn3.m6154p(str2.length());
/* 69 */                        if (iM6154p4 == iM6154p3) {
/* 71 */                            int i9 = i8 + iM6154p4;
/* 73 */                            kn3Var.f12900d = i9;
/* 76 */                            int iM10425b2 = zq3.m10425b(str2, bArr2, i9, i7 - i9);
/* 80 */                            kn3Var.f12900d = i8;
/* 85 */                            kn3Var.m6165j((iM10425b2 - i8) - iM6154p4);
/* 88 */                            kn3Var.f12900d = iM10425b2;
                                } else {
/* 98 */                            kn3Var.m6165j(zq3.m10424a(str2));
/* 101 */                           int i10 = kn3Var.f12900d;
/* 108 */                           kn3Var.f12900d = zq3.m10425b(str2, bArr2, i10, i7 - i10);
                                }
                            } catch (IndexOutOfBoundsException e4) {
/* 118 */                       throw new C1868kw(e4);
                            } catch (uq3 e5) {
/* 119 */                       kn3Var.f12900d = i8;
/* 131 */                       kn3.f12895e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
/* 136 */                       byte[] bytes2 = str2.getBytes(so3.f16726a);
                                try {
/* 140 */                           int length2 = bytes2.length;
/* 141 */                           kn3Var.m6165j(length2);
/* 144 */                           kn3Var.m6169n(bytes2, length2);
                                } catch (IndexOutOfBoundsException e6) {
/* 155 */                           throw new C1868kw(e6);
                                }
                            }
                        } else {
/* 158 */                   kn3Var.m6162g(i, (cn3) objZzg);
                        }
/* 161 */               i2++;
                    }
                }

                /* JADX INFO: renamed from: E */
                public static void m2839E(int i, List list, pi3 pi3Var) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 35 */                return;
                    }
/* 9 */             pi3Var.getClass();
/* 17 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 29 */                ((kn3) pi3Var.f15137a).m6162g(i, (cn3) list.get(i2));
                    }
                }

                /* JADX INFO: renamed from: F */
                public static int m2840F(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6155q = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6155q += kn3.m6155q(((Long) list.get(i)).longValue());
                    }
/* 30 */            return iM6155q;
                }

                /* JADX INFO: renamed from: G */
                public static int m2841G(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6155q = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6155q += kn3.m6155q(((Long) list.get(i)).longValue());
                    }
/* 30 */            return iM6155q;
                }

                /* JADX INFO: renamed from: H */
                public static int m2842H(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6155q = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 18 */                long jLongValue = ((Long) list.get(i)).longValue();
/* 32 */                iM6155q += kn3.m6155q((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    }
/* 36 */            return iM6155q;
                }

                /* JADX INFO: renamed from: I */
                public static int m2843I(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6153o = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6153o += kn3.m6153o(((Integer) list.get(i)).intValue());
                    }
/* 30 */            return iM6153o;
                }

                /* JADX INFO: renamed from: a */
                public static int m2844a(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6153o = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6153o += kn3.m6153o(((Integer) list.get(i)).intValue());
                    }
/* 30 */            return iM6153o;
                }

                /* JADX INFO: renamed from: b */
                public static int m2845b(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6154p = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 26 */                iM6154p += kn3.m6154p(((Integer) list.get(i)).intValue());
                    }
/* 30 */            return iM6154p;
                }

                /* JADX INFO: renamed from: c */
                public static int m2846c(List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 9 */             int iM6154p = 0;
/* 10 */            for (int i = 0; i < size; i++) {
/* 18 */                int iIntValue = ((Integer) list.get(i)).intValue();
/* 31 */                iM6154p += kn3.m6154p((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    }
/* 35 */            return iM6154p;
                }

                /* JADX INFO: renamed from: d */
                public static int m2847d(List list) {
/* 5 */             return list.size() * 4;
                }

                /* JADX INFO: renamed from: e */
                public static int m2848e(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (kn3.m6154p(i << 3) + 4) * size;
                }

                /* JADX INFO: renamed from: f */
                public static int m2849f(List list) {
/* 5 */             return list.size() * 8;
                }

                /* JADX INFO: renamed from: g */
                public static int m2850g(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             if (size == 0) {
/* 7 */                 return 0;
                    }
/* 17 */            return (kn3.m6154p(i << 3) + 8) * size;
                }

                /* JADX INFO: renamed from: h */
                public static int m2851h(int i, List list) {
/* 1 */             int size = list.size();
/* 5 */             int i2 = 0;
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 11 */            boolean z = list instanceof ap3;
/* 17 */            int iM6154p = kn3.m6154p(i << 3) * size;
/* 18 */            if (!z) {
/* 55 */                while (i2 < size) {
/* 57 */                    Object obj = list.get(i2);
/* 63 */                    if (obj instanceof cn3) {
/* 67 */                        int iMo320c = ((cn3) obj).mo320c();
/* 71 */                        iM6154p = pm2.m7494q(iMo320c, iMo320c, iM6154p);
                            } else {
/* 82 */                        iM6154p = kn3.m6156r((String) obj) + iM6154p;
                            }
/* 84 */                    i2++;
                        }
/* 87 */                return iM6154p;
                    }
/* 20 */            ap3 ap3Var = (ap3) list;
/* 22 */            while (i2 < size) {
/* 24 */                Object objZzg = ap3Var.zzg(i2);
/* 30 */                if (objZzg instanceof cn3) {
/* 34 */                    int iMo320c2 = ((cn3) objZzg).mo320c();
/* 38 */                    iM6154p = pm2.m7494q(iMo320c2, iMo320c2, iM6154p);
                        } else {
/* 49 */                    iM6154p = kn3.m6156r((String) objZzg) + iM6154p;
                        }
/* 51 */                i2++;
                    }
/* 54 */            return iM6154p;
                }

                /* JADX INFO: renamed from: i */
                public static int m2852i(int i, Object obj, bq3 bq3Var) {
/* 5 */             Logger logger = kn3.f12895e;
/* 7 */             int iMo3540b = ((tm3) obj).mo3540b(bq3Var);
/* 20 */            return kn3.m6154p(i << 3) + kn3.m6154p(iMo3540b) + iMo3540b;
                }

                /* JADX INFO: renamed from: j */
                public static int m2853j(int i, List list, bq3 bq3Var) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 15 */            int iM6154p = kn3.m6154p(i << 3) * size;
/* 16 */            for (int i2 = 0; i2 < size; i2++) {
/* 24 */                int iMo3540b = ((tm3) list.get(i2)).mo3540b(bq3Var);
/* 28 */                iM6154p = pm2.m7494q(iMo3540b, iMo3540b, iM6154p);
                    }
/* 35 */            return iM6154p;
                }

                /* JADX INFO: renamed from: k */
                public static int m2854k(int i, List list) {
/* 1 */             int size = list.size();
/* 6 */             if (size == 0) {
/* 5 */                 return 0;
                    }
/* 15 */            int iM6154p = kn3.m6154p(i << 3) * size;
/* 20 */            for (int i2 = 0; i2 < list.size(); i2++) {
/* 28 */                int iMo320c = ((cn3) list.get(i2)).mo320c();
/* 32 */                iM6154p = pm2.m7494q(iMo320c, iMo320c, iM6154p);
                    }
/* 39 */            return iM6154p;
                }

                /* JADX INFO: renamed from: l */
                public static boolean m2855l(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: m */
                public static void m2856m(qn3 qn3Var, Object obj, Object obj2) {
/* 1 */             qn3Var.getClass();
/* 8 */             hq3 hq3Var = ((bo3) obj2).zza.f17607a;
/* 14 */            if (hq3Var.isEmpty()) {
/* 98 */                return;
                    }
/* 16 */            bo3 bo3Var = (bo3) obj;
/* 18 */            un3 un3Var = bo3Var.zza;
/* 22 */            if (un3Var.f17608b) {
/* 28 */                bo3Var.zza = un3Var.clone();
                    }
/* 32 */            bo3Var.zza.getClass();
/* 42 */            if (hq3Var.f9203b.size() > 0) {
/* 80 */                Map.Entry entryM4265a = hq3Var.m4265a(0);
/* 88 */                if (entryM4265a.getKey() != null) {
/* 90 */                    C1697u2.m5431g();
/* 93 */                    return;
                        } else {
/* 94 */                    entryM4265a.getValue();
/* 97 */                    throw null;
                        }
                    }
/* 48 */            Iterator it = hq3Var.m4266b().iterator();
/* 56 */            if (it.hasNext()) {
/* 63 */                Map.Entry entry = (Map.Entry) it.next();
/* 69 */                if (entry.getKey() != null) {
/* 71 */                    C1697u2.m5431g();
                        } else {
/* 75 */                    entry.getValue();
/* 78 */                    throw null;
                        }
                    }
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
                /* JADX INFO: renamed from: n */
                public static void m2857n(nq3 nq3Var, Object obj, Object obj2) {
/* 1 */             nq3Var.getClass();
/* 4 */             eo3 eo3Var = (eo3) obj;
/* 6 */             mq3 mq3Var = eo3Var.zzc;
/* 10 */            mq3 mq3Var2 = ((eo3) obj2).zzc;
/* 12 */            mq3 mq3Var3 = mq3.f13977f;
/* 18 */            if (!mq3Var3.equals(mq3Var2)) {
/* 25 */                if (mq3Var3.equals(mq3Var)) {
/* 31 */                    int i = mq3Var.f13978a + mq3Var2.f13978a;
/* 34 */                    int[] iArrCopyOf = Arrays.copyOf(mq3Var.f13979b, i);
/* 44 */                    System.arraycopy(mq3Var2.f13979b, 0, iArrCopyOf, mq3Var.f13978a, mq3Var2.f13978a);
/* 49 */                    Object[] objArrCopyOf = Arrays.copyOf(mq3Var.f13980c, i);
/* 59 */                    System.arraycopy(mq3Var2.f13980c, 0, objArrCopyOf, mq3Var.f13978a, mq3Var2.f13978a);
/* 65 */                    mq3Var = new mq3(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 69 */                    mq3Var.getClass();
/* 76 */                    if (!mq3Var2.equals(mq3Var3)) {
/* 81 */                        if (!mq3Var.f13982e) {
/* 116 */                           f42.m3660p();
/* 119 */                           return;
                                }
/* 87 */                        int i2 = mq3Var.f13978a + mq3Var2.f13978a;
/* 88 */                        mq3Var.m6793e(i2);
/* 99 */                        System.arraycopy(mq3Var2.f13979b, 0, mq3Var.f13979b, mq3Var.f13978a, mq3Var2.f13978a);
/* 110 */                       System.arraycopy(mq3Var2.f13980c, 0, mq3Var.f13980c, mq3Var.f13978a, mq3Var2.f13978a);
/* 113 */                       mq3Var.f13978a = i2;
                            }
                        }
                    }
/* 120 */           eo3Var.zzc = mq3Var;
                }

                /* JADX INFO: renamed from: o */
                public static nq3 m2858o(boolean z) {
                    Class<?> cls;
                    try {
/* 4 */                 cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            if (cls != null) {
                        try {
/* 35 */                    return (nq3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
                        } catch (Throwable unused2) {
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: p */
                public static void m2859p(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 97 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 91 */                    kn3Var.m6161f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 94 */                    i2++;
                        }
/* 97 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Double) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6168m(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: q */
                public static void m2860q(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 97 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 91 */                    kn3Var.m6159d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 94 */                    i2++;
                        }
/* 97 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Float) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6166k(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: r */
                public static void m2861r(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    kn3Var.m6160e(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int iM6155q = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6155q += kn3.m6155q(((Long) list.get(i3)).longValue());
                    }
/* 46 */            kn3Var.m6165j(iM6155q);
/* 53 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6167l(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: s */
                public static void m2862s(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    kn3Var.m6160e(i, ((Long) list.get(i2)).longValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int iM6155q = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6155q += kn3.m6155q(((Long) list.get(i3)).longValue());
                    }
/* 46 */            kn3Var.m6165j(iM6155q);
/* 53 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6167l(((Long) list.get(i2)).longValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: t */
                public static void m2863t(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 107 */               return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 15 */            int i2 = 0;
/* 16 */            if (!z) {
/* 85 */                while (i2 < list.size()) {
/* 93 */                    long jLongValue = ((Long) list.get(i2)).longValue();
/* 101 */                   kn3Var.m6160e(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 104 */                   i2++;
                        }
/* 107 */               return;
                    }
/* 19 */            kn3Var.m6157b(i, 2);
/* 23 */            int iM6155q = 0;
/* 28 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 36 */                long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 48 */                iM6155q += kn3.m6155q((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                    }
/* 52 */            kn3Var.m6165j(iM6155q);
/* 59 */            while (i2 < list.size()) {
/* 67 */                long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 75 */                kn3Var.m6167l((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 78 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: u */
                public static void m2864u(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 89 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    kn3Var.m6161f(i, ((Long) list.get(i2)).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                kn3Var.m6168m(((Long) list.get(i2)).longValue());
/* 64 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: v */
                public static void m2865v(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 89 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    kn3Var.m6161f(i, ((Long) list.get(i2)).longValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Long) list.get(i4)).getClass();
/* 37 */                i3 += 8;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                kn3Var.m6168m(((Long) list.get(i2)).longValue());
/* 64 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: w */
                public static void m2866w(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 98 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 83 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 89 */                    kn3Var.m6165j(i << 3);
/* 92 */                    kn3Var.m6164i(iIntValue);
/* 95 */                    i2++;
                        }
/* 98 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int iM6153o = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6153o += kn3.m6153o(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            kn3Var.m6165j(iM6153o);
/* 53 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6164i(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: x */
                public static void m2867x(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 93 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 75 */                while (i2 < list.size()) {
/* 87 */                    kn3Var.m6158c(i, ((Integer) list.get(i2)).intValue());
/* 90 */                    i2++;
                        }
/* 93 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int iM6154p = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 42 */                iM6154p += kn3.m6154p(((Integer) list.get(i3)).intValue());
                    }
/* 46 */            kn3Var.m6165j(iM6154p);
/* 53 */            while (i2 < list.size()) {
/* 65 */                kn3Var.m6165j(((Integer) list.get(i2)).intValue());
/* 68 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: y */
                public static void m2868y(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 108 */               return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 85 */                while (i2 < list.size()) {
/* 93 */                    int iIntValue = ((Integer) list.get(i2)).intValue();
/* 102 */                   kn3Var.m6158c(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 105 */                   i2++;
                        }
/* 108 */               return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int iM6154p = 0;
/* 26 */            for (int i3 = 0; i3 < list.size(); i3++) {
/* 34 */                int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 47 */                iM6154p += kn3.m6154p((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                    }
/* 51 */            kn3Var.m6165j(iM6154p);
/* 58 */            while (i2 < list.size()) {
/* 66 */                int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 75 */                kn3Var.m6165j((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 78 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: z */
                public static void m2869z(int i, List list, pi3 pi3Var, boolean z) throws C1868kw {
/* 1 */             if (list == null || list.isEmpty()) {
/* 89 */                return;
                    }
/* 11 */            kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 13 */            int i2 = 0;
/* 14 */            if (!z) {
/* 71 */                while (i2 < list.size()) {
/* 83 */                    kn3Var.m6159d(i, ((Integer) list.get(i2)).intValue());
/* 86 */                    i2++;
                        }
/* 89 */                return;
                    }
/* 17 */            kn3Var.m6157b(i, 2);
/* 21 */            int i3 = 0;
/* 26 */            for (int i4 = 0; i4 < list.size(); i4++) {
/* 34 */                ((Integer) list.get(i4)).getClass();
/* 37 */                i3 += 4;
                    }
/* 42 */            kn3Var.m6165j(i3);
/* 49 */            while (i2 < list.size()) {
/* 61 */                kn3Var.m6166k(((Integer) list.get(i2)).intValue());
/* 64 */                i2++;
                    }
                }
            }
