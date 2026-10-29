            package com.google.android.gms.internal.p014authapi;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
            import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
            import com.google.android.gms.auth.api.identity.SavePasswordRequest;
            import com.google.android.gms.auth.api.identity.SavePasswordResult;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.ArrayList;
            import java.util.List;
            import p000.AbstractC2322w8;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.c32;
            import p000.i13;
            import p000.kb1;
            import p000.kc3;
            import p000.nr0;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class zbao extends or0 {
                private static final C0872e9 zba;
                private static final AbstractC2322w8 zbb;
                private static final C0983h9 zbc;
                private final String zbd;

                static {
/* 3 */             C0872e9 c0872e9 = new C0872e9();
/* 6 */             zba = c0872e9;
/* 10 */            zbal zbalVar = new zbal();
/* 13 */            zbb = zbalVar;
/* 22 */            zbc = new C0983h9("Auth.Api.Identity.CredentialSaving.API", zbalVar, c0872e9);
                }

                public zbao(Activity activity, kc3 kc3Var) {
/* 9 */             super(activity, activity, zbc, kc3Var, nr0.f14414c);
/* 16 */            this.zbd = zbbb.zba();
                }

                public final Status getStatusFromIntent(Intent intent) {
                    Status status;
/* 1 */             Status status2 = Status.f3442i;
                    return (intent == null || (status = (Status) i13.m4435m(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR)) == null) ? status2 : status;
                }

                public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
/* 1 */             kb1.m6061n(saveAccountLinkingTokenRequest);
/* 6 */             new ArrayList();
/* 9 */             List list = saveAccountLinkingTokenRequest.f3335d;
/* 11 */            String str = saveAccountLinkingTokenRequest.f3334c;
/* 13 */            PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f3332a;
/* 15 */            String str2 = saveAccountLinkingTokenRequest.f3333b;
/* 17 */            int i = saveAccountLinkingTokenRequest.f3337f;
/* 21 */            TextUtils.isEmpty(saveAccountLinkingTokenRequest.f3336e);
/* 24 */            String str3 = this.zbd;
/* 35 */            kb1.m6053f("Consent PendingIntent cannot be null", pendingIntent != null);
/* 46 */            kb1.m6053f("Invalid tokenType", "auth_code".equals(str2));
/* 56 */            kb1.m6053f("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
/* 65 */            kb1.m6053f("scopes cannot be null", list != null);
/* 70 */            final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i);
/* 73 */            tm2 tm2VarBuilder = um2.builder();
/* 83 */            tm2VarBuilder.f17187c = new Feature[]{zbba.zbg};
/* 90 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api.zbaj
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zbao zbaoVar = this.zba;
/* 3 */                     SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
/* 11 */                    zbam zbamVar = new zbam(zbaoVar, (TaskCompletionSource) obj2);
/* 18 */                    zbz zbzVar = (zbz) ((zbw) obj).getService();
/* 20 */                    kb1.m6061n(saveAccountLinkingTokenRequest3);
/* 23 */                    zbzVar.zbc(zbamVar, saveAccountLinkingTokenRequest3);
                        }
                    };
/* 92 */            tm2VarBuilder.f17186b = false;
/* 96 */            tm2VarBuilder.f17188d = 1535;
/* 102 */           return doRead(tm2VarBuilder.m8812a());
                }

                public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
/* 1 */             kb1.m6061n(savePasswordRequest);
/* 12 */            final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.f3339a, this.zbd, savePasswordRequest.f3341c);
/* 15 */            tm2 tm2VarBuilder = um2.builder();
/* 25 */            tm2VarBuilder.f17187c = new Feature[]{zbba.zbe};
/* 32 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api.zbak
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zbao zbaoVar = this.zba;
/* 3 */                     SavePasswordRequest savePasswordRequest3 = savePasswordRequest2;
/* 11 */                    zban zbanVar = new zban(zbaoVar, (TaskCompletionSource) obj2);
/* 18 */                    zbz zbzVar = (zbz) ((zbw) obj).getService();
/* 20 */                    kb1.m6061n(savePasswordRequest3);
/* 23 */                    zbzVar.zbd(zbanVar, savePasswordRequest3);
                        }
                    };
/* 35 */            tm2VarBuilder.f17186b = false;
/* 39 */            tm2VarBuilder.f17188d = 1536;
/* 45 */            return doRead(tm2VarBuilder.m8812a());
                }

/* 18 */        public zbao(Context context, kc3 kc3Var) {
/* 20 */            super(context, null, zbc, kc3Var, nr0.f14414c);
/* 21 */            this.zbd = zbbb.zba();
                }
            }
