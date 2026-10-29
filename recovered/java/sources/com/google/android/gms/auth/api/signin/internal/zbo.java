            package com.google.android.gms.auth.api.signin.internal;

            import android.content.Context;
            import android.os.Parcel;
            import android.text.TextUtils;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.auth.api.signin.RevocationBoundService;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            import com.google.android.gms.internal.p014authapi.zbb;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import org.json.JSONException;
            import p000.AbstractC0213ce;
            import p000.eb3;
            import p000.eh2;
            import p000.fc3;
            import p000.ha1;
            import p000.hc3;
            import p000.jc3;
            import p000.kb1;
            import p000.oc3;
            import p000.p62;
            import p000.pc3;
            import p000.qc3;
            import p000.tr0;
            import p000.xt0;
            import p000.zb3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zbo extends zbb implements zbp {
                @Override // com.google.android.gms.internal.p014authapi.zbb
                public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
                    BasePendingResult basePendingResultDoWrite;
                    String strM3436d;
/* 3 */             if (i != 1) {
/* 6 */                 if (i != 2) {
/* 1 */                     return false;
                        }
/* 9 */                 zbt zbtVar = (zbt) this;
/* 11 */                zbtVar.m1999a();
/* 20 */                qc3.m7763m(zbtVar.f3409a).m7770n();
/* 2 */                 return true;
                    }
/* 24 */            zbt zbtVar2 = (zbt) this;
/* 26 */            zbtVar2.m1999a();
/* 29 */            RevocationBoundService revocationBoundService = zbtVar2.f3409a;
/* 31 */            eh2 eh2VarM3432a = eh2.m3432a(revocationBoundService);
/* 35 */            GoogleSignInAccount googleSignInAccountM3434b = eh2VarM3432a.m3434b();
/* 39 */            GoogleSignInOptions googleSignInOptionsM1994D1 = GoogleSignInOptions.f3379V;
/* 42 */            if (googleSignInAccountM3434b != null) {
/* 46 */                String strM3436d2 = eh2VarM3432a.m3436d("defaultGoogleSignInAccount");
/* 54 */                if (TextUtils.isEmpty(strM3436d2) || (strM3436d = eh2VarM3432a.m3436d(eh2.m3433f("googleSignInOptions", strM3436d2))) == null) {
/* 75 */                    googleSignInOptionsM1994D1 = null;
                        } else {
                            try {
/* 69 */                        googleSignInOptionsM1994D1 = GoogleSignInOptions.m1994D1(strM3436d);
                            } catch (JSONException unused) {
/* 75 */                        googleSignInOptionsM1994D1 = null;
                            }
                        }
                    }
/* 78 */            kb1.m6061n(googleSignInOptionsM1994D1);
/* 90 */            fc3 fc3Var = new fc3(revocationBoundService, AbstractC0213ce.f2859b, googleSignInOptionsM1994D1, new xt0(16));
/* 93 */            if (googleSignInAccountM3434b != null) {
/* 95 */                tr0 tr0VarAsGoogleApiClient = fc3Var.asGoogleApiClient();
/* 99 */                Context applicationContext = fc3Var.getApplicationContext();
/* 112 */               boolean z = fc3Var.m3715d() == 3;
/* 113 */               ha1 ha1Var = pc3.f15068a;
/* 115 */               Object[] objArr = new Object[0];
/* 119 */               if (ha1Var.f8985c <= 3) {
/* 123 */                   ha1Var.m4137a("Revoking access", objArr);
                        }
/* 132 */               String strM3436d3 = eh2.m3432a(applicationContext).m3436d("refreshToken");
/* 136 */               pc3.m7388a(applicationContext);
/* 139 */               if (!z) {
/* 195 */                   basePendingResultDoWrite = ((eb3) tr0VarAsGoogleApiClient).f7609b.doWrite(new oc3(tr0VarAsGoogleApiClient, 1));
                        } else if (strM3436d3 == null) {
/* 143 */                   ha1 ha1Var2 = jc3.f12219c;
/* 148 */                   Status status = new Status(4, null, null, null);
/* 158 */                   kb1.m6053f("Status code must not be SUCCESS", !status.m2006D1());
/* 163 */                   basePendingResultDoWrite = new zb3(status);
/* 166 */                   basePendingResultDoWrite.setResult(status);
                        } else {
/* 172 */                   jc3 jc3Var = new jc3(strM3436d3);
/* 180 */                   new Thread(jc3Var).start();
/* 183 */                   basePendingResultDoWrite = jc3Var.f12221b;
                        }
/* 203 */               p62 p62Var = new p62(11);
/* 208 */               TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 216 */               basePendingResultDoWrite.addStatusListener(new hc3(basePendingResultDoWrite, taskCompletionSource, p62Var));
/* 219 */               taskCompletionSource.getTask();
                    } else {
/* 223 */               fc3Var.signOut();
                    }
/* 2 */             return true;
                }
            }
