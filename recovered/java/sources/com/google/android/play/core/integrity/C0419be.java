            package com.google.android.play.core.integrity;

            import android.content.Context;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.ba3;
            import p000.ra3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.be */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0419be extends ra3 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Context f5205a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C0428bn f5206b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0419be(C0428bn c0428bn, TaskCompletionSource taskCompletionSource, Context context) {
/* 5 */             super(taskCompletionSource);
/* 1 */             this.f5205a = context;
/* 3 */             this.f5206b = c0428bn;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
/* 17 */            this.f5206b.f5232d.trySetResult(Integer.valueOf(ba3.m1310a(this.f5205a)));
                }
            }
