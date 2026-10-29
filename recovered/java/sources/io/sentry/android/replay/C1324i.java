            package io.sentry.android.replay;

            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1324i extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public static final C1324i f10545a = new C1324i(1);

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             Map.Entry entry = (Map.Entry) obj;
/* 3 */             entry.getClass();
/* 34 */            return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
                }
            }
