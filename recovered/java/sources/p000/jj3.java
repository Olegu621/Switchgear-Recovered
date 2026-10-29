            package p000;

            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class jj3 {

                /* JADX INFO: renamed from: a */
                public static final lj3 f12333a;

                static {
                    lj3 lj3VarM6993a;
                    try {
/* 2 */                 lj3VarM6993a = nj3.m6993a();
                    } catch (NoClassDefFoundError unused) {
/* 7 */                 lj3VarM6993a = null;
                    }
/* 8 */             if (lj3VarM6993a == null) {
/* 13 */                StringBuilder sb = new StringBuilder();
/* 19 */                for (int i = 0; i < 3; i++) {
/* 23 */                    String str = lj3.f13333a[i];
                            try {
/* 37 */                        lj3VarM6993a = (lj3) Class.forName(str).getConstructor(null).newInstance(null);
                            } catch (Throwable th) {
/* 43 */                        th = th;
/* 46 */                        if (th instanceof InvocationTargetException) {
/* 48 */                            th = th.getCause();
                                }
/* 54 */                        sb.append('\n');
/* 57 */                        sb.append(str);
/* 62 */                        sb.append(": ");
/* 65 */                        sb.append(th);
                            }
                        }
/* 86 */                throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
                    }
/* 40 */            f12333a = lj3VarM6993a;
                }
            }
