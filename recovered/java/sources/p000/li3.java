            package p000;

            import java.util.Arrays;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class li3 {
                static {
/* 1 */             Locale locale = Locale.ROOT;
                }

                /* JADX INFO: renamed from: a */
                public static String m6459a(Object obj) {
                    String simpleName;
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
                    try {
/* 17 */                if (!obj.getClass().isArray()) {
/* 19 */                    String string = obj.toString();
                            return string != null ? string : m6460b(obj, "toString() returned null");
                        }
/* 35 */                if (obj instanceof int[]) {
/* 40 */                    return Arrays.toString((int[]) obj);
                        }
/* 47 */                if (obj instanceof long[]) {
/* 52 */                    return Arrays.toString((long[]) obj);
                        }
/* 59 */                if (obj instanceof byte[]) {
/* 64 */                    return Arrays.toString((byte[]) obj);
                        }
/* 71 */                if (obj instanceof char[]) {
/* 76 */                    return Arrays.toString((char[]) obj);
                        }
/* 83 */                if (obj instanceof short[]) {
/* 88 */                    return Arrays.toString((short[]) obj);
                        }
/* 95 */                if (obj instanceof float[]) {
/* 100 */                   return Arrays.toString((float[]) obj);
                        }
/* 107 */               if (obj instanceof double[]) {
/* 112 */                   return Arrays.toString((double[]) obj);
                        }
                        return obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
                    } catch (RuntimeException e) {
                        try {
/* 137 */                   simpleName = e.toString();
                        } catch (RuntimeException e2) {
/* 147 */                   simpleName = e2.getClass().getSimpleName();
                        }
/* 151 */               return m6460b(obj, simpleName);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m6460b(Object obj, String str) {
/* 5 */             String name = obj.getClass().getName();
/* 9 */             int iIdentityHashCode = System.identityHashCode(obj);
/* 13 */            int length = name.length();
/* 43 */            StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(iIdentityHashCode).length() + 2 + String.valueOf(str).length() + 1);
/* 48 */            sb.append("{");
/* 51 */            sb.append(name);
/* 56 */            sb.append("@");
/* 59 */            sb.append(iIdentityHashCode);
/* 66 */            return fm0.m3790p(sb, ": ", str, "}");
                }
            }
