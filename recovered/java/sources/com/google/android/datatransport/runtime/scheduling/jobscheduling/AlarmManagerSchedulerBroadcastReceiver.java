            package com.google.android.datatransport.runtime.scheduling.jobscheduling;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Base64;
            import java.util.concurrent.Executor;
            import p000.C0875ec;
            import p000.C2497yg;
            import p000.RunnableC0981h7;
            import p000.f31;
            import p000.rx1;
            import p000.sy2;
            import p000.yr2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f3124a = 0;

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
/* 7 */             String queryParameter = intent.getData().getQueryParameter("backendName");
/* 17 */            String queryParameter2 = intent.getData().getQueryParameter("extras");
/* 35 */            int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
/* 45 */            int i = intent.getExtras().getInt("attemptNumber");
/* 49 */            yr2.m10174b(context);
/* 52 */            C0875ec c0875ecM10147a = C2497yg.m10147a();
/* 56 */            c0875ecM10147a.m3373L(queryParameter);
/* 63 */            c0875ecM10147a.f7615d = rx1.m8317b(iIntValue);
/* 66 */            if (queryParameter2 != null) {
/* 72 */                c0875ecM10147a.f7614c = Base64.decode(queryParameter2, 0);
                    }
/* 78 */            f31 f31Var = yr2.m10173a().f19784d;
/* 98 */            ((Executor) f31Var.f7987e).execute(new sy2(f31Var, c0875ecM10147a.m3390m(), i, new RunnableC0981h7(0)));
                }
            }
