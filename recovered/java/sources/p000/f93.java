            package p000;

            import android.os.Build;
            import android.os.Process;
            import android.os.WorkSource;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class f93 {

                /* JADX INFO: renamed from: a */
                public static final Method f8048a;

                /* JADX INFO: renamed from: b */
                public static final Method f8049b;

                /* JADX INFO: renamed from: c */
                public static Boolean f8050c;

                static {
                    Method method;
                    Method method2;
/* 5 */             Class cls = Integer.TYPE;
/* 9 */             Process.myUid();
                    try {
/* 17 */                method = WorkSource.class.getMethod("add", cls);
                    } catch (Exception unused) {
/* 22 */                method = null;
                    }
/* 23 */            f8048a = method;
                    try {
/* 29 */                method2 = WorkSource.class.getMethod("add", cls, String.class);
                    } catch (Exception unused2) {
/* 34 */                method2 = null;
                    }
/* 35 */            f8049b = method2;
                    try {
/* 39 */                WorkSource.class.getMethod("size", null);
                    } catch (Exception unused3) {
                    }
                    try {
/* 48 */                WorkSource.class.getMethod("get", cls);
                    } catch (Exception unused4) {
                    }
                    try {
/* 57 */                WorkSource.class.getMethod("getName", cls);
                    } catch (Exception unused5) {
                    }
/* 66 */            if (Build.VERSION.SDK_INT >= 28) {
                        try {
/* 70 */                    WorkSource.class.getMethod("createWorkChain", null);
                        } catch (Exception e) {
/* 77 */                    AbstractC1245n0.m4891s("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
                        }
                    }
/* 82 */            if (Build.VERSION.SDK_INT >= 28) {
                        try {
/* 96 */                    Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
                        } catch (Exception e2) {
/* 103 */                   AbstractC1245n0.m4891s("WorkSourceUtil", "Missing WorkChain class", e2);
                        }
                    }
/* 108 */           if (Build.VERSION.SDK_INT >= 28) {
                        try {
/* 117 */                   WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
                        } catch (Exception unused6) {
                        }
                    }
/* 120 */           f8050c = null;
                }
            }
