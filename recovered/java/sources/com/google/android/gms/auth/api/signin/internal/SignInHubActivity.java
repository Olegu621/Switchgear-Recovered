            package com.google.android.gms.auth.api.signin.internal;

            import android.content.ActivityNotFoundException;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.view.accessibility.AccessibilityEvent;
            import androidx.fragment.app.FragmentActivity;
            import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.auth.api.signin.SignInAccount;
            import com.google.android.gms.common.api.Status;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Modifier;
            import java.util.Set;
            import p000.b91;
            import p000.c91;
            import p000.d91;
            import p000.e91;
            import p000.eh2;
            import p000.er0;
            import p000.f42;
            import p000.g71;
            import p000.lc3;
            import p000.qc3;
            import p000.tr0;
            import p000.vf2;
            import p000.zr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SignInHubActivity extends FragmentActivity {

                /* JADX INFO: renamed from: i */
                public static boolean f3403i;

                /* JADX INFO: renamed from: b */
                public boolean f3404b = false;

                /* JADX INFO: renamed from: c */
                public SignInConfiguration f3405c;

                /* JADX INFO: renamed from: d */
                public boolean f3406d;

                /* JADX INFO: renamed from: e */
                public int f3407e;

                /* JADX INFO: renamed from: f */
                public Intent f3408f;

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                /* JADX INFO: renamed from: d */
                public final void m1996d() {
/* 1 */             b91 supportLoaderManager = getSupportLoaderManager();
/* 9 */             er0 er0Var = new er0(this, 28);
/* 12 */            e91 e91Var = (e91) supportLoaderManager;
/* 14 */            g71 g71Var = e91Var.f7577a;
/* 16 */            d91 d91Var = e91Var.f7578b;
/* 18 */            boolean z = d91Var.f7067e;
/* 20 */            vf2 vf2Var = d91Var.f7066d;
/* 22 */            if (z) {
/* 166 */               f42.m3656l("Called while creating a loader");
/* 169 */               return;
                    }
/* 32 */            if (Looper.getMainLooper() != Looper.myLooper()) {
/* 160 */               f42.m3656l("initLoader must be called on the main thread");
/* 163 */               return;
                    }
/* 39 */            c91 c91Var = (c91) vf2Var.m9265b(0);
/* 41 */            if (c91Var == null) {
                        try {
/* 48 */                    d91Var.f7067e = true;
/* 52 */                    Set set = tr0.f17239a;
                            synchronized (set) {
                            }
/* 56 */                    lc3 lc3Var = new lc3(this, set);
/* 63 */                    if (lc3.class.isMemberClass() && !Modifier.isStatic(lc3.class.getModifiers())) {
/* 93 */                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + lc3Var);
                            }
/* 98 */                    c91 c91Var2 = new c91(lc3Var);
/* 101 */                   vf2Var.m9266c(0, c91Var2);
/* 104 */                   d91Var.f7067e = false;
/* 110 */                   zr3 zr3Var = new zr3(c91Var2.f2776l, er0Var);
/* 113 */                   c91Var2.m119e(g71Var, zr3Var);
/* 116 */                   zr3 zr3Var2 = c91Var2.f2778n;
/* 118 */                   if (zr3Var2 != null) {
/* 120 */                       c91Var2.mo123i(zr3Var2);
                            }
/* 123 */                   c91Var2.f2777m = g71Var;
/* 125 */                   c91Var2.f2778n = zr3Var;
                        } catch (Throwable th) {
/* 131 */                   d91Var.f7067e = false;
/* 133 */                   throw th;
                        }
                    } else {
/* 138 */               zr3 zr3Var3 = new zr3(c91Var.f2776l, er0Var);
/* 141 */               c91Var.m119e(g71Var, zr3Var3);
/* 144 */               zr3 zr3Var4 = c91Var.f2778n;
/* 146 */               if (zr3Var4 != null) {
/* 148 */                   c91Var.mo123i(zr3Var4);
                        }
/* 151 */               c91Var.f2777m = g71Var;
/* 153 */               c91Var.f2778n = zr3Var3;
                    }
/* 155 */           f3403i = false;
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: e */
                public final void m1997e(int i) {
/* 4 */             Status status = new Status(i, null, null, null);
/* 9 */             Intent intent = new Intent();
/* 14 */            intent.putExtra("googleSignInStatus", status);
/* 18 */            setResult(0, intent);
/* 21 */            finish();
/* 24 */            f3403i = false;
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
                public final void onActivityResult(int i, int i2, Intent intent) {
                    GoogleSignInAccount googleSignInAccount;
/* 3 */             if (this.f3404b) {
/* 15 */                return;
                    }
/* 7 */             setResult(0);
/* 13 */            if (i != 40962) {
/* 15 */                return;
                    }
/* 18 */            if (intent != null) {
/* 26 */                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
/* 28 */                if (signInAccount != null && (googleSignInAccount = signInAccount.f3396b) != null) {
/* 34 */                    qc3 qc3VarM7763m = qc3.m7763m(this);
/* 40 */                    GoogleSignInOptions googleSignInOptions = this.f3405c.f3402b;
                            synchronized (qc3VarM7763m) {
/* 47 */                        ((eh2) qc3VarM7763m.f15492b).m3435c(googleSignInAccount, googleSignInOptions);
                            }
/* 53 */                    intent.removeExtra("signInAccount");
/* 58 */                    intent.putExtra("googleSignInAccount", googleSignInAccount);
/* 62 */                    this.f3406d = true;
/* 64 */                    this.f3407e = i2;
/* 66 */                    this.f3408f = intent;
/* 68 */                    m1996d();
/* 71 */                    return;
                        }
/* 81 */                if (intent.hasExtra("errorCode")) {
/* 85 */                    int intExtra = intent.getIntExtra("errorCode", 8);
/* 91 */                    if (intExtra == 13) {
/* 93 */                        intExtra = 12501;
                            }
/* 95 */                    m1997e(intExtra);
/* 98 */                    return;
                        }
                    }
/* 99 */            m1997e(8);
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             Intent intent = getIntent();
/* 8 */             String action = intent.getAction();
/* 12 */            action.getClass();
/* 21 */            if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
/* 25 */                m1997e(12500);
/* 28 */                return;
                    }
/* 37 */            if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
/* 62 */                AbstractC1245n0.m4876d("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
/* 65 */                finish();
/* 68 */                return;
                    }
/* 71 */            Bundle bundleExtra = intent.getBundleExtra("config");
/* 75 */            bundleExtra.getClass();
/* 82 */            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
/* 85 */            if (signInConfiguration == null) {
/* 89 */                AbstractC1245n0.m4876d("AuthSignInClient", "Activity started with invalid configuration.");
/* 92 */                setResult(0);
/* 95 */                finish();
/* 98 */                return;
                    }
/* 99 */            this.f3405c = signInConfiguration;
/* 101 */           if (bundle != null) {
/* 170 */               boolean z = bundle.getBoolean("signingInGoogleApiClients");
/* 174 */               this.f3406d = z;
/* 176 */               if (z) {
/* 184 */                   this.f3407e = bundle.getInt("signInResultCode");
/* 192 */                   Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
/* 194 */                   intent2.getClass();
/* 197 */                   this.f3408f = intent2;
/* 199 */                   m1996d();
/* 202 */                   return;
                        }
/* 202 */               return;
                    }
/* 105 */           if (f3403i) {
/* 107 */               setResult(0);
/* 112 */               m1997e(12502);
/* 115 */               return;
                    }
/* 117 */           f3403i = true;
/* 121 */           Intent intent3 = new Intent(action);
/* 128 */           if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
/* 132 */               intent3.setPackage("com.google.android.gms");
                    } else {
/* 140 */               intent3.setPackage(getPackageName());
                    }
/* 145 */           intent3.putExtra("config", this.f3405c);
                    try {
/* 151 */               startActivityForResult(intent3, 40962);
                    } catch (ActivityNotFoundException unused) {
/* 155 */               this.f3404b = true;
/* 159 */               AbstractC1245n0.m4889q("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
/* 164 */               m1997e(17);
                    }
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 5 */             f3403i = false;
                }

                @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 8 */             bundle.putBoolean("signingInGoogleApiClients", this.f3406d);
/* 13 */            if (this.f3406d) {
/* 19 */                bundle.putInt("signInResultCode", this.f3407e);
/* 26 */                bundle.putParcelable("signInResultData", this.f3408f);
                    }
                }
            }
