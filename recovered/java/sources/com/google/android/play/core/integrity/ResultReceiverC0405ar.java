            package com.google.android.play.core.integrity;

            import android.os.Bundle;
            import android.os.Handler;
            import android.os.ResultReceiver;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.ar */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class ResultReceiverC0405ar extends ResultReceiver {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ BinderC0406as f5184a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ResultReceiverC0405ar(BinderC0406as binderC0406as, Handler handler) {
/* 3 */             super(handler);
/* 1 */             this.f5184a = binderC0406as;
                }

                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
/* 3 */             if (i == 1) {
/* 43 */                this.f5184a.f5185a.trySetResult(3);
                    } else if (i == 2) {
/* 31 */                this.f5184a.f5185a.trySetResult(2);
                    } else {
/* 8 */                 if (i != 3) {
/* 10 */                    return;
                        }
/* 19 */                this.f5184a.f5185a.trySetResult(1);
                    }
                }
            }
