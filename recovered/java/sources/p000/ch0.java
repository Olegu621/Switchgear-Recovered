            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentSender;
            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.internal.p014authapi.zbe;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import io.flutter.plugin.common.MethodChannel;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ch0 implements Continuation, OnCompleteListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f2918a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f2919b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f2920c;

                public /* synthetic */ ch0(Object obj, Object obj2, boolean z) {
/* 1 */             this.f2919b = obj;
/* 3 */             this.f2920c = obj2;
/* 5 */             this.f2918a = z;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
                    Activity activity;
/* 3 */             MethodChannel.Result result = (MethodChannel.Result) this.f2919b;
/* 7 */             hf2 hf2Var = (hf2) this.f2920c;
/* 9 */             task.getClass();
/* 16 */            if (task.isSuccessful() && task.getResult() != null && ((zbe) ((n20) task.getResult()).f14103a).getCredential() != null) {
/* 40 */                Object result2 = task.getResult();
/* 44 */                result2.getClass();
/* 53 */                Credential credential = ((zbe) ((n20) result2).f14103a).getCredential();
/* 57 */                if (credential != null) {
/* 63 */                    result.success(hf2.m4206a(credential));
/* 66 */                    return;
                        }
                    }
/* 67 */            Exception exception = task.getException();
/* 73 */            if ((exception instanceof t32) && ((t32) exception).getStatusCode() == 6 && (activity = hf2Var.f9057b) != null && this.f2918a) {
                        try {
/* 93 */                    hf2Var.f9060e = result;
/* 99 */                    ((t32) exception).m8685a(activity, 11103);
/* 102 */                   return;
                        } catch (IntentSender.SendIntentException e) {
/* 108 */                   AbstractC1245n0.m4877e("Pinput/SmartAuth", "Failed to send resolution.", e);
                        }
                    }
/* 112 */           result.success(null);
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) {
                    return (j13.m5650l() && ((Integer) task.getResult()).intValue() == 402) ? C0210cb.m1565k((Context) this.f2919b, (Intent) this.f2920c, this.f2918a).continueWith(new qd1(), new s80(7)) : task;
                }
            }
