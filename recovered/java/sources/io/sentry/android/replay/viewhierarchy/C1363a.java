            package io.sentry.android.replay.viewhierarchy;

            import androidx.compose.ui.node.LayoutNode;
            import java.lang.reflect.Method;
            import kotlin.jvm.functions.Function0;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1363a extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public static final C1363a f10680a = new C1363a(0);

                /* JADX INFO: renamed from: b */
                public static Method m5042b() {
                    try {
/* 6 */                 Method declaredMethod = LayoutNode.class.getDeclaredMethod("getCollapsedSemantics$ui_release", null);
/* 11 */                declaredMethod.setAccessible(true);
/* 14 */                return declaredMethod;
                    } catch (Throwable unused) {
/* 1 */                 return null;
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Object invoke() {
/* 1 */             return m5042b();
                }
            }
