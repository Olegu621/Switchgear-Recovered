            package com.google.android.play.core.integrity;

            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.aa3;
            import p000.ra3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class AbstractC0427bm extends ra3 {

                /* JADX INFO: renamed from: f */
                final /* synthetic */ C0428bn f5228f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AbstractC0427bm(C0428bn c0428bn, TaskCompletionSource taskCompletionSource) {
/* 3 */             super(taskCompletionSource);
/* 1 */             this.f5228f = c0428bn;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: a */
                public final void mo2452a(Exception exc) {
/* 3 */             if (!(exc instanceof aa3)) {
/* 5 */                 super.mo2452a(exc);
                    } else if (C0428bn.m2488l(this.f5228f)) {
/* 23 */                super.mo2452a(new StandardIntegrityException(-2, exc));
                    } else {
/* 34 */                super.mo2452a(new StandardIntegrityException(-9, exc));
                    }
                }
            }
