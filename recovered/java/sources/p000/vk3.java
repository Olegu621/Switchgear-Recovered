            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class vk3 {

                /* JADX INFO: renamed from: a */
                public static final yk3 f18233a;

                static {
                    yk3 yk3Var;
/* 5 */             String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
/* 11 */            for (int i = 0; i < 2; i++) {
/* 15 */                yk3Var = null;
                        try {
/* 34 */                    yk3Var = (yk3) Class.forName(strArr[i]).asSubclass(yk3.class).getDeclaredConstructor(null).newInstance(null);
                        } catch (Throwable unused) {
                        }
/* 37 */                if (yk3Var != null) {
/* 48 */                    f18233a = yk3Var;
                        }
                    }
/* 45 */            yk3Var = new yk3();
/* 48 */            f18233a = yk3Var;
                }
            }
