            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.util.concurrent.Executor;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fx2 implements Executor {

                /* JADX INFO: renamed from: a */
                public static final fx2 f8393a;

                /* JADX INFO: renamed from: b */
                public static final Handler f8394b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ fx2[] f8395c;

                static {
/* 6 */             fx2 fx2Var = new fx2("INSTANCE", 0);
/* 9 */             f8393a = fx2Var;
/* 15 */            f8395c = new fx2[]{fx2Var};
/* 26 */            f8394b = new Handler(Looper.getMainLooper());
                }

                public static fx2 valueOf(String str) {
/* 7 */             return (fx2) Enum.valueOf(fx2.class, str);
                }

                public static fx2[] values() {
/* 7 */             return (fx2[]) f8395c.clone();
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 3 */             f8394b.post(runnable);
                }
            }
