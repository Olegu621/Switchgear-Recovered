            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.content.Context;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.ma3;
            import p000.z93;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.at */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0407at {

                /* JADX INFO: renamed from: a */
                private final ma3 f5191a;

                /* JADX INFO: renamed from: b */
                private final ma3 f5192b;

                public C0407at(ma3 ma3Var, ma3 ma3Var2) {
/* 4 */             this.f5191a = ma3Var;
/* 6 */             this.f5192b = ma3Var2;
                }

                /* JADX INFO: renamed from: a */
                public final BinderC0406as m2465a(Activity activity, TaskCompletionSource taskCompletionSource, z93 z93Var) {
/* 10 */            Context context = (Context) this.f5191a.mo2449a();
/* 12 */            context.getClass();
/* 22 */            InterfaceC0445k interfaceC0445k = (InterfaceC0445k) this.f5192b.mo2449a();
/* 24 */            interfaceC0445k.getClass();
/* 27 */            activity.getClass();
/* 30 */            z93Var.getClass();
/* 36 */            return new BinderC0406as(context, interfaceC0445k, activity, taskCompletionSource, z93Var);
                }
            }
