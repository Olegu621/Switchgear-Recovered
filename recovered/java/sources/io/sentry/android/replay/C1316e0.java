            package io.sentry.android.replay;

            import android.view.View;
            import java.lang.ref.WeakReference;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import p000.b51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.e0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1316e0 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10514a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f10515b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1316e0(View view, int i) {
/* 6 */             super(1);
/* 1 */             this.f10514a = i;
/* 3 */             this.f10515b = view;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f10514a;
/* 3 */             View view = this.f10515b;
                    switch (i) {
                        case 0:
/* 26 */                    WeakReference weakReference = (WeakReference) obj;
/* 28 */                    weakReference.getClass();
/* 39 */                    return Boolean.valueOf(Intrinsics.m6216a(weakReference.get(), view));
                        default:
/* 8 */                     WeakReference weakReference2 = (WeakReference) obj;
/* 10 */                    weakReference2.getClass();
/* 21 */                    return Boolean.valueOf(Intrinsics.m6216a(weakReference2.get(), view));
                    }
                }
            }
