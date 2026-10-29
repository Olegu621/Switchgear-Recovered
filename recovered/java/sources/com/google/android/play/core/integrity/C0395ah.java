            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.os.Bundle;
            import com.google.android.gms.tasks.Task;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.ah */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0395ah extends AbstractC0461y {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ BinderC0396ai f5163a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0395ah(BinderC0396ai binderC0396ai, String str, long j) {
/* 3 */             super(str, j);
/* 1 */             this.f5163a = binderC0396ai;
                }

                @Override // com.google.android.play.core.integrity.AbstractC0461y
                /* JADX INFO: renamed from: b */
                public final Task mo2454b(Activity activity, Bundle bundle) {
/* 5 */             return this.f5163a.f5164a.m2461b(activity, bundle);
                }
            }
