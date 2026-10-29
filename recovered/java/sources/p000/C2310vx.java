            package p000;

            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import androidx.activity.ComponentActivity;
            import androidx.activity.result.IntentSenderRequest;
            
            /* JADX INFO: renamed from: vx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2310vx extends AbstractC1816k3 {

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ComponentActivity f18382h;

                public C2310vx(ComponentActivity componentActivity) {
/* 1 */             this.f18382h = componentActivity;
                }

                @Override // p000.AbstractC1816k3
                /* JADX INFO: renamed from: b */
                public final void mo5938b(int i, AbstractC0830d3 abstractC0830d3, Object obj) {
                    Bundle bundleExtra;
                    int i2;
/* 1 */             ComponentActivity componentActivity = this.f18382h;
/* 3 */             qc3 qc3VarMo2914b = abstractC0830d3.mo2914b(componentActivity, obj);
/* 7 */             if (qc3VarMo2914b != null) {
/* 24 */                new Handler(Looper.getMainLooper()).post(new RunnableC2064pb(this, i, qc3VarMo2914b, 2));
/* 27 */                return;
                    }
/* 28 */            Intent intentMo2913a = abstractC0830d3.mo2913a(componentActivity, obj);
/* 36 */            if (intentMo2913a.getExtras() != null && intentMo2913a.getExtras().getClassLoader() == null) {
/* 52 */                intentMo2913a.setExtrasClassLoader(componentActivity.getClassLoader());
                    }
/* 61 */            if (intentMo2913a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
/* 63 */                bundleExtra = intentMo2913a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
/* 67 */                intentMo2913a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    } else {
/* 72 */                bundleExtra = null;
                    }
/* 70 */            Bundle bundle = bundleExtra;
/* 84 */            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo2913a.getAction())) {
/* 88 */                String[] stringArrayExtra = intentMo2913a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
/* 92 */                if (stringArrayExtra == null) {
/* 95 */                    stringArrayExtra = new String[0];
                        }
/* 97 */                AbstractC2353x2.m9683a(componentActivity, stringArrayExtra, i);
/* 100 */               return;
                    }
/* 111 */           if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo2913a.getAction())) {
/* 161 */               componentActivity.startActivityForResult(intentMo2913a, i, bundle);
/* 164 */               return;
                    }
/* 119 */           IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo2913a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
/* 130 */               i2 = i;
                        try {
/* 131 */                   componentActivity.startIntentSenderForResult(intentSenderRequest.f353a, i2, intentSenderRequest.f354b, intentSenderRequest.f355c, intentSenderRequest.f356d, 0, bundle);
                        } catch (IntentSender.SendIntentException e) {
/* 135 */                   e = e;
/* 156 */                   new Handler(Looper.getMainLooper()).post(new RunnableC2064pb(this, i2, e, 3));
                        }
                    } catch (IntentSender.SendIntentException e2) {
/* 138 */               e = e2;
/* 139 */               i2 = i;
                    }
                }
            }
