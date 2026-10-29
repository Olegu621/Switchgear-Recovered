            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
            import com.google.android.play.integrity.internal.AbstractBinderC0475q;
            import p000.C1020i9;
            import p000.qa3;
            import p000.z93;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.as */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class BinderC0406as extends AbstractBinderC0475q {

                /* JADX INFO: renamed from: a */
                final TaskCompletionSource f5185a;

                /* JADX INFO: renamed from: b */
                final z93 f5186b;

                /* JADX INFO: renamed from: c */
                private final qa3 f5187c;

                /* JADX INFO: renamed from: d */
                private final String f5188d;

                /* JADX INFO: renamed from: e */
                private final InterfaceC0445k f5189e;

                /* JADX INFO: renamed from: f */
                private final Activity f5190f;

                public BinderC0406as(Context context, InterfaceC0445k interfaceC0445k, Activity activity, TaskCompletionSource taskCompletionSource, z93 z93Var) {
/* 3 */             super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
/* 13 */            this.f5187c = new qa3("RequestDialogCallbackImpl");
/* 19 */            this.f5188d = context.getPackageName();
/* 21 */            this.f5189e = interfaceC0445k;
/* 23 */            this.f5185a = taskCompletionSource;
/* 25 */            this.f5190f = activity;
/* 27 */            this.f5186b = z93Var;
                }

                @Override // com.google.android.play.integrity.internal.InterfaceC0476r
                /* JADX INFO: renamed from: b */
                public final void mo2464b(Bundle bundle) {
/* 5 */             this.f5186b.m10291d(this.f5185a);
/* 18 */            this.f5187c.m7756b("onRequestDialog(%s)", this.f5188d);
/* 23 */            C1020i9 c1020i9Mo2494a = this.f5189e.mo2494a(bundle);
/* 27 */            if (c1020i9Mo2494a != null) {
/* 31 */                this.f5185a.trySetException(c1020i9Mo2494a);
/* 34 */                return;
                    }
/* 41 */            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
/* 46 */            if (pendingIntent == null) {
/* 48 */                qa3 qa3Var = this.f5187c;
/* 52 */                Object[] objArr = {this.f5188d};
/* 61 */                if (Log.isLoggable("PlayCore", 6)) {
/* 67 */                    qa3.m7754d(qa3Var.f15477a, "onRequestDialog(%s): got null dialog intent", objArr);
                        } else {
/* 71 */                    qa3Var.getClass();
                        }
/* 80 */                this.f5185a.trySetResult(0);
/* 83 */                return;
                    }
/* 90 */            Intent intent = new Intent(this.f5190f, (Class<?>) PlayCoreDialogWrapperActivity.class);
/* 95 */            intent.putExtra("confirmation_intent", pendingIntent);
/* 100 */           intent.setFlags(536870912);
/* 116 */           intent.putExtra("result_receiver", new ResultReceiverC0405ar(this, this.f5186b.m10289a()));
/* 119 */           qa3 qa3Var2 = this.f5187c;
/* 121 */           Object[] objArr2 = new Object[0];
/* 128 */           if (Log.isLoggable("PlayCore", 3)) {
/* 134 */               qa3.m7754d(qa3Var2.f15477a, "Starting dialog intent...", objArr2);
                    } else {
/* 138 */               qa3Var2.getClass();
                    }
/* 143 */           this.f5190f.startActivityForResult(intent, 0);
                }
            }
