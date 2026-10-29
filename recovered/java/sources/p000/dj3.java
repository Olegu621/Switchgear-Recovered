            package p000;

            import android.os.Process;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class dj3 {

                /* JADX INFO: renamed from: a */
                public static final HashMap f7274a;

                static {
/* 15 */            new HashSet(Arrays.asList("app_update", "review"));
/* 32 */            new HashSet(Arrays.asList("native", "unity"));
/* 40 */            f7274a = new HashMap();
/* 79 */            ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("PlayCoreVersion");
                }
            }
