            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
            import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
            import com.google.android.gms.auth.api.signin.internal.zbs;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.internal.p014authapi.zbbb;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mc3 extends kr0 {

                /* JADX INFO: renamed from: a */
                public final GoogleSignInOptions f13700a;

                public mc3(Context context, Looper looper, C2345wv c2345wv, GoogleSignInOptions googleSignInOptions, rr0 rr0Var, sr0 sr0Var) {
                    zr0 zr0Var;
/* 15 */            super(context, looper, 91, c2345wv, rr0Var, sr0Var);
/* 18 */            Set<Scope> set = c2345wv.f18825c;
/* 20 */            if (googleSignInOptions != null) {
/* 24 */                zr0Var = new zr0();
/* 32 */                zr0Var.f20299d = new HashSet();
/* 39 */                zr0Var.f20304i = new HashMap();
/* 48 */                zr0Var.f20299d = new HashSet(googleSignInOptions.f3387b);
/* 52 */                zr0Var.f20296a = googleSignInOptions.f3390e;
/* 56 */                zr0Var.f20297b = googleSignInOptions.f3391f;
/* 60 */                zr0Var.f20298c = googleSignInOptions.f3389d;
/* 64 */                zr0Var.f20300e = googleSignInOptions.f3392i;
/* 68 */                zr0Var.f20303h = googleSignInOptions.f3388c;
/* 72 */                zr0Var.f20301f = googleSignInOptions.f3393v;
/* 80 */                zr0Var.f20304i = GoogleSignInOptions.m1995E1(googleSignInOptions.f3394w);
/* 84 */                zr0Var.f20302g = googleSignInOptions.f3385U;
                    } else {
/* 89 */                zr0Var = new zr0();
/* 97 */                zr0Var.f20299d = new HashSet();
/* 104 */               zr0Var.f20304i = new HashMap();
                    }
/* 110 */           zr0Var.f20302g = zbbb.zba();
/* 116 */           if (!set.isEmpty()) {
/* 126 */               for (Scope scope : set) {
/* 139 */                   HashSet hashSet = (HashSet) zr0Var.f20299d;
/* 141 */                   hashSet.add(scope);
/* 148 */                   hashSet.addAll(Arrays.asList(new Scope[0]));
                        }
                    }
/* 154 */           HashSet hashSet2 = (HashSet) zr0Var.f20299d;
/* 162 */           if (hashSet2.contains(GoogleSignInOptions.f3383Z)) {
/* 164 */               Scope scope2 = GoogleSignInOptions.f3382Y;
/* 170 */               if (hashSet2.contains(scope2)) {
/* 172 */                   hashSet2.remove(scope2);
                        }
                    }
/* 177 */           if (zr0Var.f20298c && (((Account) zr0Var.f20303h) == null || !hashSet2.isEmpty())) {
/* 193 */               hashSet2.add(GoogleSignInOptions.f3381X);
                    }
/* 238 */           this.f13700a = new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) zr0Var.f20303h, zr0Var.f20298c, zr0Var.f20296a, zr0Var.f20297b, (String) zr0Var.f20300e, (String) zr0Var.f20301f, (HashMap) zr0Var.f20304i, (String) zr0Var.f20302g);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                    return iInterfaceQueryLocalInterface instanceof zbs ? (zbs) iInterfaceQueryLocalInterface : new zbs(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.auth.api.signin.internal.ISignInService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Intent getSignInIntent() {
/* 1 */             Context context = getContext();
/* 5 */             ha1 ha1Var = pc3.f15068a;
/* 8 */             Object[] objArr = new Object[0];
/* 13 */            if (ha1Var.f8985c <= 3) {
/* 17 */                ha1Var.m4137a("getSignInIntent()", objArr);
                    }
/* 28 */            SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f13700a);
/* 35 */            Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
/* 42 */            intent.setPackage(context.getPackageName());
/* 47 */            intent.setClass(context, SignInHubActivity.class);
/* 52 */            Bundle bundle = new Bundle();
/* 57 */            bundle.putParcelable("config", signInConfiguration);
/* 60 */            intent.putExtra("config", bundle);
/* 63 */            return intent;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.auth.api.signin.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean providesSignIn() {
/* 1 */             return true;
                }
            }
