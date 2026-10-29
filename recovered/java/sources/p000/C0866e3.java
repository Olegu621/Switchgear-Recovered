            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import androidx.activity.result.ActivityResult;
            import androidx.activity.result.IntentSenderRequest;
            import androidx.fragment.app.AbstractC0111w;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import kotlin.collections.CollectionsKt;
            
            /* JADX INFO: renamed from: e3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0866e3 extends AbstractC0830d3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7491a;

                public /* synthetic */ C0866e3(int i) {
/* 1 */             this.f7491a = i;
                }

                @Override // p000.AbstractC0830d3
                /* JADX INFO: renamed from: a */
                public final Intent mo2913a(Context context, Object obj) {
                    Bundle bundleExtra;
                    switch (this.f7491a) {
                        case 0:
/* 98 */                    String[] strArr = (String[]) obj;
/* 100 */                   strArr.getClass();
/* 112 */                   Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
/* 116 */                   intentPutExtra.getClass();
/* 119 */                   return intentPutExtra;
                        case 1:
/* 92 */                    Intent intent = (Intent) obj;
/* 94 */                    intent.getClass();
/* 97 */                    return intent;
                        case 2:
/* 74 */                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
/* 76 */                    intentSenderRequest.getClass();
/* 84 */                    Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
/* 88 */                    intentPutExtra2.getClass();
/* 91 */                    return intentPutExtra2;
                        default:
/* 10 */                    IntentSenderRequest intentSenderRequest2 = (IntentSenderRequest) obj;
/* 14 */                    Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
/* 17 */                    Intent intent3 = intentSenderRequest2.f354b;
/* 19 */                    if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
/* 29 */                        intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
/* 32 */                        intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
/* 42 */                        if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
/* 44 */                            IntentSender intentSender = intentSenderRequest2.f353a;
/* 46 */                            intentSender.getClass();
/* 56 */                            intentSenderRequest2 = new IntentSenderRequest(intentSender, null, intentSenderRequest2.f355c, intentSenderRequest2.f356d);
                                }
                            }
/* 60 */                    intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
/* 68 */                    if (AbstractC0111w.m674K(2)) {
/* 70 */                        intent2.toString();
                            }
/* 73 */                    return intent2;
                    }
                }

                @Override // p000.AbstractC0830d3
                /* JADX INFO: renamed from: b */
                public qc3 mo2914b(Context context, Object obj) {
                    switch (this.f7491a) {
                        case 0:
/* 11 */                    String[] strArr = (String[]) obj;
/* 13 */                    strArr.getClass();
/* 17 */                    int i = 5;
/* 18 */                    if (strArr.length == 0) {
/* 22 */                        od0 od0Var = od0.f14715a;
/* 24 */                        od0Var.getClass();
/* 27 */                        return new qc3(od0Var, i);
                            }
/* 34 */                    for (String str : strArr) {
/* 42 */                        if (v00.checkSelfPermission(context, str) != 0) {
/* 47 */                            return null;
                                }
                            }
/* 50 */                    int iM6962c = nc1.m6962c(strArr.length);
/* 56 */                    if (iM6962c < 16) {
/* 58 */                        iM6962c = 16;
                            }
/* 61 */                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 65 */                    for (String str2 : strArr) {
/* 71 */                        linkedHashMap.put(str2, Boolean.TRUE);
                            }
/* 79 */                    return new qc3(linkedHashMap, i);
                        default:
/* 6 */                     return super.mo2914b(context, obj);
                    }
                }

                @Override // p000.AbstractC0830d3
                /* JADX INFO: renamed from: c */
                public final Object mo2915c(int i, Intent intent) {
                    switch (this.f7491a) {
                        case 0:
/* 25 */                    if (i != -1) {
/* 27 */                        od0 od0Var = od0.f14715a;
/* 29 */                        od0Var.getClass();
/* 104 */                       return od0Var;
                            }
/* 33 */                    if (intent == null) {
/* 35 */                        od0 od0Var2 = od0.f14715a;
/* 37 */                        od0Var2.getClass();
/* 104 */                       return od0Var2;
                            }
/* 43 */                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
/* 49 */                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
/* 53 */                    if (intArrayExtra == null || stringArrayExtra == null) {
/* 99 */                        od0 od0Var3 = od0.f14715a;
/* 101 */                       od0Var3.getClass();
/* 104 */                       return od0Var3;
                            }
/* 61 */                    ArrayList arrayList = new ArrayList(intArrayExtra.length);
/* 67 */                    for (int i2 : intArrayExtra) {
/* 80 */                        arrayList.add(Boolean.valueOf(i2 == 0));
                            }
/* 94 */                    return oc1.m7133g(CollectionsKt.m6196O(C2103qd.m7773h(stringArrayExtra), arrayList));
                        case 1:
/* 20 */                    return new ActivityResult(i, intent);
                        case 2:
/* 14 */                    return new ActivityResult(i, intent);
                        default:
/* 8 */                     return new ActivityResult(i, intent);
                    }
                }
            }
