            package p000;

            import android.os.Build;
            import android.os.Trace;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class oq2 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f14866a = 0;

                static {
/* 9 */             if (Build.VERSION.SDK_INT < 29) {
                        try {
/* 18 */                    Trace.class.getField("TRACE_TAG_APP").getLong(null);
/* 23 */                    Class cls = Long.TYPE;
/* 29 */                    Trace.class.getMethod("isTagEnabled", cls);
/* 34 */                    Class cls2 = Integer.TYPE;
/* 40 */                    Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
/* 49 */                    Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
/* 58 */                    Trace.class.getMethod("traceCounter", cls, String.class, cls2);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
